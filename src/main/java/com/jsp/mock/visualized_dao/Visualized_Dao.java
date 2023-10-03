package com.jsp.mock.visualized_dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.mock.visualized_dto.Visualized_Dto;
import com.jsp.mock.visualized_repository.Visualized_Repository;

@Component
public class Visualized_Dao {

	@Autowired
	Visualized_Repository repository;
	
	public String insert(Visualized_Dto dto) {
    repository.save(dto);
	return "data inserted";
	}

}
