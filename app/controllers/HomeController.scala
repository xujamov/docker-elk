package controllers

import javax.inject._
import play.api.mvc._
import com.typesafe.scalalogging._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) with LazyLogging {

  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index = Action {
    logger.debug("Hello there")
    logger.info("THis is my text")
    logger.info("123456789789789789789789789")
    logger.debug("$$$$$$$$$$$$$$$$$$$$$$$$$$$")
    Ok(views.html.index("Your new application is ready."))
  }

}
