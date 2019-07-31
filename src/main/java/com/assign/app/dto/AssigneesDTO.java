package com.assign.app.dto;

import java.util.Arrays;

public class AssigneesDTO {
	
	private long pin;
	private String email;
	
	public AssigneesDTO() {
		System.out.println("created:"+this.getClass().getSimpleName());
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

	@Override
	public String toString() {
		return "AssigneesDTO [pin=" + pin + ", email=" + email + "]";
	}

	

}
