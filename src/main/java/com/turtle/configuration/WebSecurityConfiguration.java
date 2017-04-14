package com.turtle.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableGlobalMethodSecurity(securedEnabled = true)
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .csrf().disable()
            .authorizeRequests().antMatchers("/swagger/**", "/swagger-ui.html", "/swagger-resources/**", "/health", "/env", "/metrics", "/trace", "/status").permitAll()
            .and()
            .authorizeRequests().antMatchers("/**").permitAll(); // basically give access to everything
    }

}
