package com.alpha.health.healthcare.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "patients")
@Getter
@Setter
@NoArgsConstructor
public class Patient extends Auditable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String country;
	private String personalCode;
	private String email;
	private Boolean deleted;
	
	@OneToOne(cascade=CascadeType.ALL)
	private PatientType patientType;
	
	@ManyToMany(cascade=CascadeType.ALL)
	private List<Doctor> doctor = new ArrayList<>();
	
	@OneToOne(cascade=CascadeType.ALL)
	private Billing billing;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Insurance insurance;
	
	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="employee_id")
	private Employee employee;


}
