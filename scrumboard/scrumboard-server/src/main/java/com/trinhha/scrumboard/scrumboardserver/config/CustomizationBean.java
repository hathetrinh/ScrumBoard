package com.trinhha.scrumboard.scrumboardserver.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class CustomizationBean implements EmbeddedServletContainerCustomizer {

    @Value("${scrumboard.context.port}")
    private String port;

    @Value("${scrumboard.context.path}")
    private String path;

    @Override
    public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
        configurableEmbeddedServletContainer.setPort(Integer.parseInt(this.port));
        configurableEmbeddedServletContainer.setContextPath(this.path);
        configurableEmbeddedServletContainer.addErrorPages(new ErrorPage(HttpStatus.BAD_REQUEST, "/400"));
        configurableEmbeddedServletContainer.addErrorPages(new ErrorPage("/error"));
    }
}
