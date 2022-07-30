package com.alpha.health.healthcare.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;


import lombok.*;

@Entity
@Table(name = "employees")
@Getter
@Setter
@NoArgsConstructor
public class Employee extends Auditable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String country;
	private String personalCode;
	private String email;
	private String password;
	private Boolean deleted;

	
	@OneToMany(mappedBy="employee", cascade= CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Patient> patients = new ArrayList<>();
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(name="employee_role",
	joinColumns=@JoinColumn(referencedColumnName="id"),
	inverseJoinColumns=@JoinColumn(referencedColumnName="id"))	
	private Set<Role> roles = new HashSet<>();
	

}
