package com.medrar.cine.domain;

public class Client {
	private String name;
	private int age;
	private int balance;

	public Client(String name, int age, int balance) {
		this.name = name;
		this.age = age;
		this.balance = balance;
	}

	public Client() {
		name = new String();
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

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", age=" + age + ", balance=" + balance + "]";
	}

}
