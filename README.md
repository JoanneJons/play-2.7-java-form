# play-2.7-java-form

## Steps to make a simple Java form using Play 2.7

<ol>
  <li><strong>Install sbt</strong> : https://www.scala-sbt.org/release/docs/Setup.html
  </li><br  />
  <li><strong>Create a Play project</strong> <br />
    Create a new project using a giter8 template : <br  />
    <code>sbt new playframework/play-java-seed.g8</code> <br  />
    https://www.playframework.com/documentation/2.7.x/NewApplication
  </li>
  <li><strong>Create a Controller class</strong><br  />
    In the folder /app/controllers, under the controllers package, add a controller called Contacts.java which extends the Controller class. (<code>play.mvc.Controller</code>)
  </li>
  <li><strong>Add methods to the Controller </strong> 
    Add the following public methods to Contacts class :
    <code>
      public Result list() //List all contacts
      public Result newContact() //Show a blank contact form 
      public Result details(Long id) //Show a contact edit form
      public Result save() //Save a contact
    </code>
	For the time being, make all the methods return TODO()
</li>