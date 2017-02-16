package org.qianrenxi.brook;

import org.qianrenxi.brook.common.spring.SpringUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@PropertySource("classpath:application.properties")
public class BrookApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(BrookApplication.class, args);
	}
	
	@Bean
	public SpringUtil springUtil(){
		return new SpringUtil();
	}

}
