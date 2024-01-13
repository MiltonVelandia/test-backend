package com.milton.test.infrastructure.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable() // Deshabilitar CSRF
                .authorizeRequests(authorizeRequests ->
                        authorizeRequests.anyRequest().authenticated() // Todas las solicitudes requieren autenticación
                )
                .httpBasic(); // Habilita la autenticación básica
        return http.build();
    }
}
