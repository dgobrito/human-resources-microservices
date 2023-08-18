package br.com.dgobrito.payrollapi.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
public class Payroll {
	
	private String workerName;
	private String description;
	private Double hourlyPrice;
	private Double workedHours;
	private Double totalPayment;
}