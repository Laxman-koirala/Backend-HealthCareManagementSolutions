package com.alpha.health.healthcare.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "billings")
@Getter
@Setter
@NoArgsConstructor
public class Billing {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="deposit_id")
	private Deposit deposit;
	
	private int total_cost;
	private boolean checkout;

}
