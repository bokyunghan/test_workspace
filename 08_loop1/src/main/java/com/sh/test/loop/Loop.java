package com.sh.test.loop;

import java.util.Scanner;

public class Loop {
	Scanner sc = new Scanner(System.in);
	public void test1() {
	System.out.println("정수를 입력하세요 : ");
	int num = sc.nextInt();
	
	int sum = 0;
	for(int i = 1; i <= num; i++) {
		if(i%2 == 0 ){
			sum += i;
		}
		
	}
	System.out.print("1부터 " +num+"까지 짝수의 합: " + sum);
	}

	public void test2() {
		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			if(i%2==0) {
				sum+=i;
				System.out.print("박");
			} else {
				System.out.print("수");
			}
		}
	}
//	- 정수를 입력 받아 입력된 값의 구구단 프로그램을 만들어보세요.
//	- 1~9까지만 가능하고 이외에 값을 넣으면 “잘못입력하셨습니다. 프로그램종료합니다” 출력
//	단수 입력 : 5
//	5 * 1 = 5
//	5 * 2 = 10
//	5 * 3 = 15
//	....
//
//	단수 입력 : 10
//	잘못입력하셨습니다. 프로그램종료합니다
	public void test3() {
	System.out.println("단수 입력 : ");
	int num = sc.nextInt();
	
	for(int i = 1; i <= 9; i++) {
		if(num > 0 && num < 10) {
			System.out.printf("%d * %d = %d%n",num,i,num*i);
		} else {
			System.out.println("잘못입력하셨습니다. 프로그램종료합니다");
		}
	}
	}
	
}
