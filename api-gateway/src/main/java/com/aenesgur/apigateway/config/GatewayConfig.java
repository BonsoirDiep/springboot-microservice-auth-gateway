package com.aenesgur.apigateway.config;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableHystrix
@RequiredArgsConstructor
public class GatewayConfig {

    private final AuthenticationFilter filter;

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                // .route("product-service", r -> r.path("/api/products/**")
                // .filters(f -> f.filter(filter))
                // .uri("lb://product-service"))

                .route("product-service", r -> r.path("/api/products/**")
                        .filters(f -> f
                                .circuitBreaker(
                                        c -> c.setName("order")
                                                .setFallbackUri("forward:/fallbacks/order"))
                                .filter(filter))
                        .uri("lb://product-service"))

                .route("order-service", r -> r.path("/api/orders/**")
                        .filters(f -> f.filter(filter))
                        .uri("lb://order-service"))

                .route("auth-service", r -> r.path("/auth/**")
                        .filters(f -> f.circuitBreaker(
                                c -> c.setName("auth")
                                        .setFallbackUri("forward:/fallbacks/auth"))
                                .filter(filter))
                        .uri("lb://auth-service"))

                // .route("order-service", r -> r.path("/api/orders/**")
                // .filters(f -> f.circuitBreaker(c -> c.setName("order")
                // .setFallbackUri("forward:/fallbacks/order")))
                // .uri("lb://order-service"))
                // .route("product-service", r -> r.path("/api/products/**")
                // .filters(f -> f.circuitBreaker(c -> c.setName("product")
                // .setFallbackUri("forward:/fallbacks/product")))
                // .uri("lb://product-service"))
                .build();
    }

}
