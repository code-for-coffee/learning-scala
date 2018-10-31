package com.playground.awesome

import org.scalatra._
import scalate.ScalateSupport
import org.scalatra.util.conversion.TypeConverter

class PlanetsApiController extends ScalatraServlet {

  case class Planet(
    name: String,
    orbit: String,
    features: String
  )

  def toPlanet(str: String) = str.split(',').
    map(_.trim) match {
      case Array(name, orbit, features) =>
        Planet(name, orbit, features)
  }

  implicit val stringToPlanet:
    TypeConverter[String, Planet] =
      safe { 
        str => toPlanet(str)
      }

  get("/api/planets") {
    "Hello"
  }

  post("/api/planets/submit") {
    val planet = params.getAs[Planet]("name").getOrElse(
      halt(BadRequest("Please provide a name"))
    )
  }

  get("/api/planets/:debug") {
    val debug = params("debug")
  }

}
