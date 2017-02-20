package org.qianrenxi.brook.system.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.qianrenxi.brook.system.annotation.SystemResource;

@Entity
@SystemResource(name = "site")
public class Site extends Auditable {
	private static final long serialVersionUID = 2360932493937263142L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String shortName;
	@ManyToOne
	@JoinColumn(name = "parent_id")
	private Site Parent;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public Site getParent() {
		return Parent;
	}

	public void setParent(Site parent) {
		Parent = parent;
	}
	
}
