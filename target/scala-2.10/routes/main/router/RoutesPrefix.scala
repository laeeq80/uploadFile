
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/laeeq/Desktop/Backup/Project5/uploadFile/conf/routes
// @DATE:Tue Oct 09 11:12:48 CEST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
