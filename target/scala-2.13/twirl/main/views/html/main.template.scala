
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


Seq[Any](format.raw/*8.1*/("""<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href=""""),_display_(/*15.33*/routes/*15.39*/.Assets.versioned("images/favicon.ico")),format.raw/*15.78*/("""">
        <title>Online Banking</title>
            <!-- Bootstrap 4.0 core CSS -->
        <link rel="stylesheet"
        href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
        crossorigin="anonymous">
            <!-- Custom styles for this template -->
        <link href=""""),_display_(/*23.22*/routes/*23.28*/.Assets.versioned("stylesheets/main.css")),format.raw/*23.69*/("""" rel="stylesheet">
    </head>

    <body>
            <!-- Navigation Menu-->
        <nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">

                <!-- Page 'brtand' (top left)-->
            <a class="navbar-brand" href=""""),_display_(/*31.44*/routes/*31.50*/.HomeController.index),format.raw/*31.71*/(""""><img src=""""),_display_(/*31.84*/routes/*31.90*/.Assets.versioned("images/favicon.ico")),format.raw/*31.129*/("""" alt="Online Banking" height="30px" width="30px"></a>

                <!-- Responsive menu button - display when page is collapsed (e.g. mobile) -->
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

                <!-- Navigation Links-->
            <div class="collapse navbar-collapse" id="navbarsExampleDefault">
                <ul class="navbar-nav mr-auto">

                        <!-- Each link is a list item <li> -->
                        <!-- nav-item active used to highlight current page-->

                        <!-- Home -->
                    <li class="nav-item active">
                        <a class="nav-link" href=""""),_display_(/*47.52*/routes/*47.58*/.HomeController.index),format.raw/*47.79*/("""">Home <span class="sr-only">(current)</span></a>
                    </li>

                        <!-- Statements -->
                    <li class="nav-item">
                        <a class="nav-link" href=""""),_display_(/*52.52*/routes/*52.58*/.HomeController.statement),format.raw/*52.83*/("""">Statements</a>
                    </li>

                        <!-- Manage Accounts -->
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href=""""),_display_(/*57.68*/routes/*57.74*/.HomeController.manage),format.raw/*57.96*/("""" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Manage Accounts</a>
                        <div class="dropdown-menu" aria-labelledby="dropdown01">
                            <a class="dropdown-item" href=""""),_display_(/*59.61*/routes/*59.67*/.HomeController.view_accounts),format.raw/*59.96*/("""">View Account</a>
                            <a class="dropdown-item" href=""""),_display_(/*60.61*/routes/*60.67*/.HomeController.add_accounts),format.raw/*60.95*/("""">Add Account</a>
                            <a class="dropdown-item" href=""""),_display_(/*61.61*/routes/*61.67*/.HomeController.close_accounts),format.raw/*61.97*/("""">Close Account</a>
                        </div>
                    </li>

                        <!-- Manual refund -->
                        <!-- This link is disabled (as this is just for bankers) -->
                    <li class="nav-item">
                        <a class="nav-link disabled" href="#">Manual Refund</a>
                    </li>

                        <!-- Example Dropdown menu (# links point to this page) -->
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="http://example.com" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Transfers and Bill Payments</a>
                        <div class="dropdown-menu" aria-labelledby="dropdown01">
                            <a class="dropdown-item" href=""""),_display_(/*75.61*/routes/*75.67*/.HomeController.one_transfer),format.raw/*75.95*/("""">One Time Transfer</a>
                            <a class="dropdown-item" href=""""),_display_(/*76.61*/routes/*76.67*/.HomeController.recurring_transfer),format.raw/*76.101*/("""">Recurring Transfer</a>
                            <a class="dropdown-item" href=""""),_display_(/*77.61*/routes/*77.67*/.HomeController.one_bill_payment),format.raw/*77.99*/("""">One Time Bill Payment</a>
                            <a class="dropdown-item" href=""""),_display_(/*78.61*/routes/*78.67*/.HomeController.recurring_bill_payment),format.raw/*78.105*/("""">Recurring Bill Payment</a>
                        </div>
                    </li>
                </ul> <!-- End of Nav list-->

                <!-- Example search box (doesn't work yet!) -->
                """),format.raw/*87.26*/("""
            """),format.raw/*88.13*/("""</div>
        </nav>

            <!-- Content area-->
        <main role="main" class="container-fluid">
                <!-- Page content goes here -->
            """),_display_(/*94.14*/content),format.raw/*94.21*/("""

        """),format.raw/*96.9*/("""</main><!-- /.container -->

        <!-- Page Footer-->
        <!-- css class .footer defined in ./css/style.css -->
        <footer class="footer">
            <div class="container">
                <span class="text-muted">
                    <img src=""""),_display_(/*103.32*/routes/*103.38*/.Assets.versioned("images/favicon.ico")),format.raw/*103.77*/("""" alt="Online Banking" height="50px" width="50px">
                    Bank at your place!!

                </span>
            </div>
        </footer>

            <!-- Bootstrap core JavaScript
    ================================================== -->

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

            <!-- Placed at the end of the document so the pages load faster -->
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
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
                  SOURCE: app/views/main.scala.html
                  HASH: 4867b104720d18df8b4cbc17d9f1f77458855cab
                  MATRIX: 1160->255|1284->286|1598->573|1613->579|1673->618|2100->1018|2115->1024|2177->1065|2453->1314|2468->1320|2510->1341|2550->1354|2565->1360|2626->1399|3543->2289|3558->2295|3600->2316|3841->2530|3856->2536|3902->2561|4140->2772|4155->2778|4198->2800|4470->3045|4485->3051|4535->3080|4641->3159|4656->3165|4705->3193|4810->3271|4825->3277|4876->3307|5738->4142|5753->4148|5802->4176|5913->4260|5928->4266|5984->4300|6096->4385|6111->4391|6164->4423|6279->4511|6294->4517|6354->4555|6595->5048|6636->5061|6831->5229|6859->5236|6896->5246|7184->5506|7200->5512|7261->5551
                  LINES: 32->7|37->8|44->15|44->15|44->15|52->23|52->23|52->23|60->31|60->31|60->31|60->31|60->31|60->31|76->47|76->47|76->47|81->52|81->52|81->52|86->57|86->57|86->57|88->59|88->59|88->59|89->60|89->60|89->60|90->61|90->61|90->61|104->75|104->75|104->75|105->76|105->76|105->76|106->77|106->77|106->77|107->78|107->78|107->78|113->87|114->88|120->94|120->94|122->96|129->103|129->103|129->103
                  -- GENERATED --
              */
          