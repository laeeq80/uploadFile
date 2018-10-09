
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/laeeq/Desktop/Backup/Project5/uploadFile/conf/routes
// @DATE:Tue Oct 09 11:12:48 CEST 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.Reverseupload upload = new controllers.Reverseupload(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.Reverseupload upload = new controllers.javascript.Reverseupload(RoutesPrefix.byNamePrefix());
  }

}
