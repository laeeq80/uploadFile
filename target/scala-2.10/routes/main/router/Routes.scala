
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/laeeq/Desktop/Backup/Project5/uploadFile/conf/routes
// @DATE:Tue Oct 09 11:12:48 CEST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

object Routes extends Routes

class Routes extends GeneratedRouter {

  import ReverseRouteContext.empty

  override val errorHandler: play.api.http.HttpErrorHandler = play.api.http.LazyHttpErrorHandler

  private var _prefix = "/"

  def withPrefix(prefix: String): Routes = {
    _prefix = prefix
    router.RoutesPrefix.setPrefix(prefix)
    
    this
  }

  def prefix: String = _prefix

  lazy val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation: Seq[(String, String, String)] = List(
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """upload""", """controllers.upload.upload()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_upload_upload0_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("upload")))
  )
  private[this] lazy val controllers_upload_upload0_invoker = createInvoker(
    controllers.upload.upload(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.upload",
      "upload",
      Nil,
      "POST",
      """ API Endpoints""",
      this.prefix + """upload"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_upload_upload0_route(params) =>
      call { 
        controllers_upload_upload0_invoker.call(controllers.upload.upload())
      }
  }
}