package com.jsp.mock.visualized_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.mock.visualized_dao.Visualized_Dao;
import com.jsp.mock.visualized_dto.Visualized_Dto;

@Component
public class Visualized_Service {

	@Autowired
	Visualized_Dao dao;
	
	public String insert(Visualized_Dto dto) {
		
		return dao.insert(dto);
	}

}
