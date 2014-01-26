package com.searching;

import com.sorting.*;

public class BinarySeach {

	public static int normalBinarySeach(int[] array, int x, int start, int end) {

		while (start <= end) {
			int mid = (start + end) / 2;
			if (x == array[mid]) {
				return mid;
			}
			if (array[mid] <= x)
				start = mid + 1;
			else
				end = mid - 1;
		}

		return -1;
	}

	public static void recursiveinarySearch(int[] array, int x, int start,
			int end) {
		if (start >= end)
			return;
		int mid = (start + end) / 2;
		if (array[mid] == x) {
			System.out.println("found at : " + mid);
			return;
		}
		recursiveinarySearch(array, x, start, mid);
		recursiveinarySearch(array, x, mid + 1, end);
	}

	public static void main(String[] args) {
		int[] array = { 50, 20, 30, 40, 10, 60, 70, 80 };
		MergeSort.mergeSort(array, 0, array.length - 1);

		System.out.println(normalBinarySeach(array, 10, 0, array.length - 1));
		recursiveinarySearch(array, 40, 0, array.length - 1);
	}
}
