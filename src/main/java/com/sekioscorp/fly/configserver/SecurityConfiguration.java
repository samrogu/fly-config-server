package com.sekioscorp.fly.configserver;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf()
                .disable()
                .httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers("/actuator/**").permitAll()
                .antMatchers("/**", "/**/**", "/**/**/**", "/**/**/**/**")
                .authenticated();
                //.ignoringAntMatchers("/encrypt/**")
                // .ignoringAntMatchers("/decrypt/**");

        super.configure(http);
    }
}
