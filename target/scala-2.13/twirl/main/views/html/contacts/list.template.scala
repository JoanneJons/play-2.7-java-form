
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

object list extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Contact],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(contacts: List[Contact]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Phone Book")/*2.20*/ {_display_(Seq[Any](format.raw/*2.22*/("""
	
	"""),format.raw/*4.2*/("""<h2>Contacts</h2>
        
        <script>
            function del(urlToDelete) """),format.raw/*7.39*/("""{"""),format.raw/*7.40*/("""
                """),format.raw/*8.17*/("""$.ajax("""),format.raw/*8.24*/("""{"""),format.raw/*8.25*/("""
                    """),format.raw/*9.21*/("""url: urlToDelete,
                    method: 'DELETE',
                    success: function(results) """),format.raw/*11.48*/("""{"""),format.raw/*11.49*/("""
                        """),format.raw/*12.25*/("""//Refresh the page
                        location.reload();
                    """),format.raw/*14.21*/("""}"""),format.raw/*14.22*/("""
                """),format.raw/*15.17*/("""}"""),format.raw/*15.18*/(""");
            """),format.raw/*16.13*/("""}"""),format.raw/*16.14*/("""
        """),format.raw/*17.9*/("""</script>

	
			"""),_display_(/*20.5*/for(contact <- contacts) yield /*20.29*/ {_display_(Seq[Any](format.raw/*20.31*/("""
            """),format.raw/*21.13*/("""<div class="row">
                <div class="col-sm-4">
				    <a href=""""),_display_(/*23.19*/routes/*23.25*/.Contacts.details(contact.id)),format.raw/*23.54*/("""">
					    """),_display_(/*24.11*/contact/*24.18*/.name),format.raw/*24.23*/("""
				    """),format.raw/*25.9*/("""</a>
                </div>
                <div class="col-sm-4">
				    
					    """),_display_(/*29.11*/contact/*29.18*/.phone),format.raw/*29.24*/("""
				    """),format.raw/*30.9*/("""</a>
                </div>
                            <div class="col-sm-4">
                                    <a href=""""),_display_(/*33.47*/routes/*33.53*/.Contacts.details(contact.id)),format.raw/*33.82*/("""">
                                        <i class="glyphicon glyphicon-pencil"></i>
                                    </a>
                                    <a onclick="del('"""),_display_(/*36.55*/routes/*36.61*/.Contacts.delete(contact.id)),format.raw/*36.89*/("""')">
                                        <i class="glyphicon glyphicon-trash"></i>
                                    </a>
                            </div>
                                
			</div>
			""")))}),format.raw/*42.5*/("""
			
		"""),format.raw/*44.3*/("""</tbody>
	</table>
        <br><br>
        <a href=""""),_display_(/*47.19*/routes/*47.25*/.Contacts.newContact()),format.raw/*47.47*/("""">
            <i class="glyphicon glyphicon-plus"></i> Add Contact
        </a>
	
""")))}))
      }
    }
  }

  def render(contacts:List[Contact]): play.twirl.api.HtmlFormat.Appendable = apply(contacts)

  def f:((List[Contact]) => play.twirl.api.HtmlFormat.Appendable) = (contacts) => apply(contacts)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-07-28T13:08:04.150
                  SOURCE: /Users/mjons/work/Jo/Play/play-2.7-java-form/app/views/contacts/list.scala.html
                  HASH: b397a97074fce473282d1b52e50242d5e9045fd4
                  MATRIX: 963->1|1082->28|1108->46|1147->48|1177->52|1286->134|1314->135|1358->152|1392->159|1420->160|1468->181|1599->284|1628->285|1681->310|1791->392|1820->393|1865->410|1894->411|1937->426|1966->427|2002->436|2045->453|2085->477|2125->479|2166->492|2268->567|2283->573|2333->602|2373->615|2389->622|2415->627|2451->636|2564->722|2580->729|2607->735|2643->744|2795->869|2810->875|2860->904|3068->1085|3083->1091|3132->1119|3372->1329|3406->1336|3487->1390|3502->1396|3545->1418
                  LINES: 28->1|33->2|33->2|33->2|35->4|38->7|38->7|39->8|39->8|39->8|40->9|42->11|42->11|43->12|45->14|45->14|46->15|46->15|47->16|47->16|48->17|51->20|51->20|51->20|52->21|54->23|54->23|54->23|55->24|55->24|55->24|56->25|60->29|60->29|60->29|61->30|64->33|64->33|64->33|67->36|67->36|67->36|73->42|75->44|78->47|78->47|78->47
                  -- GENERATED --
              */
          