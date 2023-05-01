# quarkus-health-metrics

Quarkus application demo of implementation of Eclipse Microprofile Metrics and Health to monitor
application state information to external viewers.

### Metrics

Metrics allows applications to gather metrics and statistics that provide insights 
into what is happening inside an application. The metrics can be read remotely using the JSON or 
OpenMetrics format to be processed by additional tools such as Prometheus and stored for analysis
and visualization.

### Health

Health allows applications to provide information about their state to external viewers
which is typically useful in cloud environments where automated processes must be able to determine
whether the application should be discarded or restarted

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```
## Endpoints
```shell script
http://localhost:8080/
http://localhost:8080/todo #for todos
http://localhost:8080/q/metrics/base #for CPU, ClassLoader, ... metrics
http://localhost:8080/q/metrics/metrics #for memoryPool, ... metrics
http://localhost:8080/q/metrics/application #for your custom metrics implemented...with annotations
http://localhost:8080/q/health-ui/ # Quarkus Health UI Interface 
```

## Testing Tools

```
Postman #dont forget to use the JSOM encoding for requests
```

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using: 
```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/quarkus-health-metrics-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.

## Related Guides

- SmallRye Health ([guide](https://quarkus.io/guides/smallrye-health)): Monitor service health
- SmallRye Metrics ([guide](https://quarkus.io/guides/smallrye-metrics)): Expose metrics for your services



