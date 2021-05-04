// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:21
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:21
    Assets_0: controllers.Assets
  ) = this(errorHandler, HomeController_1, Assets_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manage""", """controllers.HomeController.manage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """statement""", """controllers.HomeController.statement"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """view_accounts""", """controllers.HomeController.view_accounts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """add_accounts""", """controllers.HomeController.add_accounts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """close_accounts""", """controllers.HomeController.close_accounts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """add_saving""", """controllers.HomeController.add_saving"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """add_checking""", """controllers.HomeController.add_checking"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """one-transfer""", """controllers.HomeController.one_transfer"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recurring_transfer""", """controllers.HomeController.recurring_transfer"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """one_bill_payment""", """controllers.HomeController.one_bill_payment"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recurring_bill_payment""", """controllers.HomeController.recurring_bill_payment"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_manage1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manage")))
  )
  private[this] lazy val controllers_HomeController_manage1_invoker = createInvoker(
    HomeController_1.manage,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "manage",
      Nil,
      "GET",
      this.prefix + """manage""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_statement2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statement")))
  )
  private[this] lazy val controllers_HomeController_statement2_invoker = createInvoker(
    HomeController_1.statement,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "statement",
      Nil,
      "GET",
      this.prefix + """statement""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_view_accounts3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("view_accounts")))
  )
  private[this] lazy val controllers_HomeController_view_accounts3_invoker = createInvoker(
    HomeController_1.view_accounts,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "view_accounts",
      Nil,
      "GET",
      this.prefix + """view_accounts""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_add_accounts4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add_accounts")))
  )
  private[this] lazy val controllers_HomeController_add_accounts4_invoker = createInvoker(
    HomeController_1.add_accounts,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "add_accounts",
      Nil,
      "GET",
      this.prefix + """add_accounts""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_close_accounts5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("close_accounts")))
  )
  private[this] lazy val controllers_HomeController_close_accounts5_invoker = createInvoker(
    HomeController_1.close_accounts,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "close_accounts",
      Nil,
      "GET",
      this.prefix + """close_accounts""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_add_saving6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add_saving")))
  )
  private[this] lazy val controllers_HomeController_add_saving6_invoker = createInvoker(
    HomeController_1.add_saving,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "add_saving",
      Nil,
      "GET",
      this.prefix + """add_saving""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_add_checking7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add_checking")))
  )
  private[this] lazy val controllers_HomeController_add_checking7_invoker = createInvoker(
    HomeController_1.add_checking,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "add_checking",
      Nil,
      "GET",
      this.prefix + """add_checking""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_one_transfer8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("one-transfer")))
  )
  private[this] lazy val controllers_HomeController_one_transfer8_invoker = createInvoker(
    HomeController_1.one_transfer,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "one_transfer",
      Nil,
      "GET",
      this.prefix + """one-transfer""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_recurring_transfer9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recurring_transfer")))
  )
  private[this] lazy val controllers_HomeController_recurring_transfer9_invoker = createInvoker(
    HomeController_1.recurring_transfer,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "recurring_transfer",
      Nil,
      "GET",
      this.prefix + """recurring_transfer""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_one_bill_payment10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("one_bill_payment")))
  )
  private[this] lazy val controllers_HomeController_one_bill_payment10_invoker = createInvoker(
    HomeController_1.one_bill_payment,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "one_bill_payment",
      Nil,
      "GET",
      this.prefix + """one_bill_payment""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_recurring_bill_payment11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recurring_bill_payment")))
  )
  private[this] lazy val controllers_HomeController_recurring_bill_payment11_invoker = createInvoker(
    HomeController_1.recurring_bill_payment,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "recurring_bill_payment",
      Nil,
      "GET",
      this.prefix + """recurring_bill_payment""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Assets_versioned12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned12_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """POST    /                    controllers.HomeController.login(request: Request)
 Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:7
    case controllers_HomeController_manage1_route(params@_) =>
      call { 
        controllers_HomeController_manage1_invoker.call(HomeController_1.manage)
      }
  
    // @LINE:8
    case controllers_HomeController_statement2_route(params@_) =>
      call { 
        controllers_HomeController_statement2_invoker.call(HomeController_1.statement)
      }
  
    // @LINE:9
    case controllers_HomeController_view_accounts3_route(params@_) =>
      call { 
        controllers_HomeController_view_accounts3_invoker.call(HomeController_1.view_accounts)
      }
  
    // @LINE:10
    case controllers_HomeController_add_accounts4_route(params@_) =>
      call { 
        controllers_HomeController_add_accounts4_invoker.call(HomeController_1.add_accounts)
      }
  
    // @LINE:11
    case controllers_HomeController_close_accounts5_route(params@_) =>
      call { 
        controllers_HomeController_close_accounts5_invoker.call(HomeController_1.close_accounts)
      }
  
    // @LINE:12
    case controllers_HomeController_add_saving6_route(params@_) =>
      call { 
        controllers_HomeController_add_saving6_invoker.call(HomeController_1.add_saving)
      }
  
    // @LINE:13
    case controllers_HomeController_add_checking7_route(params@_) =>
      call { 
        controllers_HomeController_add_checking7_invoker.call(HomeController_1.add_checking)
      }
  
    // @LINE:14
    case controllers_HomeController_one_transfer8_route(params@_) =>
      call { 
        controllers_HomeController_one_transfer8_invoker.call(HomeController_1.one_transfer)
      }
  
    // @LINE:15
    case controllers_HomeController_recurring_transfer9_route(params@_) =>
      call { 
        controllers_HomeController_recurring_transfer9_invoker.call(HomeController_1.recurring_transfer)
      }
  
    // @LINE:16
    case controllers_HomeController_one_bill_payment10_route(params@_) =>
      call { 
        controllers_HomeController_one_bill_payment10_invoker.call(HomeController_1.one_bill_payment)
      }
  
    // @LINE:17
    case controllers_HomeController_recurring_bill_payment11_route(params@_) =>
      call { 
        controllers_HomeController_recurring_bill_payment11_invoker.call(HomeController_1.recurring_bill_payment)
      }
  
    // @LINE:21
    case controllers_Assets_versioned12_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned12_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
