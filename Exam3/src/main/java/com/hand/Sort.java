package com.hand;

import java.util.List;

public class Sort implements Way {

	public List<Integer> sort(List<Integer> list){
		int arr[] = new int[list.size()+1];
		for(int i =0;i<list.size();i++){
			arr[i] = list.get(i);
		}
		for(int i = 0 ; i < arr.length-1 ;i++){
			for(int j =0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return list;
	}
}
