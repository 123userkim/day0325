package com.sist.day0325;

import java.util.Scanner;

public class Test04 {
//������ �־����� ��, �����̸� 1, �ƴϸ� 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ���̴�.
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(	(a%4==0)	&&	(a%10000!=0)	) {
			System.out.print("1");
		}else {
			System.out.print("2");
		}
	}
}
