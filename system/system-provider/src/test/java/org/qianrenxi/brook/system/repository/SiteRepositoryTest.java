package org.qianrenxi.brook.system.repository;

import static org.junit.Assert.assertTrue;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.qianrenxi.brook.BrookApplication;
import org.qianrenxi.brook.system.config.SystemConfig;
import org.qianrenxi.brook.system.entity.Site;
import org.qianrenxi.brook.system.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { BrookApplication.class, SystemConfig.class })
@TestPropertySource(locations = { "classpath:application.properties" })
@Transactional
public class SiteRepositoryTest {

	@Autowired
	SiteRepository siteRepository;
	@Autowired
	UserRepository userRepository;

	@Test
	public void running() {
	}

	@Test
	public void testAdd() {
		User user = new User();
		user.setUsername("zhangsan");
		userRepository.save(user);

		Site site = new Site();
		site.setName("Root Site");

		siteRepository.save(site);

		assertTrue(site.getId() != null && site.getId() > 0);
		// assertTrue(site.getOperatingRecord().getCreatedBy() != null);
		assertTrue(site.getCreatedBy() != null);
	}

}
