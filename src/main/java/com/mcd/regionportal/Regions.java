package com.mcd.regionportal;

import javax.persistence.*;

@Entity
@Table(name = "regions")
public class Regions {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    
    @Column
    private String regionId;
    
    @Column
    private String countryNames;
    
    @Column
    private String regionNames;

	public String getRegionNames() {
		return regionNames;
	}

	public void setRegionNames(String regionNames) {
		this.regionNames = regionNames;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRegionId() {
		return regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getCountryNames() {
		return countryNames;
	}

	public void setCountryNames(String countryNames) {
		this.countryNames = countryNames;
	}
    
   
}
