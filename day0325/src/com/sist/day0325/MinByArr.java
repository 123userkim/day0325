package com.sist.day0325;

public class MinByArr {
	//�Ǽ��� �迭�� �Ű������� ���޹޾Ƽ� �� �߿� ���� ū ���� ã�Ƽ� ��ȯ�ϴ� �޼ҵ带 �����ϱ�
	 
	public double max(double[]arr) {
		double d= arr[0];
		for(int i=0; i<=arr.length; i++) {
			if(d<arr[i]) {
				d=arr[i];
			}
		}
		return d;
	}
}
