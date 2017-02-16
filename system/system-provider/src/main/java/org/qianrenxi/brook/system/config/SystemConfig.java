package org.qianrenxi.brook.system.config;

import org.qianrenxi.brook.system.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing
public class SystemConfig {

	@Bean
	public AuditorAware<User> auditorProvider(){
		return new AuditorAwareImpl();
	}
}
