package be.kuleuven.sessylibrary;

import com.codahale.metrics.health.HealthCheck;

public class SessyLibHealthCheck extends HealthCheck {

    @Override
    protected Result check() throws Exception {
        return Result.healthy();
    }
}
