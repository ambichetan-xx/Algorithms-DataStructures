package com.sorting;

public class MergeSort {

	public static void mergeSort(int[] array, int start, int end) {

		if (start >= end)
			return;

		int mid = (start + end) / 2;
		mergeSort(array, start, mid);
		mergeSort(array, mid + 1, end);
		merge(array, start, mid, end);

	}

	public static void merge(int[] array, int start, int mid, int end) {

		int i = start;
		int j = mid + 1;
		int k = start;

		int[] c = new int[end + 1];

		for (int m = start; m <= end; m++) {
			c[m] = array[m];
		}

		while (i <= mid && j <= end) {
			if (array[i] < array[j])
				c[k++] = array[i++];
			else
				c[k++] = array[j++];
		}

		while (i <= mid) {
			c[k++] = array[i++];
		}

		for (int m = start; m <= end; m++) {
			array[m] = c[m];
		}

	}

	public static void main(String[] args) {

		int[] array = { 50, 20, 30, 40, 10, 60, 70, 80 };

		for (int i : array) {
			System.out.println(i);
		}

		mergeSort(array, 0, array.length - 1);

		System.out.println("after merging");
		for (int i : array) {
			System.out.println(i);
		}
	}
}
