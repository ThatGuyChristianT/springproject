package com.christian.spring.project.springproject;

public class Address {

	private String street;
	private String postCode;

	public Address(String street, String postCode) {
		super();
		this.street = street;
		this.postCode = postCode;
	}

	public void start() {
		System.out.println("Bean created" + this);

	}

	public void teardown() {

	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", postCode=" + postCode + "]";
	}

}
