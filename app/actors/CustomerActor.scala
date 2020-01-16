package actors

import akka.actor.ActorLogging
import akka.persistence.PersistentActor

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
