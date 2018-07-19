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

	public  void calSalary(){
		double money = user.getSalary();
		double cal = money - 0 - 3500;
		if(cal < 1500){
			money = cal * 0.03;
		} else if(cal >= 1500 && cal < 4500){
			money = (cal-1500) * 0.1 + 1500 * 0.03;
		} else if(cal >= 4500 && cal < 9000){
			money = (cal-4500) * 0.2 + 1500 * 0.03 + 3000*0.1;
		} else if(cal >= 9000 && cal < 35000){
			money = (cal-9000) * 0.25 + 1500 * 0.03 + 3000*0.1 + 4500 * 0.2;
		} else if(cal >= 35000 && cal < 55000){
			money = (cal-35000) * 0.3 + 1500 * 0.03 + 3000*0.1 + 4500 * 0.2 + 26000*0.25;
		} else if(cal >= 55000 && cal < 80000){
			money = (cal-55000) * 0.35 + 1500 * 0.03 + 3000*0.1 + 4500 * 0.2 + 26000*0.25 + 20000*0.3;
		} else if(cal >= 80000) {
			money = cal * 0.45 + 1500 * 0.03 + 3000 * 0.1 + 4500 * 0.2 + 26000 * 0.25 + 20000 * 0.3 + 25000 * 0.35;
		}
		System.out.println("该用户"+user.getName()+"需要缴纳"+money+"元");
	}
}
