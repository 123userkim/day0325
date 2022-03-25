package com.sist.day0325;

public class MinByArr {
	//실수형 배열을 매개변수로 전달받아서 그 중에 가장 큰 수를 찾아서 반환하는 메소드를 정의하기
	 
	public double max(double[]arr) {
		double d= arr[0];
		for(int i=0; i<=arr.length; i++) {
			if(d<arr[i]) {
				d=arr[i];
			}
		}
		return d;
	}
}
