
package models;

import java.util.ArrayList;
import java.util.List;
import play.data.validation.Constraints;
import play.mvc.*;
import javax.persistence.*;
import io.ebean.*;

/**
 *
 * @author jjons
 */

@Entity
public class Contact extends Model {

    @Id
    public Long id;

    @Constraints.Required
    public String name;

    @Constraints.Required
    public String phone;

    public Contact() {

    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String toString() {
        return String.format("%s - %s", name, phone);
    }

    public static Finder<Long, Contact> find = new Finder<Long, Contact>(Contact.class);

}

