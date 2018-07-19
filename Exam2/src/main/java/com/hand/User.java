package com.hand;

public class User {

	private static User user = new User();
	private String name;
	private double salary;

	private User(){
	}
	private User(String name,double salary){
		this.name = name;
		this.salary = salary;
	}
	public static User getInstance(String name,double salary){
		user.setName(name);
		user.setSalary(salary);
		return user;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
