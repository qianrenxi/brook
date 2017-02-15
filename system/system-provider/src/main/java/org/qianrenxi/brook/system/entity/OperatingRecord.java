package org.qianrenxi.brook.system.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

@Embeddable
public class OperatingRecord implements Serializable {
	private static final long serialVersionUID = -6832522029134793266L;
	
	@CreatedBy
	private User createdBy;
	@CreatedDate
	private Date createdDate;
	@LastModifiedBy
	private User lastModifiedBy;
	@LastModifiedDate
	private Date lastModifiedDate;
}
