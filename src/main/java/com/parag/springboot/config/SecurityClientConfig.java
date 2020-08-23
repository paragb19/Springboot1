package com.parag.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@ConfigurationProperties(prefix = "yaml")
@PropertySource(value = "security-config.yml",factory = SecurityConfigPropertyFactory.class)
public class SecurityClientConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //super.configure(http);
        http.antMatcher("/**").authorizeRequests()
                .antMatchers("/","/login**").permitAll()
                .anyRequest().authenticated()
                .and()
                .oauth2Login();
    }
}
