package com.algorithms;

public class Swapping {

	public static void main(String[] args) {

		int i = 10, j = 20;
		System.out.println("before swapping: i = " + i + " j = " + j);

		// swapping
		i = i + j;
		j = i - j;
		i = i - j;

		System.out.println("after swapping: i = " + i + " j = " + j);
	}

}
