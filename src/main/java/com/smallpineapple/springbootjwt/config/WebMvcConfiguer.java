package com.smallpineapple.springbootjwt.config;

import com.smallpineapple.springbootjwt.interceptor.TokenInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Zeng
 * @date 2020/2/17 11:18
 */
@Configuration
public class WebMvcConfiguer implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getTokenInterceptor())
                .addPathPatterns("/admin/**");
    }

    @Bean
    public TokenInterceptor getTokenInterceptor(){
        return new TokenInterceptor();
    }

}
