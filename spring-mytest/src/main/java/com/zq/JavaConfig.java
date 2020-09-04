package com.zq;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author  smart哥
 *
 */
@Configuration
@ComponentScan
public class JavaConfig {

	@Bean
	public User user(){
		return new User("001","momo");
	}
}
