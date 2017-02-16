package org.qianrenxi.brook.system.entity.support;

import static org.hamcrest.CoreMatchers.instanceOf;

import javax.persistence.PostPersist;
import javax.persistence.PrePersist;

import org.qianrenxi.brook.common.spring.SpringUtil;
import org.qianrenxi.brook.system.entity.Site;
import org.qianrenxi.brook.system.entity.Tree;
import org.qianrenxi.brook.system.repository.TreeRepository;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.util.Assert;

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
			Site site = (Site) target;
			Tree tree = new Tree();
			tree.setId(site.getId());
			tree.setName("site");
			
			TreeRepository treeRepository = SpringUtil.getBean(TreeRepository.class);
			treeRepository.save(tree);
			tree = treeRepository.findOne(1L);
			Assert.notNull(tree);
		}
	}
}
