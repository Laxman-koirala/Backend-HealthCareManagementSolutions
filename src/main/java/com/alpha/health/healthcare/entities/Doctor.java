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
@Table(name="doctors")
@Getter
@Setter
@NoArgsConstructor
public class Doctor extends Auditable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id;
	private String name;
	private String country;
	private String personalCode;
	private String email;
	private String password;
	private Boolean availability;
	private String speciality;
	private Boolean deleted;
	

}
