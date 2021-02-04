package com.dibyanshugtm.ShoppingCart;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class WebConfig implements WebMvcConfigurer {

    //@Override
    //public void addViewControllers(ViewControllerRegistry registry) {
      //  registry.addViewController("/").setViewName("home");
    //}


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/media/**")
                .addResourceLocations("file:///D:/SpringBoot/ShoppingCart/src/main/resources/static/media/");
    }
}
