import actors.CustomerActor
import com.google.inject.AbstractModule
import play.api.libs.concurrent.AkkaGuiceSupport


class Module extends AbstractModule with AkkaGuiceSupport {

  override def configure(): Unit = {
    bindActor[CustomerActor]("customer-actor")
  }

}
