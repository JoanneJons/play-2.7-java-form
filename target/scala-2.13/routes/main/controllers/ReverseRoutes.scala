// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mjons/work/Jo/Play/play-2.7-java-form/conf/routes
// @DATE:Mon Jul 22 15:33:55 IST 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:7
  class ReverseContacts(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def delete(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "contacts/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:8
    def newContact(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "contacts/new")
    }
  
    // @LINE:9
    def details(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "contacts/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:7
    def list(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "contacts/")
    }
  
    // @LINE:10
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "contacts/")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:14
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
