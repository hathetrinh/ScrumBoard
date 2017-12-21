package com.trinhha.scrumboard.scrumboardserver.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        final CacheControl cc = CacheControl.noStore().mustRevalidate();
        registry.addResourceHandler("/**").setCacheControl(cc).addResourceLocations("classpath:/static/");
        super.addResourceHandlers(registry);
    }
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}