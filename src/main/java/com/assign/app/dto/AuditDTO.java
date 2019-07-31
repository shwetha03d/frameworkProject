package com.assign.app.dto;

import java.io.Serializable;
import java.util.Date;

public class AuditDTO implements Serializable {
	private int id;
	private String entity;
	private String property;
	private String oldValue;
	private String newValue;
	private Date date;
	
	public AuditDTO() {
		System.out.println("created:/t"+this.getClass().getSimpleName());
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
		return "AuditDTO [id=" + id + ", entity=" + entity + ", property=" + property + ", oldValue=" + oldValue
				+ ", newValue=" + newValue + ", date=" + date + "]";
	}
	
	
	

}
