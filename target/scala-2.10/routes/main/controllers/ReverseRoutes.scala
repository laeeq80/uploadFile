
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/laeeq/Desktop/Backup/Project5/uploadFile/conf/routes
// @DATE:Tue Oct 09 11:12:48 CEST 2018

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:6
  class Reverseupload(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def upload(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "upload")
    }
  
  }


}