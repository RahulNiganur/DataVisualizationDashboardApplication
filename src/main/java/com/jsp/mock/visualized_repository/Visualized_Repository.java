package com.jsp.mock.visualized_repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import com.jsp.mock.visualized_dto.Visualized_Dto;

@Component
public interface Visualized_Repository extends JpaRepository<Visualized_Dto,Integer>{

}
