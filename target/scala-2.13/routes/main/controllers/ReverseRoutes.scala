// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def recurring_bill_payment: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "recurring_bill_payment")
    }
  
    // @LINE:7
    def manage: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manage")
    }
  
    // @LINE:13
    def add_checking: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "add_checking")
    }
  
    // @LINE:16
    def one_bill_payment: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "one_bill_payment")
    }
  
    // @LINE:8
    def statement: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "statement")
    }
  
    // @LINE:12
    def add_saving: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "add_saving")
    }
  
    // @LINE:10
    def add_accounts: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "add_accounts")
    }
  
    // @LINE:9
    def view_accounts: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "view_accounts")
    }
  
    // @LINE:11
    def close_accounts: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "close_accounts")
    }
  
    // @LINE:14
    def one_transfer: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "one-transfer")
    }
  
    // @LINE:15
    def recurring_transfer: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "recurring_transfer")
    }
  
    // @LINE:6
    def index: Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:21
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
