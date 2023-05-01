package com.terminator.health;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;

@Liveness
@ApplicationScoped
public class MyLivenessCheck implements HealthCheck {
//  a simple liveness health check procedure which states whether
//  our application is running or not
    @Override
    public HealthCheckResponse call() {
        return HealthCheckResponse.up("the API is alive");
    }

}