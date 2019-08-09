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
