package com.sh.var;

import java.util.Scanner;

public class Example {
	Scanner sc = new Scanner(System.in); // 사용자로부터 입력을 받기 위한 Scanner 객체 생성
	
	public void example1() {
		System.out.println("첫번째 정수 : ");
		int a = sc.nextInt();
		System.out.println("두번째 정수 : ");
		int b = sc.nextInt();
		System.out.println("----------------------------");
		System.out.printf("더하기 결과 : %d%n" , a + b );
		System.out.printf("빼기 결과 : %d%n" , a - b );
		System.out.printf("곱하기 결과 : %d%n" , a * b );
		System.out.printf("나누기한 몫 : %d%n" , a / b );
		System.out.printf("나누기한 나머지 : %d%n" , a % b );
	}
	
	public void example2() {
		System.out.println("가로 : ");
		float a = sc.nextFloat();
		System.out.println("세로 : ");
		float b = sc.nextFloat();
		System.out.println("----------------------------");
		System.out.printf("면적 : %s%n", a * b);
		System.out.printf("둘레 : %s%n", (a + b)*2);
	}
}
