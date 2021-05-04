// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def recurring_bill_payment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.recurring_bill_payment",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recurring_bill_payment"})
        }
      """
    )
  
    // @LINE:7
    def manage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.manage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manage"})
        }
      """
    )
  
    // @LINE:13
    def add_checking: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.add_checking",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "add_checking"})
        }
      """
    )
  
    // @LINE:16
    def one_bill_payment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.one_bill_payment",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "one_bill_payment"})
        }
      """
    )
  
    // @LINE:8
    def statement: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.statement",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "statement"})
        }
      """
    )
  
    // @LINE:12
    def add_saving: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.add_saving",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "add_saving"})
        }
      """
    )
  
    // @LINE:10
    def add_accounts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.add_accounts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "add_accounts"})
        }
      """
    )
  
    // @LINE:9
    def view_accounts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.view_accounts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "view_accounts"})
        }
      """
    )
  
    // @LINE:11
    def close_accounts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.close_accounts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "close_accounts"})
        }
      """
    )
  
    // @LINE:14
    def one_transfer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.one_transfer",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "one-transfer"})
        }
      """
    )
  
    // @LINE:15
    def recurring_transfer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.recurring_transfer",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recurring_transfer"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
