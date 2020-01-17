package messages.commands

import models.Customer

case class UpdateCustomer(customer: Customer) extends Command
