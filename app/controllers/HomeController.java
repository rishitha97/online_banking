package controllers;

import play.mvc.*;
import views.html.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import play.data.Form;
import play.data.FormFactory;
import play.i18n.MessagesApi;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;
import static play.libs.Scala.asScala;
/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */

    public Result index() {
        return ok(index.render());
    }
    public Result manage() {
        return ok(manage.render());
    }
    public Result statement() {
        return ok(statement.render());
    }
    public Result view_accounts() {
        return ok(view_accounts.render());
    }
    public Result add_accounts() {
        return ok(add_accounts.render());
    }
    public Result close_accounts() {
        return ok(close_accounts.render());
    }
    public Result add_saving() {
        return ok(add_saving.render());
    }
    public Result add_checking() {
        return ok(add_checking.render());
    }
    public Result one_transfer() {
        return ok(onetime_transfer.render());
    }
    public Result one_bill_payment() {
        return ok(one_bill_payment.render());
    }
    public Result recurring_transfer() {
        return ok(recurring_transfer.render());
    }
    public Result recurring_bill_payment() {
        return ok(recurring_bill_payment.render());
    }




}
