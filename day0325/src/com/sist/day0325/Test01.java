package com.sist.day0325;

public class Test01 {
	 
		//실수형 배열을 매개변수로 전달받아서 그 중에 가장 큰 수를 찾아서 반환하는 메소드를 정의하기
		public double max(double[]arr) {
			double d= arr[0];
			for(int i=0; i<=arr.length; i++) {
				if(d<arr[i]) {
					d=arr[i];
				}
			}
			return d;
		}
		
		
		//정수형 배열을 매개변수로 전달받아서 내림차순 정렬하는 메소드를 정의
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
		
		//1부터 100까지 더하기
		public void oneTosum() {
			int sum=0;
			for(int i=1;i<=100;i++) {
				sum+=i;			
			}
		}
		
		//for문을 이용한 구구단 만들기
		public void gugudan() {
			for(int i=1; i<=9; i++) {
				System.out.print(i+"단");
				for(int j=1; i<=9; j++) {
					System.out.print(i +"*"+j+"="+i*j);
				}
			}
		}
		
		//구구단 3단에서 4의 배수를 제외하여 출력
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

