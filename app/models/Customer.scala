package models

import play.api.libs.json.{Format, Json}

case class Customer(id: Int, firstName: String, lastName: String, mobileNumber: String, email: String, address: String)

object Customer {
implicit val customerFormat: Format[Customer] = Json.format[Customer]
}
