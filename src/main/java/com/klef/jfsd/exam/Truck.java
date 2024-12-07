package com.klef.jfsd.exam;

import jakarta.persistence.Entity;

@Entity
public class Truck extends Vehicle
{
	private String loadcapacity;

	public String getLoadcapacity() {
		return loadcapacity;
	}

	public void setLoadcapacity(String loadcapacity) {
		this.loadcapacity = loadcapacity;
	}
}
