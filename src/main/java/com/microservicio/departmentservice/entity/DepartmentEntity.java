package com.microservicio.departmentservice.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "departments")
@Data						//crea los get y set automaticamente 
@AllArgsConstructor			//crea el constructor automaticamente
@NoArgsConstructor  		//crea el constructor vacio automaticamente

public class DepartmentEntity {
	
	@Id															//clave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY)         //genera de manera automatica el incremento
	private Integer id;
	private String name;
	private String code;
}
