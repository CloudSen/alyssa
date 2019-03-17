package com.umbrella.alyssa.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.SecurityBuilder;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;

/**
 * @author CloudSen
 */
@Configuration
public class SecurityConfig implements WebSecurityConfigurer {
    @Override
    public void init(SecurityBuilder securityBuilder) throws Exception {

    }

    @Override
    public void configure(SecurityBuilder securityBuilder) throws Exception {

    }
}
