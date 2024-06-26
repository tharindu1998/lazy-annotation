package com.blog.lazyannotation.config;

import com.blog.lazyannotation.domain.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class AppConfig {

    @Bean
    @Lazy
    public TestBean testBean() {
        return new TestBean();
    }
}