package com.assign.app.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.assign.app.dto.UploadDTO;
import com.assign.app.service.UploadService;

@Controller
@RequestMapping("/")
public class UploadController {

	@Autowired
	private UploadService uploadService;

	public UploadController() {
		System.out.println("created:" + this.getClass().getSimpleName());
	}

	@RequestMapping(value = "/UploadFile.ams", method = RequestMethod.POST)
	public ModelAndView assignUploadController(UploadDTO dto) {

		System.out.println("UploadController started");
		System.out.println(dto);
		MultipartFile file = dto.getFile();
		long fsize = file.getSize();
		System.out.println("File size:" + fsize);

		String fileName = "";
		try {
			if (fsize != 0) {
				byte[] fileadd = file.getBytes();
				String fileUrl = "D:/" + file.getOriginalFilename();
				BufferedOutputStream bufferedInputStream = new BufferedOutputStream(
						new FileOutputStream(new File(fileUrl)));
				bufferedInputStream.write(fileadd);
				fileName = new SimpleDateFormat("yyyy_MM_dd_HH_mm'.zip'").format(new Date());
				System.out.println("File Name:" + fileName);
				System.out.println("File Address:" + fileUrl);
			}

			uploadService.saveAssignUpload(dto, fileName);

		} catch (IOException e) {

			e.printStackTrace();
		}

		return new ModelAndView("Upload.jsp", "msg", "Upload successfully...");

	}

}
