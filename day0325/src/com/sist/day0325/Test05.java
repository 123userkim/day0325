package com.sist.day0325;

import java.util.Scanner;

// ��ǥ�� (12, 5)�� �� A�� x��ǥ�� y��ǥ�� ��� ����̹Ƿ� ��1��и鿡 ���Ѵ�. 
//�� B�� x��ǥ�� �����̰� y��ǥ�� ����̹Ƿ� ��2��и鿡 ���Ѵ�.
//���� ��ǥ�� �Է¹޾� �� ���� ��� ��и鿡 ���ϴ��� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. 
//��, x��ǥ�� y��ǥ�� ��� ����� ������� �����Ѵ�.
public class Test05 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int Q = 0;	//�и��� ��ġ
		
		if(x>0 && y>0) {
			Q= 1;
		}else if(x>0 && y<0){
			Q= 3;	
		}else if(x<0 && y>0) {
			Q= 2;
		}else {
			Q=4;
		}
	}
}
