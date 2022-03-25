package com.sist.day0325;

import java.util.Scanner;

//자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력
public class PrintlnNtoOne {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i= 0; i<n; i++) {
			System.out.println(n-i);
		}
	}
}
