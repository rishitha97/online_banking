
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Home Page")/*1.19*/ {_display_(Seq[Any](format.raw/*1.21*/("""
    """),format.raw/*2.5*/("""<!-- this css class is not part of bootstrap but is defined in /css/style.css -->
  <section id="content">
    <div class="starter-template">
      <h1>Welcome to the online Banking </h1>
      <img src=""""),_display_(/*6.18*/routes/*6.24*/.Assets.versioned("images/home.jpg")),format.raw/*6.60*/("""" alt="Online Banking" height="400" width="1000" align="center"><br><br><br>
      <a href="#">
        <span class="glyphicon glyphicon-plus-sign"></span> open New Savings Account
      </a> <br>
      <a href="#">
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
                  SOURCE: app/views/index.scala.html
                  HASH: adc996819615e37874ce97498bcb591f1f23ba38
                  MATRIX: 989->1|1014->18|1053->20|1084->25|1315->230|1329->236|1385->272
                  LINES: 32->1|32->1|32->1|33->2|37->6|37->6|37->6
                  -- GENERATED --
              */
          