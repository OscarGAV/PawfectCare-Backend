package pe.upc.pawfectcaremicroservices.gatewayservice.infrastructure.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.web.cors.reactive.CorsConfigurationSource;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

import java.util.List;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
        http
                //.cors(corsSpec -> corsSpec.configurationSource(corsConfigurationSource()))
                .csrf(ServerHttpSecurity.CsrfSpec::disable)
                .authorizeExchange(exchanges -> exchanges
                        .pathMatchers(HttpMethod.OPTIONS, "/**").permitAll()
                        .pathMatchers(
                                "/swagger-ui.html",
                                "/swagger-ui/**",
                                "/v3/api-docs/**",
                                "/v3/api-docs/swagger-config",
                                "/webjars/**",
                                "/*/v3/api-docs/**",
                                "/appointment-service/**",
                                "/pet-service/**",
                                "/pet-owner-service/**",
                                "/medical-record-service/**",
                                "/schedule-service/**",
                                "/review-service/**",
                                "/diagnostic-service/**",
                                "/veterinary-service/**",
                                "/iam-service/**"
                        ).permitAll()
                        .anyExchange().authenticated()
                );
        return http.build();
    }

    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration cors = new CorsConfiguration();
        cors.setAllowedOrigins(List.of(
                "https://pawfect-care-app-web-ef319.web.app",
                "https://*.azurewebsites.net",
                "http://localhost:4200",
                "http://localhost:8010", // Gateway Swagger
                "http://localhost:8122", // IAM Service
                "http://localhost:8099", // Medical Record Service
                "http://localhost:8098", // Diagnostic Service
                "http://localhost:8097", // Schedule Service
                "http://localhost:8096", // Appointment Service
                "http://localhost:8095", // Review Service
                "http://localhost:8094", // Pet Owner Service
                "http://localhost:8093", // Pet Service
                "http://localhost:8092" // Veterinary Service
                )
        );
        cors.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE", "OPTIONS"));
        cors.setAllowedHeaders(List.of("*"));
        cors.setAllowCredentials(true);
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", cors);
        return source;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}