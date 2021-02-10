package com.kintan.spring_demo;

public class Alien {
	 int age;
	 laptop laptop;
//	 public Alien()
//		{
//			System.out.println("object created via spring ");
//		}
	 
	 
public Alien(int age) {
		super();
		this.age = age;
	}

public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(laptop laptop) {
		this.laptop = laptop;
	}
	public void show()
	{
		System.out.println("Testing bean factory");
		laptop.complie();
	}
	
}
