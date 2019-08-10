# play-2.7-java-form

## Steps to make a simple Java form using Play 2.7

<ol>
  <li><strong>Install sbt</strong> : https://www.scala-sbt.org/release/docs/Setup.html</li><br  />
  <li><strong>Create a Play project</strong> : <br />
    Create a new project using a giter8 template : <br />
    <pre><code>sbt new playframework/play-java-seed.g8</code></pre>
    https://www.playframework.com/documentation/2.7.x/NewApplication</li> <br  />
  <li><strong>Create a Controller class</strong><br />
    In the folder /app/controllers, under the controllers package, add a controller called Contacts.java which extends the Controller class. (play.mvc.Controller)
  </li><br  />
  <li><strong>Add methods to the Controller</strong><br />
    Add the following public methods to Contacts class : 
      <pre><code>public Result list() { } //List all contacts <br />
public Result newContact() { } //Show a blank contact form <br />
public Result details(Long id) { } //Show a contact edit form <br />
public Result save() { } //Save a contact</code></pre>
      For the time being, make all the methods return TODO()
  </li><br  />
  <li><strong>Add routes</strong><br />
    Go to /conf/routes and add the following routes<br />
      <pre><code> GET    /contacts       controllers.HomeController.index</br />
 GET    /contacts/      controllers.Contacts.list()<br />
 GET    /contacts/new   controllers.Contacts.newContact()<br />
 GET    /contacts/:id   controllers.Contacts.details(id: Long)<br />
 POST   /contacts/      controllers.Contacts.save()</code></pre><br  />
    Try them out : <br />
    <code>sbt run</code><br />
    Go to http://localhost:9000/contacts/
  </li><br />
  <li><strong>Create a model class</strong><br />
    Create a model class called Contact under the models package<br />
    /app/models/Contact.java <br />
    Create the following attributes in the Contact class : <br />
    <pre><code>public Long id;
public String name;
public String phone;</code></pre>
    Create public getters and setters for the above 3 attributes and create a Finder object.
  </li>
  <li><strong>Map Contact enitity using Ebean</strong><br />
  <ul>
    <li>Import io.ebean.* and javax.persistence.* in Contact.java</li>
    <li>Annotate Contact as @Entity, Id as @Id and name & phone as @Constraints.required <br /> (play.data.validation.Constraints)</li>
    <li>Assign database configuration driver, url, username & password in /conf/application.conf
    </li>
    <li>Add jdbc library dependency and ebean dependency in build.sbt</li>
    <li>Add sbt plugin for ebean in /project/target/plugins.sbt</li>
  </ul>
  </li>
  <li><strong>Create the list template</strong><br />
  <ul>
    <li>The /app/views folder now contains index.scala.html and main.scala.html. Create a new folder called ‘contacts’ and create a new view template list.scala.html</li>
    <li>Pass contacts as a parameter to the template. @(contacts: List[Contact]</li>
    <li>Pass the entire view to the @content of the main view</li>
    <li>Format the page using Bootstrap. Add the bootstrap files to /app/bootstrap<br  />https://getbootstrap.com/docs/4.3/getting-started/download/</li>
  </ul>
  </li>
  <li><strong>Render the list template</strong><br />
  Call find.all() to get the entire list of contacts from the database and render the list. Pass the rendered list to the list template using ok()
  </li>
  <li><strong>Add the Contact form </strong><br />
  <ul>
    <li>Create a view template details.scala.html in /app/views/contacts</li>
    <li>Pass contactForm and action as parameters</li>
    <li>Format the template using Bootstrap</li>
  </ul>
 </li>
 <li><strong>Construct and render the Contact form object</strong><br />
  <ul>
    <li>Create a dependency injection<br />
    <pre><code>public Contacts(FormFactory formFactory) { this.contactForm = formFactory.form(Contact.class); }</code></pre></li>
    <li>Create a Form<Contact> object and render the same and pass it to the details template using ok() for a New Contact form. </li>
    <li>Create a Form<Contact> object and use fill() to get the details of the contact with the given Id. Render the same and pass it to the details template using ok() for an Edit Contact form</li>
  </ul>
 </li>
 <li><strong>Handle the form submission</strong><br />
  <ul>
    <li>Check for validation errors</li>
    <li>If the object already has an id, call update(), else call save()</li>
    <li>Redirect to the list view</li>
  </ul>
 </li>
 <li><strong>The Delete action</strong><br />
  <ul>
    <li>With a RESTful interface, this should be a DELETE operation. Use JavaScript to send a DELETE request.</li>
    <li>Add a DELETE route to /conf/routes<br />
      <pre><code>DELETE    /contacts/:id   controllers.Contacts.delete(id: Long)</code></pre></li>
    <li>The Contacts.delete() method finds the contact by Id and calls delete()</li>
  </ul>
 </li>
 
  
 
  
  
