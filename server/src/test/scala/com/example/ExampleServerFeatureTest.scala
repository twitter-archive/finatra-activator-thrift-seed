package com.example

import com.example.ping.thriftscala.PingService
import com.twitter.finatra.thrift.EmbeddedThriftServer
import com.twitter.inject.server.FeatureTest
import com.twitter.util.Future

class ExampleServerFeatureTest extends FeatureTest {

  override val server = new EmbeddedThriftServer(new ExampleServer)

  val client = server.thriftClient[PingService[Future]](clientId = "client123")

  "service" should {
    "respond to ping" in {
      client.ping().value should be("pong")
    }
  }
}
