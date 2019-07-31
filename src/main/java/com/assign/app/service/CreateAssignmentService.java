package com.assign.app.service;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.assign.app.dao.createAssignmentDAO;
import com.assign.app.dto.CreateAssignmentDTO;
import com.assign.app.dto.CreateAssignmentEntity;
import com.assign.app.util.RandomPassGenerator;

@Service
public class CreateAssignmentService {
	
	@Autowired
	private createAssignmentDAO createAssignmentDAO;
	@Autowired
	private RandomPassGenerator pinGenerate;
	
	public CreateAssignmentService() {
		System.out.println("created:\t"+this.getClass().getSimpleName());
	}
	
	public long createAssignmentService(CreateAssignmentDTO dto) {
		
		System.out.println("DTO in service:"+dto);
		long rpin=pinGenerate.generatePin();
		dto.setPin(rpin);
		CreateAssignmentEntity entity=new CreateAssignmentEntity();
		BeanUtils.copyProperties(dto, entity);
		createAssignmentDAO.createAssignmentDAOImpl(entity);
		return rpin;
		
	}

}
