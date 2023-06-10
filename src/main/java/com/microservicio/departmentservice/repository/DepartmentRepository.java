package com.microservicio.departmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicio.departmentservice.entity.DepartmentEntity;

public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Integer>{

}
