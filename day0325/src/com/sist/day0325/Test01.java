package com.sist.day0325;

public class Test01 {
	 
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
		
		
		//������ �迭�� �Ű������� ���޹޾Ƽ� �������� �����ϴ� �޼ҵ带 ����
		public void select(int []arr) {
			for(int i=0; i<=arr.length;i++) {
				for(int j=i+1;j<=arr.length;j++ ) {
					if(arr[j]>arr[i]) {
						int temp = arr[i];
						arr[i]=arr[j];
						arr[j]= temp; 
					}
				}
			}
		}
		
		//1���� 100���� ���ϱ�
		public void oneTosum() {
			int sum=0;
			for(int i=1;i<=100;i++) {
				sum+=i;			
			}
		}
		
		//for���� �̿��� ������ �����
		public void gugudan() {
			for(int i=1; i<=9; i++) {
				System.out.print(i+"��");
				for(int j=1; i<=9; j++) {
					System.out.print(i +"*"+j+"="+i*j);
				}
			}
		}
		
		//������ 3�ܿ��� 4�� ����� �����Ͽ� ���
		public void treeDan(){
			for(int i= 1; i<=9; i++) {
				if(!(((	3*i	)%4)==0)) {
					System.out.println(3*i);
				}
			}
		}
		
		public void lotto() {
			int []lotto=new int [6];
			for(int i=0; i<lotto.length;i++) {
				lotto[i]=(int)(Math.random()*45)+1;
				for(int j=0; j<i; j++) {
					if(lotto[i]==lotto[j]) {
						i--;
						break;
					}
				}
			}
			
		}
		
}

