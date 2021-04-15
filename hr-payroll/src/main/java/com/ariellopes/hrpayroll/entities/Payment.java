package com.ariellopes.hrpayroll.entities;

import java.io.Serializable;

import lombok.Data;

@Data
public class Payment implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Double dailyIncome;
	private Integer days;
	
	public Payment() {
	}
	
	public Payment(String name, Double dailyIncome, Integer days) {
		super();
		this.name = name;
		this.dailyIncome = dailyIncome;
		this.days = days;
	}
	
	public double getTotal() {
		return days * dailyIncome;
	}

}
