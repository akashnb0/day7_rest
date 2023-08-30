package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "stu_details")
public class Car {
    @Id
    private int id;
    private String carname;
    private String cartype;
    private String owners;
    private String currentownername;
    private long mobile;
    private String address;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(int id, String carname, String cartype, String owners, String currentownername, long mobile,
			String address) {
		super();
		this.id = id;
		this.carname = carname;
		this.cartype = cartype;
		this.owners = owners;
		this.currentownername = currentownername;
		this.mobile = mobile;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public String getCartype() {
		return cartype;
	}
	public void setCartype(String cartype) {
		this.cartype = cartype;
	}
	public String getOwners() {
		return owners;
	}
	public void setOwners(String owners) {
		this.owners = owners;
	}
	public String getCurrentownername() {
		return currentownername;
	}
	public void setCurrentownername(String currentownername) {
		this.currentownername = currentownername;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}