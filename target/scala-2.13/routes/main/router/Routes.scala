// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mjons/work/Jo/Play/play-2.7-java-form/conf/routes
// @DATE:Mon Jul 22 15:33:55 IST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_2: controllers.HomeController,
  // @LINE:7
  Contacts_1: controllers.Contacts,
  // @LINE:14
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_2: controllers.HomeController,
    // @LINE:7
    Contacts_1: controllers.Contacts,
    // @LINE:14
    Assets_0: controllers.Assets
  ) = this(errorHandler, HomeController_2, Contacts_1, Assets_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, Contacts_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contacts/""", """controllers.Contacts.list()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contacts/new""", """controllers.Contacts.newContact()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contacts/""" + "$" + """id<[^/]+>""", """controllers.Contacts.details(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contacts/""", """controllers.Contacts.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contacts/""" + "$" + """id<[^/]+>""", """controllers.Contacts.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Contacts_list1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contacts/")))
  )
  private[this] lazy val controllers_Contacts_list1_invoker = createInvoker(
    Contacts_1.list(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Contacts",
      "list",
      Nil,
      "GET",
      this.prefix + """contacts/""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Contacts_newContact2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contacts/new")))
  )
  private[this] lazy val controllers_Contacts_newContact2_invoker = createInvoker(
    Contacts_1.newContact(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Contacts",
      "newContact",
      Nil,
      "GET",
      this.prefix + """contacts/new""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Contacts_details3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contacts/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Contacts_details3_invoker = createInvoker(
    Contacts_1.details(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Contacts",
      "details",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """contacts/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Contacts_save4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contacts/")))
  )
  private[this] lazy val controllers_Contacts_save4_invoker = createInvoker(
    Contacts_1.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Contacts",
      "save",
      Nil,
      "POST",
      this.prefix + """contacts/""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Contacts_delete5_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contacts/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Contacts_delete5_invoker = createInvoker(
    Contacts_1.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Contacts",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """contacts/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:7
    case controllers_Contacts_list1_route(params@_) =>
      call { 
        controllers_Contacts_list1_invoker.call(Contacts_1.list())
      }
  
    // @LINE:8
    case controllers_Contacts_newContact2_route(params@_) =>
      call { 
        controllers_Contacts_newContact2_invoker.call(Contacts_1.newContact())
      }
  
    // @LINE:9
    case controllers_Contacts_details3_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Contacts_details3_invoker.call(Contacts_1.details(id))
      }
  
    // @LINE:10
    case controllers_Contacts_save4_route(params@_) =>
      call { 
        controllers_Contacts_save4_invoker.call(Contacts_1.save())
      }
  
    // @LINE:11
    case controllers_Contacts_delete5_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Contacts_delete5_invoker.call(Contacts_1.delete(id))
      }
  
    // @LINE:14
    case controllers_Assets_versioned6_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
