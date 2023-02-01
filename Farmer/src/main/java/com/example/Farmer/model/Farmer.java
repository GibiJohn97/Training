package com.example.Farmer.model;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="farmer")
public class Farmer implements Serializable {
	
	 @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name = "ID")
      private String varitey;
	 @Column(name = "varitey")
	 private String name ;
	 @Column(name = "name")

	

	public String getVaritey() {
		return varitey;
	}

	public void setVaritey(String varitey) {
		this.varitey = varitey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Crops> getCrops() {
		return crops;
	}

	public void setCrops(Set<Crops> crops) {
		this.crops = crops;
	}

	@OneToMany(cascade=CascadeType.ALL)
	  @JoinTable(name="surveynumber",
	  joinColumns = {@JoinColumn(name = "VARTITEY", referencedColumnName = "ID")},
	  inverseJoinColumns = {@JoinColumn(name = "CROP_NAME", referencedColumnName = "ID")})
	  private Set<Crops> crops;

	  
	}
	
	


