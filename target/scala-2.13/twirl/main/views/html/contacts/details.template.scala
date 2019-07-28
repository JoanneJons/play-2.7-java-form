
package views.html.contacts

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

object details extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[Contact],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(contactForm: Form[Contact], action: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Contact form")/*4.22*/ {_display_(Seq[Any](format.raw/*4.24*/("""
    """),format.raw/*5.5*/("""<h2>"""),_display_(/*5.10*/action),format.raw/*5.16*/("""</h2>
    """),_display_(/*6.6*/helper/*6.12*/.form(action = routes.Contacts.save())/*6.50*/ {_display_(Seq[Any](format.raw/*6.52*/("""
            """),_display_(/*7.14*/helper/*7.20*/.inputText(contactForm("name"), '_label -> "Name")),format.raw/*7.70*/("""
            """),_display_(/*8.14*/helper/*8.20*/.inputText(contactForm("phone"), '_label -> "Phone")),format.raw/*8.72*/("""
            """),_display_(/*9.14*/helper/*9.20*/.inputText(contactForm("id"), '_label -> " ", 'style -> "display: none")),format.raw/*9.92*/("""

    """),format.raw/*11.5*/("""<input type="submit" class="btn btn-primary" value="Save">
    <a class="btn" href=""""),_display_(/*12.27*/routes/*12.33*/.Contacts.list()),format.raw/*12.49*/("""">Cancel</a>
    """)))}),format.raw/*13.6*/("""
""")))}),format.raw/*14.2*/("""
"""))
      }
    }
  }

  def render(contactForm:Form[Contact],action:String): play.twirl.api.HtmlFormat.Appendable = apply(contactForm,action)

  def f:((Form[Contact],String) => play.twirl.api.HtmlFormat.Appendable) = (contactForm,action) => apply(contactForm,action)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-07-28T13:00:52.090
                  SOURCE: /Users/mjons/work/Jo/Play/play-2.7-java-form/app/views/contacts/details.scala.html
                  HASH: 7dbdb4be283673583d5069573a1db1b7a8b6af94
                  MATRIX: 973->1|1090->47|1134->63|1161->65|1189->85|1228->87|1259->92|1290->97|1316->103|1352->114|1366->120|1412->158|1451->160|1491->174|1505->180|1575->230|1615->244|1629->250|1701->302|1741->316|1755->322|1847->394|1880->400|1992->485|2007->491|2044->507|2092->525|2124->527
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|36->5|36->5|36->5|37->6|37->6|37->6|37->6|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|42->11|43->12|43->12|43->12|44->13|45->14
                  -- GENERATED --
              */
          