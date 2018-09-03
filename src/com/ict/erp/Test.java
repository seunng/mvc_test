package com.ict.erp;

import java.util.Arrays;

public class Test {
	private String name;
	private int age;
	private String[] hobbies;
	private int[] luckyNums;
	
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
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	public int[] getLuckyNums() {
		return luckyNums;
	}
	public void setLuckyNums(int[] luckyNums) {
		this.luckyNums = luckyNums;
	}
	@Override
	public String toString() {
		return "Test [name=" + name + ", age=" + age + ", hobbies=" + Arrays.toString(hobbies) + ", luckyNums="
				+ Arrays.toString(luckyNums) + "]";
	}
	
	
}
