package com.ramesh.service.jsonreturn.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class WebConfig  extends WebMvcConfigurerAdapter {

@Override
public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {

    configurer.favorPathExtension(true).
    favorParameter(false).
    ignoreAcceptHeader(true).
    //dont use Java Activation Framework since we are manually specifying the mediatypes required below
    useJaf(false).
    defaultContentType(MediaType.APPLICATION_JSON).
    mediaType("xml", MediaType.APPLICATION_XML).
    mediaType("json", MediaType.APPLICATION_JSON);
  }
}