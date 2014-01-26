package com.sorting;

public class BubbleSort {

	public static void bubbleSort(int[] array, int start, int end) {
		for (int j = 1; j < end; j++) {
			for (int i = 0; i < end - j; i++) {
				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		int[] array = { 50, 20, 30, 40, 10, 60, 70, 80 };

		for (int i : array) {
			System.out.println(i);
		}

		bubbleSort(array, 0, array.length - 1);

		System.out.println("after merging");
		for (int i : array) {
			System.out.println(i);
		}
	}

}
