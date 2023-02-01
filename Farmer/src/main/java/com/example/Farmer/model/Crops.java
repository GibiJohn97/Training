package com.example.Farmer.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Crop")
public class Crops implements Serializable{

	 public Crops(String string) {
		// TODO Auto-generated constructor stub
	}

	
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name = "ID")
	  private Integer crop_name;
	@Column(name = "crop_name")
	 private String crop_ac;
	@Column(name = "crop_ac")
	 private String yield;
	@Column(name = "yield")


	public String getCrop_ac() {
		return crop_ac;
	}


	public void setCrop_ac(String crop_ac) {
		this.crop_ac = crop_ac;
	}


	public String getYield() {
		return yield;
	}


	public void setYield(String yield) {
		this.yield = yield;
	}


	public Integer getCrop_name() {
		return crop_name;
	}


	public void setCrop_name(Integer crop_name) {
		this.crop_name = crop_name;
	}


	public Crops(Integer crop_name) {
		
		this.crop_name = crop_name;
	}
}
