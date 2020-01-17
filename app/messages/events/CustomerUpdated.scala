package messages.events

import models.Customer

case class CustomerUpdated(customer: Customer) extends Event