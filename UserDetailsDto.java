package com.capgemini.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Table(name="UserDetailsDto_VLA")
public class UserDetailsDto {
	
	@Id
	private String aadhar;
	
	private String address;
	private String state;
	private String city;
	private String pin;
	private String emptype;
	private double salary;
	private String pan;
	private String salarySlip;
	private String addressProof;
	
}
