package com.playground.awesome

import org.scalatra._

class AppRouter extends ScalatraServlet {

  get("/") {
    views.html.hello()
  }

}
