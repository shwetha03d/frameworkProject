package com.assign.app.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name ="upload_table")
public class UploadEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3033934661820224091L;
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Id
	private int id;
	@Column(name = "EMAIL_ID")
	private String email;
	@Column(name = "PIN")
	private long pin;
	@Column(name = "URL")
	private String url;
	@Column(name = "FILE")
	private String file;

	public UploadEntity() {
		System.out.println("created:"+this.getClass().getSimpleName());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPin() {
		return pin;
	}

	public void setPin(long pin) {
		this.pin = pin;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	@Override
	public String toString() {
		return "AssignUploadEntity [id=" + id + ", email=" + email + ", pin=" + pin + ", url=" + url + ", file=" + file + "]";
	}

}
