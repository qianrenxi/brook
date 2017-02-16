package org.qianrenxi.brook.system.config;

import org.qianrenxi.brook.system.entity.User;
import org.springframework.data.domain.AuditorAware;

public class AuditorAwareImpl implements AuditorAware<User> {

	@Override
	public User getCurrentAuditor() {
		User user = new User();
		user.setId(1L);
		return user;
	}
	
}
