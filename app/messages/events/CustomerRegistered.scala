package messages.events

import models.Customer

case class CustomerRegistered(customer: Customer) extends Event
