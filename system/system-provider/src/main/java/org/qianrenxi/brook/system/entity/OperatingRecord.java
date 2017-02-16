package org.qianrenxi.brook.system.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.EntityListeners;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Embeddable
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class OperatingRecord implements Serializable {
	private static final long serialVersionUID = -6832522029134793266L;
	
	@CreatedBy
	@ManyToOne
	private User createdBy;
	@CreatedDate
	private Date createdDate;
	@LastModifiedBy
	@ManyToOne
	private User lastModifiedBy;
	@LastModifiedDate
	private Date lastModifiedDate;
	
	public User getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public User getLastModifiedBy() {
		return lastModifiedBy;
	}
	public void setLastModifiedBy(User lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
}
