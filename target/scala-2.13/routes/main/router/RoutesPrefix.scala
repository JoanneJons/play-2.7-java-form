// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mjons/work/Jo/Play/play-2.7-java-form/conf/routes
// @DATE:Mon Jul 22 15:33:55 IST 2019


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
