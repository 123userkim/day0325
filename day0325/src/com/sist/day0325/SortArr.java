package com.sist.day0325;

import java.util.Scanner;

public class SortArr {

    public static void main(String[] args) {
        int num[] = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("5���� ���ڸ� ������������ �����ϴ� ���α׷��Դϴ�.");
        System.out.println("���� 5���� �Է��ϼ���.");

        for (int i = 0; i < num.length; i++) {
               num[i] = input.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
               for (int j = i + 1; j < num.length; j++) {
            	   	if (num[i] < num[j]) {
            	   			int temp = num[j];
                            num[j] = num[i];
                            num[i] = temp;
                      } else {              
                            break;
                      }
               }
        }
        for (int sort : num) {
               System.out.print(sort + " ");
        }
    }
}

