namespace java com.example.ping.thriftjava
#@namespace scala com.example.ping.thriftscala
namespace rb Ping

include "finatra-thrift/finatra_thrift_exceptions.thrift"

service PingService {

	/**
	 * Respond with 'pong'
	 */
	 string ping() throws (
	 	1: finatra_thrift_exceptions.ClientError clientError,
    	2: finatra_thrift_exceptions.ServerError serverError
	 )
}