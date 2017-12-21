package com.dsa.sortAlgorithms;

public class InsertionSort {

	public static void main(String args[]){
		int[] arr = {65,42,23,15,98,7,14,32};
		int temp;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i] > arr[i+1]){
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				while(i != 0 && arr[i] < arr[i-1]){
					temp = arr[i];
					arr[i] = arr[i-1];
					arr[i-1] = temp;
					i--;
				}
			}
		}
		System.out.println("Sorted array: ");
		for(int i =0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
