package com.sist.day0325;

import java.util.Scanner;

//���� �����Ǿ� �ִ� �˶��� 45�� �ռ��� �ð����� �ٲٴ� ���̴�. 
//������ �˶� �Ҹ��� ������, �˶��� ���� ���� �� �� ���̱� �����̴�. 
//�� ����� ����ϸ�, ���� ��ħ �� ��ٴ� ����� ���� �� �ְ�, �б��� �������� �ʰ� �ȴ�.

//���� ����̰� ������ �˶� �ð��� �־����� ��, â������ ����� ����Ѵٸ�, 
//�̸� ������ ���ľ� �ϴ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
public class Test06 {
 public static void main(String []args) {
	 Scanner sc = new Scanner(System.in);
	 int H = sc.nextInt(); //�ð�
	 int M = sc.nextInt(); //��
	 
	 if(M < 45) {
		 H--;
		 M= M+60;
		 if(H<0) {
			 H=23;
		 }
	 }
	 System.out.print(H);
	 System.out.print(M-45);
 }
}
