package com.springmvc.javaconfiguration;

import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/*
 This class is a alternative for spring-mvc-demo-servlet.xml file. only java code
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.springmvc")
public class SpringMvcDemoJavaConfig {
    //define the required beans as did in spring-mvc-demo-servlet.xml file


    // define a bean for ViewResolver
    @Bean
    public ViewResolver viewResolver() {

        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".jsp");

        return viewResolver;
    }
    // define bean for ResourceBundle to load properties files
    @Bean
    public MessageSource messageSource(){
        ResourceBundleMessageSource resourceBundleMessageSource = new ResourceBundleMessageSource();
        resourceBundleMessageSource.setBasenames("/messages");
        return  resourceBundleMessageSource;
    }

}
