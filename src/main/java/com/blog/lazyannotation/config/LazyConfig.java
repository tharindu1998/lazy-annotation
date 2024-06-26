package com.blog.lazyannotation.config;

import com.blog.lazyannotation.domain.AnotherTestBean;
import com.blog.lazyannotation.domain.TestBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Bean;

@Configuration
@Lazy
public class LazyConfig {

    @Bean
    public TestBean testBean() {
        return new TestBean();
    }

    @Bean
    public AnotherTestBean anotherTestBean() {
        return new AnotherTestBean();
    }
}