package actors

import akka.actor.ActorLogging
import akka.persistence.{RecoveryCompleted, _}
import messages.commands.{RegisterCustomer, UpdateCustomer}
import models.Customer

case class CustomerState(customers: List[Customer] = List.empty[Customer]) {
  //  def updated(event: Event): CustomerState = copy(customers :: event)
}

class CustomerActor extends PersistentActor with ActorLogging {

  override def persistenceId: String = "customers"

  override def receiveCommand: Receive = {

    case RegisterCustomer(customer) =>
      persist[RegisterCustomer](RegisterCustomer(customer)) {
        event => {
          println(event)
        }
      }

    case UpdateCustomer(customer) =>
      persist[UpdateCustomer](UpdateCustomer(customer)) {
        event => {
          // Update state here
          println(event)
        }
      }

    case SaveSnapshotSuccess(metadata) =>
      log.info(s"Snapshot ${metadata.sequenceNr} saved successfully.")

    case SaveSnapshotFailure(metadata, reason) =>
      log.error(s"Error saving snapshot ${metadata.sequenceNr}: $reason")


    case _ =>
      log.info("Error")
  }

  // Recovery handler
  override def receiveRecover: Receive = {
    case SnapshotOffer(metadata, snapshot) =>
    // Update state here

    case RecoveryCompleted =>
      log.info(s"Recovery complete.")

    case _ => println("")
  }

  def updateState(state: Any): Unit = {
    // Accepts state and update
  }
}
