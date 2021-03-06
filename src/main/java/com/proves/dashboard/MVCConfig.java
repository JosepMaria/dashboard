package com.proves.dashboard;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import nz.net.ultraq.thymeleaf.LayoutDialect;

@Configuration
public class MVCConfig implements WebMvcConfigurer{

	@Bean
	public LayoutDialect layoutDialect() {
	    return new LayoutDialect();
	}
}