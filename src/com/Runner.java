package com;

public class Runner {
	
	public static String[] list = {"example", "another", "and another"};

	public static void main(String[] args) {
		loopTest(list);

	}
	
	public static void welcomeMsg() {
		System.out.println("Hello World");

	}
	
	public static void loopTest(String[] x) {
		for(int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}

}
