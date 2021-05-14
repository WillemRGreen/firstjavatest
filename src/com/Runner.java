package com;

public class Runner {
	
	public static String[] list = {"example", "another", "and another"};

	public static void main(String[] args) {
		calcTask(5, 7);

	}
	
	public static void welcomeMsg() {
		System.out.println("Hello World");

	}
	
	public static void loopTest(String[] x) {
		for(int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}
	
	public static void calcTask( int x, int y) {
		int result = x + y;
		System.out.println(result);
	}

}
