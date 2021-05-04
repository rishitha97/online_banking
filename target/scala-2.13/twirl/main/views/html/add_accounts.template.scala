
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
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object add_accounts extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Manage Accounts Page")/*1.30*/ {_display_(Seq[Any](format.raw/*1.32*/("""
    """),format.raw/*2.5*/("""<!-- this css class is not part of bootstrap but is defined in /css/style.css -->
    <section id="content">
        <div class="starter-template">
            <h1>Add Accounts Module </h1>
            <a href=""""),_display_(/*6.23*/routes/*6.29*/.HomeController.add_saving),format.raw/*6.55*/("""">
                <span class="glyphicon glyphicon-plus-sign"></span> open New Savings Account
            </a> <br>
            <a href=""""),_display_(/*9.23*/routes/*9.29*/.HomeController.add_checking),format.raw/*9.57*/("""">
                <span class="glyphicon glyphicon-plus-sign"></span> open New Checking Account
            </a>
        </div>
    </section>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/add_accounts.scala.html
                  HASH: 95af62e0333c42b4565f807d5065be2bff241f50
                  MATRIX: 996->1|1032->29|1071->31|1102->36|1340->248|1354->254|1400->280|1566->420|1580->426|1628->454
                  LINES: 32->1|32->1|32->1|33->2|37->6|37->6|37->6|40->9|40->9|40->9
                  -- GENERATED --
              */
          