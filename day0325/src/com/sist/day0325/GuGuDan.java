package com.sist.day0325;

import java.util.Scanner;
//N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��� ���Ŀ� ���缭 ����ϸ� �ȴ�.
public class GuGuDan {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i = 1; i<=9 ;i++) {			
			System.out.println(a+"*"+i+"="+(a*i));
		}	 
	}
}