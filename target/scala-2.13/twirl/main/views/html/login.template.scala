
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /*   @request.flash.asScala().data.map { case (username, value) =>
    <div class="@username">@value</div>
    }

    <table>
        <thead>
            <tr><th>Name</th><th>Username</th>
        </thead>
        <tbody>
        @for(w <- login) {
            <tr><td>@w.username</td><td>@w.password</td></tr>
        }
        </tbody>
    </table>

    <hr/>

    @if(form.hasGlobalErrors) {
        @form.globalErrors.asScala.map { error: play.data.validation.ValidationError =>
            <div>
                @error.key: @error.message
            </div>
        }
    }

    @helper.form(routes.HomeController.login) {
        @helper.CSRF.formField

        @helper.inputText(form("username"))

        @helper.inputText(form("password"))

        <button type="submit">Login</button>
    }

}*/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any]()
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/login.scala.html
                  HASH: 4778665dfe78616bd5ea58dd36a87d779647575d
                  MATRIX: 
                  LINES: 
                  -- GENERATED --
              */
          