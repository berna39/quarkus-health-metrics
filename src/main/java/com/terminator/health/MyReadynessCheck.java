package com.terminator.health;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;

@Readiness
@ApplicationScoped
public class MyReadynessCheck implements HealthCheck {
//  a readiness health check which will be able to state
//  whether our application is able to process requests
    @Override
    public HealthCheckResponse call() {
        return HealthCheckResponse.up("The API is ready");
    }
}
