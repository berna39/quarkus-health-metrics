package com.terminator.health;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Startup;

@Startup
@ApplicationScoped
public class MyStartUpCheck implements HealthCheck {

//    The third and final type of health check procedures is startup. Startup procedures are defined as an
//    option for slow starting containers (should not be needed in Quarkus) to delay the invocations of liveness
//    probe which will take over from startup once the startup responds UP for the first time. Startup health checks
//    are defined with the @Startup qualifier.
    @Override
    public HealthCheckResponse call() {
        return HealthCheckResponse.up("The API is started");
    }
}
