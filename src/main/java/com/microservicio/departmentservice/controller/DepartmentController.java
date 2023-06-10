package com.microservicio.departmentservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.microservicio.departmentservice.entity.DepartmentEntity;
import com.microservicio.departmentservice.service.DepartmentService;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {
	
	private final DepartmentService departmentService;
		
		public DepartmentController(DepartmentService departmentService) {
			this.departmentService = departmentService;
		}
	
		@PostMapping
		public DepartmentEntity createDepartment(@RequestBody DepartmentEntity departmententity) {
			return departmentService.createDepartment(departmententity);
		}
		
		@GetMapping("/{id}")
		public DepartmentEntity getDepartmentEntityById(@PathVariable Integer id) {
			return departmentService.getDepartmentEntityById(id);
		}
		
		@GetMapping
		public List<DepartmentEntity> findAll(){
			return departmentService.findAll();
		}
		
}