
package controllers;

import play.mvc.*;
import java.util.List;
import models.Contact;
import play.data.FormFactory;
import javax.inject.Inject;
import play.data.Form;
import play.mvc.Http;

/**
 *
 * @author jjons
 */

public class Contacts extends Controller {
    
    private Form<Contact> contactForm;

    @Inject
    public Contacts(FormFactory formFactory) {
        this.contactForm = formFactory.form(Contact.class);
    }

    public Result list() { //List all contacts

        List<Contact> contacts = Contact.find.all();
        return ok(views.html.contacts.list.render(contacts));
    }
    
    public Result newContact() { //Show a new contact form

        return ok(views.html.contacts.details.render(contactForm, "New Contact"));
    }

    public Result details(Long Id) { //Show a contact edit form

        final Contact contact = Contact.find.byId(Id);
        if (contact == null) {
            return notFound(String.format("Contact does not exist."));
        }
        
        Form<Contact> filledForm = contactForm.fill(contact);
        return ok(views.html.contacts.details.render(filledForm, "Edit Contact"));
    }
    
    public Result save() { //Save a contact

        Form<Contact> boundForm = contactForm.bindFromRequest();
        if(boundForm.hasErrors()) {
            flash("error", "Please correct the form below. ");
            return badRequest(views.html.contacts.details.render(boundForm, "Validation Error"));
        }

        Contact contact = boundForm.get();

        if (contact.id == null) {
          contact.save();
        } else {
            contact.update();
        }

        flash("success", String.format("Successfully added contact %s", contact));
            
        return redirect(routes.Contacts.list());
    }
    
    public Result delete(Long Id) { //Delete a contact

        final Contact contact = Contact.find.byId(Id);
        
        contact.delete();
        return redirect(routes.Contacts.list());
    }

}


