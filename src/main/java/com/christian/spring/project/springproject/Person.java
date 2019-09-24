package com.christian.spring.project.springproject;

public class Person {

	private int id;
	private String name;
	private int taxId;

	private Address address;

	public Person() {

	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public static Person getInstance(int id, String name) {
		System.out.println("Creating person using factory method");
		return new Person(id, name);
	}

	public void onCreate() {
		System.out.println("Created person " + this);
	}

	public void onTeardown() {
		System.out.println("Teardown method for " + this);
	}

	public void speak() {
		System.out.println("Hello, I'm a person");
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + ", address=" + address + "]";
	}
}
