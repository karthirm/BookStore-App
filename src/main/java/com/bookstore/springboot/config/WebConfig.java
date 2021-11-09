package com.bookstore.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
 
    @Override
    public void addCorsMappings(CorsRegistry corsRegistry) {
        corsRegistry.addMapping("/**")
                .allowedOrigins("https://bookstore-angular-app.herokuapp.com")
              //  .allowedMethods("*")
                .maxAge(3600L)
                .allowedHeaders("Access-Control-Request-Method","Access-Control-Request-Headers","token","Content-Type","X-Requested-With","accept,Origin")
              //  .allowedHeaders("*")
                .exposedHeaders("Authorization")
                .allowCredentials(true);
    }
 
}
