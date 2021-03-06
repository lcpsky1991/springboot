package org.dante.springboot.po;

import java.util.Date;

public class StudentPO {

	private Long id;
	private String name;
	private int age;
	private Date updateDate;
	private StudentAddressPO address;

	public StudentPO() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public StudentAddressPO getAddress() {
		return address;
	}

	public void setAddress(StudentAddressPO address) {
		this.address = address;
	}

}
