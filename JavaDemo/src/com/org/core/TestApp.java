package com.org.core;

public class TestApp {
	public static void main(String[] args) {
		Emp e1 = new Emp();
		Emp e2 = new Emp();
		System.out.println(e1 == e2);
		System.out.println(e1.equals(e2));
	}
}
