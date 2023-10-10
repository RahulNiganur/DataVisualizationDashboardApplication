package com.jsp.mock.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.mock.visualized_dto.Visualized_Dto;
import com.jsp.mock.visualized_service.Visualized_Service;

@RestController
@RequestMapping("/visualized")
public class Visualized_Controller {

	@Autowired
	Visualized_Service service;
	
	@PostMapping("/insert1")
	public String insert(@RequestBody Visualized_Dto dto) {
		return service.insert(dto);
	}
}
