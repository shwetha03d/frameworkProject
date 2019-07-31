package com.assign.app.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="audit_table")
public class AuditEntity implements Serializable {
	
	@GenericGenerator(name="auto", strategy="increment")
	@GeneratedValue(generator="auto")
	@Id
	private int id;
	@Column(name="ENTITY")
	private String entity;
	@Column(name="PROPERTY")
	private String property;
	@Column(name="OLD_VALUE")
	private String oldValue;
	@Column(name="NEW_VALUE")
	private String newValue;
	@Column(name="DATE")
	private Date date;
	
	public AuditEntity() {
		System.out.println("created:"+this.getClass().getSimpleName());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEntity() {
		return entity;
	}

	public void setEntity(String entity) {
		this.entity = entity;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getOldValue() {
		return oldValue;
	}

	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}

	public String getNewValue() {
		return newValue;
	}

	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}

	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "AuditEntity [id=" + id + ", entity=" + entity + ", property=" + property + ", oldValue=" + oldValue
				+ ", newValue=" + newValue + ", date=" + date + "]";
	}
	
	

}
