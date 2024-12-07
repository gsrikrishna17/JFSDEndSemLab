package com.klef.jfsd.exam;

import jakarta.persistence.Entity;

@Entity
public class Car extends Vehicle
{
	private int numberofdoors;

	public int getNumberofdoors() {
		return numberofdoors;
	}

	public void setNumberofdoors(int numberofdoors) {
		this.numberofdoors = numberofdoors;
	}
}
