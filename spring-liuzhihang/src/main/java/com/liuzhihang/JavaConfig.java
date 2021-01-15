package com.liuzhihang;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

/**
 * @author liuzhihang
 * @date 2020/11/26 16:33
 */
@Configuration
@ComponentScan("com.liuzhihang")
public class JavaConfig {


	@Bean(name = "messageSource")
	public MessageSource getMessageSource() {

		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();

		messageSource.setDefaultEncoding("UTF-8");
		messageSource.addBasenames("message", "message_en");

		return messageSource;

	}

}






















