
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

object details extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Contact],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(contactForm: Form[Contact]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Contact form")/*4.22*/ {_display_(Seq[Any](format.raw/*4.24*/("""
    """),format.raw/*5.5*/("""<h1>Contact Form</h1>
    """),_display_(/*6.6*/helper/*6.12*/.form(action = routes.Contacts.save())/*6.50*/ {_display_(Seq[Any](format.raw/*6.52*/("""
        """),format.raw/*7.9*/("""<fieldset>
            <legend>Contact</legend>
            """),_display_(/*9.14*/helper/*9.20*/.inputText(contactForm("name"), '_label -> "Name")),format.raw/*9.70*/("""
            """),_display_(/*10.14*/helper/*10.20*/.inputText(contactForm("phone"), '_label -> "Phone")),format.raw/*10.72*/("""
        """),format.raw/*11.9*/("""</fieldset>
    <input type="submit" class="btn btn-primary" value="Save">
    <a class="btn" href=""""),_display_(/*13.27*/routes/*13.33*/.Contacts.list()),format.raw/*13.49*/("""">Cancel</a>
    """)))}),format.raw/*14.6*/("""
""")))}),format.raw/*15.2*/("""
"""))
      }
    }
  }

  def render(contactForm:Form[Contact]): play.twirl.api.HtmlFormat.Appendable = apply(contactForm)

  def f:((Form[Contact]) => play.twirl.api.HtmlFormat.Appendable) = (contactForm) => apply(contactForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-07-22T15:34:16.316
                  SOURCE: /Users/mjons/work/Jo/Play/play-2.7-java-form/app/views/contacts/details.scala.html
                  HASH: 3bc097e61c9e17fa14697f3cef34b0f6ff8de971
                  MATRIX: 966->1|1067->31|1111->47|1138->49|1166->69|1205->71|1236->76|1288->103|1302->109|1348->147|1387->149|1422->158|1509->219|1523->225|1593->275|1634->289|1649->295|1722->347|1758->356|1886->457|1901->463|1938->479|1986->497|2018->499
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|36->5|37->6|37->6|37->6|37->6|38->7|40->9|40->9|40->9|41->10|41->10|41->10|42->11|44->13|44->13|44->13|45->14|46->15
                  -- GENERATED --
              */
          