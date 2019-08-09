# play-2.7-java-form

## Steps to make a simple Java form using Play 2.7

<ol>
  <li><strong>Install sbt</strong> : https://www.scala-sbt.org/release/docs/Setup.html</li><br  />
  <li><strong>Create a Play project</strong> : <br />
    Create a new project using a giter8 template : <br />
    <pre><code>sbt new playframework/play-java-seed.g8</code></pre>
    https://www.playframework.com/documentation/2.7.x/NewApplication</li> <br  />
  <li><strong>Create a Controller class</strong><br />
    In the folder /app/controllers, under the controllers package, add a controller called Contacts.java which extends the Controller class. (<code>play.mvc.Controller</code>)
  </li><br  />
  <li><strong>Add methods to the Controller</strong><br />
    Add the following public methods to Contacts class : 
      <pre><code>
      public Result list() { } //List all contacts <br />
      public Result newContact() { } //Show a blank contact form <br />
      public Result details(Long id) { } //Show a contact edit form <br />
      public Result save() { } //Save a contact</code></pre>
      For the time being, make all the methods return TODO()
  </li><br  />
  <li><strong>Add routes</strong><br />
    Go to /conf/routes and add the following routes<br />
      <code>GET   /contacts       controllers.HomeController.index </code></br />
      <code>GET   /contacts/      controllers.Contacts.list() </code><br />
      <code>GET   /contacts/new	  controllers.Contacts.newContact() </code><br />
      <code>GET   /contacts/:id		controllers.Contacts.details(id: Long) </code><br />
      <code>POST	/contacts/		  controllers.Contacts.save() </code><br  />
    Try them out : <br />
    <code>sbt run</code><br />
    Go to http://localhost:9000/contacts/
  </li><br />
  <li><strong>Create a model class</strong><br />
    Create a model class called Contact under the models package<br />
    /app/models/Contact.java <br />
    Create the following attributes in the Contact class : <br />
    <ul>
      <li><code>public Long id</code></li>
      <li><code>public String name</code></li>
      <li><code>public String phone</code></li>
    </ul>
    Create public getters and setters for the above 3 attributes and create a Finder object.
  </li>
  <li><strong>Map Contact enitity using Ebean</strong><br />
  <ul>
    <li>Import <code>io.ebean.*</code> and <code>javax.persistence.*</code> in Contact.java</li>
    <li>Annotate Contact as <code>@Entity</code>, Id as <code>@Id</code> and name & phone as <code>@Constraints.required</code>.   (<code>play.data.validation.Constraints</code>)</li>
    <li>Assign database configuration driver, url, username & password in <code>/conf/application.conf</code>
    </li>
    <li>Add jdbc library dependency and ebean dependency in <code>build.sbt</code></li>
    <li>Add sbt plugin for ebean in <code>/project/target/plugins.sbt</code></li>
  </ul>
  </li>
  <li><strong>Create the list template</strong><br />
  <ul>
    <li>The /app/views folder now contains <code>index.scala.html</code> and <code>main.scala.html</code>. Create a new folder called ‘contacts’ and create a new view template <code>list.scala.html</code></li>
    <li>Pass contacts as a parameter to the template. <code>@(contacts: List[Contact]</code></li>
    <li>Pass the entire view to the <code>@content</code> of the main view</li>
    <li>Format the page using Bootstrap. Add the bootstrap files to <code>/app/bootstrap</code><br  />https://getbootstrap.com/docs/4.3/getting-started/download/</li>
  </ul>
  </li>
  <li><strong>Render the list template</strong><br />
  Call <code>find.all()</code> to get the entire list of contacts from the database and render the list. Pass the rendered list to the list template using <code>ok()</code>
  </li>
  <li><strong>Add the Contact form </strong><br />
  <ul>
    <li>Create a view template <code>details.scala.html</code> in <code>/app/views/contacts</code></li>
    <li>Pass <code>contactForm</code> and <code>action</code> as parameters</li>
    <li>Format the template using Bootstrap</li>
  </ul>
 </li>
 <li><strong>Construct and render the Contact form object</strong><br />
  <ul>
    <li>Create a dependency injection<br />
    <code>
      public Contacts(FormFactory formFactory) { this.contactForm = formFactory.form(Contact.class); }
      </code></li>
    <li>Create a <code>Form<Contact></code> object and render the same and pass it to the details template using <code>ok()</code> for a New Contact form. </li>
    <li>Create a <code>From<Contact></code> object and use <code>fill</code> to get the details of the contact with the given Id. Render the same and pass it to the details template using <code>ok</code> for an Edit Contact form</li>
  </ul>
 </li>
 <li><strong>Handle the form submission</strong><br />
  <ul>
    <li>Check for validation errors</li>
    <li>If the object already has an id, call <code>update()</code>, else call <code>save()</code></li>
    <li>Redirect to the list view</li>
  </ul>
 </li>
 <li><strong>The Delete action</strong><br />
  <ul>
    <li>With a RESTful interface, this should be a DELETE operation. Use JavaScript to send a DELETE request.</li>
    <li>Add a DELETE route to /conf/routes<br />
      <code>DELETE    /contacts/:id   controllers.Contacts.delete(id: Long)</code></li>
    <li>The <code>Contacts.delete()</code> method finds the contact by Id and calls <code>delete()</code></li>
  </ul>
 </li>
 
  
 
  
  
