package com.sist.day0325;

import java.util.Scanner;

public class PrintlnOneToN {
	//�ڿ��� N�� �־����� ��, 1���� N���� �� �ٿ� �ϳ��� ����ϴ� ���α׷�
	public static void main(String []args) {
		Scanner  sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println(i);
		}
	}
}
