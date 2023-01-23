package com.sekioscorp.fly.configserver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
                .requestMatchers("/actuator/**").permitAll()
                .requestMatchers("/actuator/**").permitAll()
                .requestMatchers("/**", "/**/**", "/**/**/**", "/**/**/**/**")
                .authenticated();
                //.ignoringAntMatchers("/encrypt/**")
                // .ignoringAntMatchers("/decrypt/**");

        return http.build();
    }
}
