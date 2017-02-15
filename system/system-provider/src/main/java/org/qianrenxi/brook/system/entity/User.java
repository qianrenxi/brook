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
@SystemResource(name="user")
public class User implements Serializable {
	private static final long serialVersionUID = -3250969626323435304L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String username;
	private String password;
	private String email;
	private String name;
	@ManyToOne
	@JoinColumn(name="site_id")
	private Site site;
	
	@Embedded
	private OperatingRecord operatingRecord;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Site getSite() {
		return site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

	public OperatingRecord getOperatingRecord() {
		return operatingRecord;
	}

	public void setOperatingRecord(OperatingRecord operatingRecord) {
		this.operatingRecord = operatingRecord;
	}
}
