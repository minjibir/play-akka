package messages.commands

import models.Customer

case class RegisterCustomer(customer: Customer) extends Command
