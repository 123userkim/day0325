package com.sist.day0325;

import java.util.Scanner;

public class Test03 {
	//시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 
	//70 ~ 79점은 C, 60 ~ 69점은 D, 
	//나머지 점수는 F를 출력하는 프로그램을 작성하시오.
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
