Spring boot 3.0.4
spring-cloud.version 2022.0.1
spring-boot-starter-actuator 3.0.4

reactor-core 3.5.3
context-propagation 1.0.2
micrometer-core 1.10.4
micrometer-observation 1.10.4
micrometer-registry-prometheus 1.10.4
micrometer-tracing 1.0.2
micrometer-tracing-bridge-brave 1.0.2

Send GET request to the localhost:8080/route. In the logs you will some logs with traceId and spanId, but they come 
from the rest controller, it receives traceparent header and set it to the TraceContext, but in the route logs, it's 
not preset
it just
DEBUG [traceId=, spanId=] 14983 --- [ctor-http-nio-4] o.s.w.s.adapter.HttpWebHandlerAdapter: [3644ba89-4] Completed 200 OK
