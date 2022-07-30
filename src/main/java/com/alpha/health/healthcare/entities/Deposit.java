package com.alpha.health.healthcare.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="deposits")
@Getter
@Setter
@NoArgsConstructor
public class Deposit{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	private String approach;
	private int amount;
	
	@OneToOne(cascade= CascadeType.ALL, mappedBy="deposit")
	private Billing billing;
	

}
