package com.assign.app.dto;

import java.io.Serializable;
import java.util.Date;

public class CreateAssignmentDTO implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String course;
	private String topic;
	private String description;
	private Date deadline;
	private String uploadType;
	private long pin;
	
public CreateAssignmentDTO() {
	System.out.println("created:"+this.getClass().getSimpleName());
}

public String getCourse() {
	return course;
}

public void setCourse(String course) {
	this.course = course;
}

public String getTopic() {
	return topic;
}

public void setTopic(String topic) {
	this.topic = topic;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public Date getDeadline() {
	return deadline;
}

public void setDeadline(Date deadline) {
	this.deadline = deadline;
}

public String getUploadType() {
	return uploadType;
}

public void setUploadType(String uploadType) {
	this.uploadType = uploadType;
}

public long getPin() {
	return pin;
}

public void setPin(long pin) {
	this.pin = pin;
}

@Override
public String toString() {
	return "CreateAssignmentDTO [course=" + course + ", topic=" + topic + ", description=" + description + ", deadline="
			+ deadline + ", uploadType=" + uploadType + ", pin=" + pin + "]";
}
	
	
}
