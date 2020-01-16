package actors

import akka.actor.ActorLogging
import akka.persistence.PersistentActor

case class CustomerState(customers: List[Customer] = List.empty[Customer]) {
  def updated(evt: Evt): CustomerState = copy(evt.data :: events)
}

class CustomerActor extends PersistentActor with ActorLogging{

  override def persistenceId: String = "customers"

  override def receiveCommand: Receive = {
    case "" =>
      log.info("")
    case _ =>
      log.info("Error")
  }

  override def receiveRecover: Receive = {
    case _ => println("")
  }
}
