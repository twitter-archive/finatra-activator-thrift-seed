package com.example

import com.example.ping.thriftscala.PingService
import com.example.ping.thriftscala.PingService.Ping
import com.twitter.finatra.thrift.Controller
import com.twitter.util.Future
import javax.inject.Singleton

@Singleton
class PingController
  extends Controller
  with PingService.BaseServiceIface {

  	override val ping = handle(Ping) { args: Ping.Args =>
  		info(s"Responding to ping thrift call")
  		Future.value("pong")
  	}
}