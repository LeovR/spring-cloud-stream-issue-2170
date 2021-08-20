This project should demonstrate the issue https://github.com/spring-cloud/spring-cloud-stream/issues/2170.

With the current configuration a kafka topic `sourcetopic` should be created:

    spring.cloud.stream.function.autodetect=false
    spring.cloud.stream.source=sourceSupplier
    spring.cloud.stream.bindings.sourceSupplier-out-0.destination=sourcetopic

But instead no topic is created.

If a second bean, implementing a functional interface, is in the context (see `StreamConfiguration`) the topic will be created.
