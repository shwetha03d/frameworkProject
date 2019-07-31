package com.assign.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assign.app.dao.SearchAssignmentDAO;
import com.assign.app.dto.CreateAssignmentEntity;

@Service
public class SearchAssignmentService {

	@Autowired
	private SearchAssignmentDAO searchAssignmentDAO;

	public SearchAssignmentService() {
		System.out.println("created:" + this.getClass().getSimpleName());
	}

	public CreateAssignmentEntity searchAssign(long pin) {
		System.out.println("invoked searchAssign");
		CreateAssignmentEntity entity = null;
		try {
			entity = searchAssignmentDAO.searchAssignDAO(pin);
			System.out.println("Entity from DAO:" + entity);

		} catch (Exception e) {
			e.printStackTrace();

		}
		return entity;
	}

}
