package com.assign.app.dto;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="createassignment_table")
public class CreateAssignmentEntity implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@GenericGenerator(name="auto" ,strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name="ID")
	private int id;
	@Column(name="COURSE")
	private String course;
	@Column(name="TOPIC")
	private String topic;
	@Column(name="DESCRIPTION")
	private String description;
	@Temporal(TemporalType.DATE)
	@Column(name="DEAD_LINE")
	private Date deadline;
	@Column(name="UPLOAD_TYPE")
	private String uploadType;
	@Id
	@Column(name="PIN")
	private long pin;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="PIN")
	private List<AssigneesEntity> email;
	
	public CreateAssignmentEntity() {
		System.out.println("created:\t"+this.getClass().getSimpleName());
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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

	public void setPin(long pin) {
		this.pin = pin;
	}
	public long getPin() {
		return pin;
	}

	@Override
	public String toString() {
		return "CreateAssignmentDTO [ course=" + course + ", topic=" + topic + ", description="
				+ description + ", deadline=" + deadline + ", uploadType=" + uploadType + "]";
	}
	
	
	

}
