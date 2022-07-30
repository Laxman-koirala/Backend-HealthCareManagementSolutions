package com.alpha.health.healthcare.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="insurance")
@Getter
@Setter
@NoArgsConstructor
public class Insurance {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	int Id;
	private String insuranceCompany;
	private String userCode;
	private String insuranceType;
	private String Country;
	
	

}
