//package com.rish.tutorial.demo.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.thymeleaf.templatemode.TemplateMode;
//import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
//
//@Configuration
//public class TemplateConfiguration {
//
//	@Bean
//	public ClassLoaderTemplateResolver cityTemplateResolver() {
//		ClassLoaderTemplateResolver cityTemplateResolver = new ClassLoaderTemplateResolver();
//		cityTemplateResolver.setPrefix("templates/city/");
//		cityTemplateResolver.setSuffix(".html");
//		cityTemplateResolver.setTemplateMode(TemplateMode.HTML);
//		cityTemplateResolver.setCharacterEncoding("UTF-8");
//		cityTemplateResolver.setOrder(1);
//		cityTemplateResolver.setCheckExistence(true);
//
//		return cityTemplateResolver;
//	}
//}
