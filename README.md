# play-2.7-java-form

## Steps to make a simple Java form using Play 2.7

<ol>
  <li><strong>Install sbt</strong> : https://www.scala-sbt.org/release/docs/Setup.html</li><br  />
  <li><strong>Create a Play project</strong> : <br />
    Create a new project using a giter8 template : <br />
    <code>sbt new playframework/play-java-seed.g8</code> <br />
    https://www.playframework.com/documentation/2.7.x/NewApplication</li> <br  />
  <li><strong>Create a Controller class</strong><br />
    In the folder /app/controllers, under the controllers package, add a controller called Contacts.java which extends the Controller class. (play.mvc.Controller)
  </li><br  />
  <li><strong>Add methods to the Controller</strong><br />
    Add the following public methods to Contacts class : 
    <ul>
      <code>
      <li>public Result list() <em>List all contacts</em></li>
      <li>public Result newContact() <em>Show a blank contact form</em></li>
      <li>public Result details(Long id) <em>Show a contact edit form</em></li>
      <li>public Result save() <em>Save a contact</em></li>
      </code>
      For the time being, make all the methods return TODO()
    </ul>
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
  <li>
  <strong>Map Contact enitity using Ebean</strong><br />
  <ul>
    <li>Import <code>io.ebean.*</code> and <code>javax.peristence.*</code> in Contact.java</li>
    <li>Annotate Contact as <code>@Entity</code>, Id as <code>@Id</code> and name & phone as <code>@Constraints.required</code>.<br /><code>(play.data.validation.Constraints)</code></li>
    <li>Assign database configuration driver, url, username & password in <code>/conf/application.conf<code></li>
    <li>Add jdbc library dependency and ebean dependency in <code>build.sbt</code></li>
    <li>Add sbt plugin for ebean in <code>/project/target/plugins.sbt</code></li>
  </ul>
