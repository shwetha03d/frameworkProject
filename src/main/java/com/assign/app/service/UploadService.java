package com.assign.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assign.app.dao.UploadDAO;
import com.assign.app.dto.UploadDTO;
import com.assign.app.dto.UploadEntity;

@Service
public class UploadService {
	
	@Autowired
	private UploadDAO uploadDAO;
	
	public UploadService() {
		System.out.println("created:"+this.getClass().getSimpleName());
	}

	public void saveAssignUpload(UploadDTO dto, String fileName) {
		
		System.out.println("invoked saveAssignUpload in Service()..");
		System.out.println("Data in Service is:" + dto);

		UploadEntity entity = new UploadEntity();
		entity.setPin(dto.getPin());
	
		entity.setEmail(dto.getEmail());
		entity.setUrl(dto.getUrl());
		entity.setFile(fileName);
	    entity.setPin(dto.getPin());
	
	    uploadDAO.saveAssignUpload(entity);
		
		System.out.println("Data in Service is:" + entity);

	}
		
		
}