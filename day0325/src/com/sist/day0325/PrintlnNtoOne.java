package com.sist.day0325;

import java.util.Scanner;

//�ڿ��� N�� �־����� ��, N���� 1���� �� �ٿ� �ϳ��� ���
public class PrintlnNtoOne {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i= 0; i<n; i++) {
			System.out.println(n-i);
		}
	}
}
