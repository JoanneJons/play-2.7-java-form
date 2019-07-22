// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mjons/work/Jo/Play/play-2.7-java-form/conf/routes
// @DATE:Mon Jul 22 15:33:55 IST 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseContacts Contacts = new controllers.ReverseContacts(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseContacts Contacts = new controllers.javascript.ReverseContacts(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
