package com.playground.awesome

import org.scalatra._
import scala.collection.mutable.ListBuffer
import scalate.ScalateSupport
import org.scalatra.util.conversion.TypeConverter

class AppRouter extends ScalatraServlet {

  object AppModel {
    val planets = ListBuffer[Planet]()
  }

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

  get("/") {
    contentType = "text/html"
    "Hello there, Planetary explorer."
  }

  get("/api/planets") {
    AppModel.planets
  }

  post("/api/planets/submit") {
    val name = params.getAs[String]("name").getOrElse(
      halt(BadRequest("Please provide a name"))
    )
    val orbit = params.getAs[String]("orbit").getOrElse(
      halt(BadRequest("Please provide an orbit"))
    )
    val features = params.getAs[String]("features").getOrElse(
      halt(BadRequest("Please provide planetery feastures"))
    )
    AppModel.planets += new Planet(name, orbit, features)
  }

  get("/api/planets/:debug") {
    val debug = params("debug")
  }

}
