package org.qianrenxi.brook.system.domain.support;

import static org.hamcrest.CoreMatchers.instanceOf;

import javax.persistence.PostPersist;
import javax.persistence.PrePersist;

import org.qianrenxi.brook.system.entity.Site;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class MyEntityEventListener {
	
	@PrePersist
	public void touchForCreate(Object target){
		System.out.println("====================pre persist working===================");
		System.out.println(instanceOf(target.getClass()));
	}
	
	@PostPersist
	public void postPersist(Object target){
		System.out.println("====================post persist working===================");
		if(target instanceof Site){
			
		}
	}
}
