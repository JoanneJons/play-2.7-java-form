# play-2.7-java-form
## Steps to make a simple Java form using Play 2.7

1. Install sbt

    https://www.scala-sbt.org/release/docs/Setup.html

2. Create a Play project

    Create a new project using a giter8 template: 
    <pre><code>sbt new playframework/play-java-seed.g8</code></pre> 
    https://www.playframework.com/documentation/2.7.x/NewApplication

3. Create a Controller class

    In the folder /app/controllers, under the controllers package, add a controller called Contacts.java which extends the Controller class. (play.mvc.Controller)

4. Add methods to the Controller

    Add the following public methods to Contacts class:
    <pre><code>
    public Result list() { } //List all contacts 
    public Result newContact() { } //Show a blank contact form 
    public Result details(Long id) { } //Show a contact edit form 
    public Result save() { } //Save a contact
    </code></pre>

    For the time being, make all the methods return TODO()

5. Add routes

    Go to /conf/routes and add the following routes:
    <pre><code>
    GET    /contacts       controllers.HomeController.index
    GET    /contacts/      controllers.Contacts.list()
    GET    /contacts/new   controllers.Contacts.newContact()
    GET    /contacts/:id   controllers.Contacts.details(id: Long)
    POST   /contacts/      controllers.Contacts.save()
    </code></pre>

    Try them out : 

    <code>sbt run</code><br>
    Go to http://localhost:9000/contacts/

6. Create a model class

    Create a model class called Contact under the models package /app/models/Contact.java

    Create the following attributes in the Contact class : 
    
    <pre><code>
    public Long id;
    public String name;
    public String phone;
    </code></pre>

    Create public getters and setters for the above 3 attributes and create a Finder object.

7. Map Contact enitity using Ebean

    Import io.ebean.* and javax.persistence.* in Contact.java Annotate Contact as @Entity, Id as @Id and name & phone as @Constraints.required (play.data.validation.Constraints)

    Assign database configuration driver, url, username & password in /conf/application.conf

    Add jdbc library dependency and ebean dependency in build.sbt
    
    Add sbt plugin for ebean in /project/target/plugins.sbt

8. Create the list template
    
    The /app/views folder now contains index.scala.html and main.scala.html. Create a new folder called ‘contacts’ and create a new view template list.scala.html

    Pass contacts as a parameter to the template. @(contacts: List[Contact]
    
    Pass the entire view to the @content of the main view

    Format the page using Bootstrap. Add the bootstrap files to /app/bootstrap
    https://getbootstrap.com/docs/4.3/getting-started/download/

9. Render the list template

    Call find.all() to get the entire list of contacts from the database and render the list. Pass the rendered list to the list template using ok()

10. Add the Contact form

    Create a view template details.scala.html in /app/views/contacts

    Pass contactForm and action as parameters

    Format the template using Bootstrap

11. Construct and render the Contact form object

    Create a dependency injection
    <pre><code>public Contacts(FormFactory formFactory) { this.contactForm = formFactory.form(Contact.class); }
    </code></pre>

    Create a Form object and render the same and pass it to the details template using ok() for a New Contact form.

    Create a Form object and use fill() to get the details of the contact with the given Id. Render the same and pass it to the details template using ok() for an Edit Contact form.

12. Handle the form submission

    Check for validation errors

    If the object already has an id, call update(), else call save()

    Redirect to the list view

13. The Delete action

    With a RESTful interface, this should be a DELETE operation. Use JavaScript to send a DELETE request.

    Add a DELETE route to /conf/routes

    <pre><code>DELETE    /contacts/:id   controllers.Contacts.delete(id: Long)
    </code></pre>

    The Contacts.delete() method finds the contact by Id and calls delete()

## Running the application

<code>sbt run</code><br>
Go to http://localhost:9000/contacts/

 
  
 
  
  
