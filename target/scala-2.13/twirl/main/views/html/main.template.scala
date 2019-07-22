
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.1*/("""
"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <link href=""""),_display_(/*14.22*/routes/*14.28*/.Assets.versioned("bootstrap/css/bootstrap.min.css")),format.raw/*14.80*/("""" rel="stylesheet" media="screen">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*15.54*/routes/*15.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*15.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*16.59*/routes/*16.65*/.Assets.versioned("images/favicon.png")),format.raw/*16.104*/("""">
    </head>
    <body>
        """),format.raw/*20.32*/("""
        """),_display_(/*21.10*/content),format.raw/*21.17*/("""

        """),format.raw/*23.9*/("""<script src=""""),_display_(/*23.23*/routes/*23.29*/.Assets.versioned("javascripts/jquery-1.9.0.min.js")),format.raw/*23.81*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-07-22T15:34:16.403
                  SOURCE: /Users/mjons/work/Jo/Play/play-2.7-java-form/app/views/main.scala.html
                  HASH: ace3fb741faeabff7443338c3a86ea3b1e25cab7
                  MATRIX: 1206->260|1330->291|1357->292|1437->397|1473->406|1508->414|1534->419|1591->449|1606->455|1679->507|1794->595|1809->601|1872->642|1960->703|1975->709|2036->748|2098->872|2135->882|2163->889|2200->899|2241->913|2256->919|2329->971
                  LINES: 33->7|38->8|39->9|42->12|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|49->20|50->21|50->21|52->23|52->23|52->23|52->23
                  -- GENERATED --
              */
          