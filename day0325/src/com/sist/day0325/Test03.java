package com.sist.day0325;

import java.util.Scanner;

public class Test03 {
	//���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� B, 
	//70 ~ 79���� C, 60 ~ 69���� D, 
	//������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a>=90) {
			System.out.println("a");
		}else if(a>=80) {
			System.out.println("b");
		}else if(a>=70) {
			System.out.println("c");
		}else if(a>=60) {
			System.out.print("d");
		}else{
			System.out.print("F");
		}
	}
}
