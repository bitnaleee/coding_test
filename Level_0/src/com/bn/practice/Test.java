package com.bn.practice;

import java.util.Scanner;

public class Test {
	
	Scanner sc = new Scanner(System.in);
	
	// 두 수의 곱
	public void test1() {
		
		int answer = 0;
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		if(num1 >= 0 && num1 <= 100 && num2 >= 0 && num2 <= 100) {
			answer = num1 * num2;
			System.out.println("곱하기 결과 : " + answer);
		}
		
	}
	
	// 문자열 출력하기
	public void test2() {
	
		System.out.print("문자열 : ");
        String str = sc.next();
        int a = str.length();
        if(a >= 1 && a <= 1000000) {
            System.out.print(str);
        }
		
	}
	
	// a와 b 출력하기
	public void test3() {
		
		System.out.print("정수1 : ");
		int a = sc.nextInt();
		System.out.print("정수2 : ");
        int b = sc.nextInt();

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
	}
	
	

	
	
	
	
	
	
	
	
	
	

}
