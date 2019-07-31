package com.assign.app.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assign.app.dao.UpdateDAO;
import com.assign.app.dto.AuditEntity;
import com.assign.app.dto.UserDTO;

@Service
public class UpdateService {
	@Autowired
	private UpdateDAO updateDAO;

	public UpdateService() {
		System.out.println("created:" + this.getClass().getSimpleName());
	}

	public UserDTO updateService(UserDTO udto, UserDTO oldUserDTO) {
		System.out.println("invoked update Service..");

		if (!udto.getfName().equals(oldUserDTO.getfName())) {
			AuditEntity audit = new AuditEntity();
			audit.setEntity("UserDTO");
			audit.setProperty("fName");
			audit.setOldValue(oldUserDTO.getfName());
			audit.setNewValue(udto.getfName());
			audit.setDate(new Date());

			updateDAO.changeDAO(audit);
			
		}

		if (!udto.getlName().equals(oldUserDTO.getlName())) {
			AuditEntity audit = new AuditEntity();
			audit.setEntity("UserDTO");
			audit.setProperty("lName");
			audit.setOldValue(oldUserDTO.getlName());
			audit.setNewValue(udto.getlName());
			audit.setDate(new Date());

			updateDAO.changeDAO(audit);
			
		}

		if (!udto.getMobileNo().equals(oldUserDTO.getMobileNo())) {
			AuditEntity audit = new AuditEntity();
			audit.setEntity("UserDTO");
			audit.setProperty("mobileNo");
			audit.setOldValue(oldUserDTO.getMobileNo() + "");
			audit.setNewValue(udto.getMobileNo() + "");
			audit.setDate(new Date());

			updateDAO.changeDAO(audit);
			
		}

		UserDTO dtoFromDb = updateDAO.updateDAO(udto);

		return dtoFromDb;

	}

}
