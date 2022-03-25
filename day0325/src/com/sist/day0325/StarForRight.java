package com.sist.day0325;

import java.util.Scanner;

public class StarForRight {
//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//하지만, 오른쪽을 기준으로 정렬한 별
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=n; j>i+1; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
	}
}
