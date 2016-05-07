# Finatra Thrift Server Lightbend [Activator](https://www.lightbend.com/activator/docs) Template

[![Build Status](https://secure.travis-ci.org/twitter/finatra-activator-thrift-seed.png?branch=master)](http://travis-ci.org/twitter/finatra-activator-thrift-seed?branch=master)

A minimal [Activator](https://www.lightbend.com/activator/docs) seed template for creating a Finatra Thrift server application.

## Quick Start

A simple client implementation

```scala
val client: PingService[Future] = ThriftMux.client
    .configured(param.Tracer(NullTracer))
    .configured(param.Stats(NullStatsReceiver))
    .newIface[PingService.FutureIface]("localhost:9999")


client.ping().onSuccess(response => {
  println(s"response: $response")
})
```

## Running

Run the server using sbt
```sh
sbt server/run
```

## License

Licensed under the Apache License, Version 2.0: http://www.apache.org/licenses/LICENSE-2.0
