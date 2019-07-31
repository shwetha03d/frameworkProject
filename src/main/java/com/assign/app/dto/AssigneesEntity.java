package com.assign.app.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="assignees_table")
public class AssigneesEntity implements Serializable {
	
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	@Id
	private int id;
	/*@Column(name="PIN")
	private long pin;*/
	@Column(name="EMAIL")
	private String email;
	
	
	@ManyToOne
	@JoinColumn(name="PIN")
	private CreateAssignmentEntity createAssignmentEntity;
	
	public AssigneesEntity() {
		// TODO Auto-generated constructor stub
	}
	
	
	/*public long getPin() {
		return pin;
	}
	public void setPin(long pin) {
		this.pin = pin;
	}*/
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public CreateAssignmentEntity getCreateAssignmentEntity() {
		return createAssignmentEntity;
	}


	public void setCreateAssignmentEntity(CreateAssignmentEntity createAssignmentEntity) {
		this.createAssignmentEntity = createAssignmentEntity;
	}


	@Override
	public String toString() {
		return "AssigneesEntity [id=" + id + ", email=" + email + "]";
	}
	
	
	

}
