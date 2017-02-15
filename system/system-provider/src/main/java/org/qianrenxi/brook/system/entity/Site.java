package org.qianrenxi.brook.system.entity;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.qianrenxi.brook.system.annotation.SystemResource;

@Entity
@SystemResource(name = "site")
public class Site implements Serializable {

	private static final long serialVersionUID = 832126697486695094L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	@ManyToOne
	@JoinColumn(name = "parent_id")
	private Site Parent;
	
	@Embedded
	private OperatingRecord operatingRecord;

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

	public Site getParent() {
		return Parent;
	}

	public void setParent(Site parent) {
		Parent = parent;
	}

	public OperatingRecord getOperatingRecord() {
		return operatingRecord;
	}

	public void setOperatingRecord(OperatingRecord operatingRecord) {
		this.operatingRecord = operatingRecord;
	}
	
}
