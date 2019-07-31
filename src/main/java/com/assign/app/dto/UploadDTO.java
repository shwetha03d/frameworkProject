package com.assign.app.dto;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

public class UploadDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1849065441536592794L;


	private String email;
	private String url;
	private long pin;
	private MultipartFile file;

	/*
	 * private String url; private long pin; private MultipartFile file;
	 */
	public UploadDTO() {
		System.out.println("Created:" + this.getClass().getSimpleName());
	}



	public String getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url = url;
	}



	public long getPin() {
		return pin;
	}



	public void setPin(long pin) {
		this.pin = pin;
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	public MultipartFile getFile() {
		return file;
	}



	public void setFile(MultipartFile file) {
		this.file = file;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	@Override
	public String toString() {
		return "AssignmentUploadDTO [URL=" + url + ", File=" + file + ",pin=" + pin + ", email=" + email + "]";
	}

	

}
