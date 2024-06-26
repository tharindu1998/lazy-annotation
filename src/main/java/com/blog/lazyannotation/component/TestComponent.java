package com.blog.lazyannotation.component;

import com.blog.lazyannotation.domain.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class TestComponent {

    private final TestBean testBean;

    @Autowired
    public TestComponent(@Lazy TestBean testBean) {
        this.testBean = testBean;
    }

    // you can include other methods here
}