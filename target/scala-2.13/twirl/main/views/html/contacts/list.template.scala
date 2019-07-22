
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

	<table class="table table-striped">
		<thead>
			<tr>
				<th>Name</th>
				<th>Phone</th>
			</tr>
		</thead>
		<tbody>
			"""),_display_(/*27.5*/for(contact <- contacts) yield /*27.29*/ {_display_(Seq[Any](format.raw/*27.31*/("""
			"""),format.raw/*28.4*/("""<tr>
				<td><a href=""""),_display_(/*29.19*/routes/*29.25*/.Contacts.details(contact.id)),format.raw/*29.54*/("""">
					"""),_display_(/*30.7*/contact/*30.14*/.name),format.raw/*30.19*/("""
				"""),format.raw/*31.5*/("""</a></td>
				<td><a href=""""),_display_(/*32.19*/routes/*32.25*/.Contacts.details(contact.id)),format.raw/*32.54*/("""">
					"""),_display_(/*33.7*/contact/*33.14*/.phone),format.raw/*33.20*/("""
				"""),format.raw/*34.5*/("""</a></td>
                                <td>
                                    <a href=""""),_display_(/*36.47*/routes/*36.53*/.Contacts.details(contact.id)),format.raw/*36.82*/("""">
                                        <i class="icon icon-pencil"></i>
                                    </a>
                                    <a onclick="del('"""),_display_(/*39.55*/routes/*39.61*/.Contacts.delete(contact.id)),format.raw/*39.89*/("""')">
                                        <i class="icon icon-trash"></i>
                                    </a>
                                    
                                </td>
			</tr>
			""")))}),format.raw/*45.5*/("""
			
		"""),format.raw/*47.3*/("""</tbody>
	</table>
        <br><br>
        <a href=""""),_display_(/*50.19*/routes/*50.25*/.Contacts.newContact()),format.raw/*50.47*/("""">
            <i class="icon-plus"></i> Add Contact
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
                  DATE: 2019-07-22T15:34:16.353
                  SOURCE: /Users/mjons/work/Jo/Play/play-2.7-java-form/app/views/contacts/list.scala.html
                  HASH: 1508568f224d269f3e2ed0b83878a06626efe178
                  MATRIX: 963->1|1082->28|1108->46|1147->48|1177->52|1286->134|1314->135|1358->152|1392->159|1420->160|1468->181|1599->284|1628->285|1681->310|1791->392|1820->393|1865->410|1894->411|1937->426|1966->427|2002->436|2165->573|2205->597|2245->599|2276->603|2326->626|2341->632|2391->661|2426->670|2442->677|2468->682|2500->687|2555->715|2570->721|2620->750|2655->759|2671->766|2698->772|2730->777|2850->870|2865->876|2915->905|3113->1076|3128->1082|3177->1110|3413->1316|3447->1323|3528->1377|3543->1383|3586->1405
                  LINES: 28->1|33->2|33->2|33->2|35->4|38->7|38->7|39->8|39->8|39->8|40->9|42->11|42->11|43->12|45->14|45->14|46->15|46->15|47->16|47->16|48->17|58->27|58->27|58->27|59->28|60->29|60->29|60->29|61->30|61->30|61->30|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|67->36|67->36|67->36|70->39|70->39|70->39|76->45|78->47|81->50|81->50|81->50
                  -- GENERATED --
              */
          