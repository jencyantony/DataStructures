package com.dsa.sortAlgorithms;

public class SelectionSort {

	public static void main(String[] args){
		int[] arr = {65,42,23,15,98,7,14,32};
		int temp, index;
		for(int i=0;i<arr.length-1;i++){
			index = i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[index]>arr[j]){
					index=j;
				}
			}
			temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}
		System.out.println("Sorted array: ");
		for(int i =0;i<arr.length;i++){
			System.out.print(arr[i]+ " ");
		}
	}
}
