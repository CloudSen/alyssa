package com.umbrella.alyssa.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author CloudSen
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {
    static {
        System.out.println("Loading MVC java based configuration...");
    }


}
