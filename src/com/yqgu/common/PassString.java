package com.yqgu.common;

public class PassString {

	public static void main(String[] args) {
		String x = new String("ab");
		change(x);
		System.out.println(x); // ab
	}
	
	public static void change(String x) {
		x = "cd";
		System.out.println(x); // cd
	}

}
