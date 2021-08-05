package com.springmvc.javaconfiguration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/*
 This class is a alternative for web.xml file. only java code
 */
public class ServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    // configure our SpringMvcDemoJavaConfig class
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcDemoJavaConfig.class};
    }

    //configure url pattern for directing to dispatcher servlet
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
