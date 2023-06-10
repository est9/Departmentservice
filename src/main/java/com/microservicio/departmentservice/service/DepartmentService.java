package com.microservicio.departmentservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microservicio.departmentservice.entity.DepartmentEntity;
import com.microservicio.departmentservice.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	private final DepartmentRepository departmentRepository;

	public DepartmentService(DepartmentRepository departmentRepository) {
		
		this.departmentRepository = departmentRepository;
	}
	
	public DepartmentEntity createDepartment(DepartmentEntity departmententity) {
		return departmentRepository.save(departmententity);
	}
	
	public DepartmentEntity getDepartmentEntityById(Integer id) {
		return departmentRepository.findById(id).get();
	}

	public List<DepartmentEntity> findAll(){
		return departmentRepository.findAll();
	}


}
