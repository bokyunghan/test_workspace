package com.sh.test.condition;

import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	public void test1() {
		System.out.println("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("정수2 입력 : ");
		int num2 = sc.nextInt();
		
		if(num1 < 0 || num2 < 0 ) {
			System.out.println("잘못 입력 하셨습니다. 프로그램을 종료합니다.");
			return;
			}
		
		System.out.println("연산자 입력 (+ - * / %) : ");
		char ch = sc.next().charAt(0);
		
		
		int sum = 0; 
		if(ch == '+') {
			sum = num1 + num2;
		} else if (ch == '-') {
			sum = num1 - num2;
		} else if (ch == '*') {
			sum = num1 * num2;
		} else if (ch == '/') {
			sum = num1 / num2;
		} else if (ch == '%') {
			sum = num1 % num2;
		} else {
			System.out.println("잘못 입력 하셨습니다. 다시 입력하세요.");
			return;
		}
		
		System.out.println("---------------------------");
		System.out.printf("%d %c %d = %d", num1, ch, num2, sum);
	}
	
	public void test2() {
		System.out.println("1~10 사이의 정수 한 개를 입력해주세요 : ");
		int num = sc.nextInt();
		System.out.println("---------------------------");
		if(num < 1 || num > 10)
			System.out.println("반드시 1~10사이의 정수를 입력해야 합니다.");
		else if(num%2 == 0) {
			System.out.println("짝수다!");
		} else if(num%2 != 0){
			System.out.println("홀수다!");	
		}
	}
	public void test3() {
		System.out.println("체중입력(kg) :");
		double kg = sc.nextDouble();
		System.out.println("신장입력(cm) :");
		double cm = sc.nextDouble();
		System.out.println("---------------------------");
		double bmi = kg / (cm * cm); 
		System.out.printf("BMI 지수 : %.2f\n", bmi);
		if(bmi < 18.5) { // 18.5 이하
			System.out.println("저체중입니다.");
		}
		else if(bmi >= 18.5 && bmi < 23) {			
			System.out.println("정상체중입니다.");
		}
		else if(bmi >= 23 && bmi < 25) {			
			System.out.println("과체중입니다.");
		}
		else if(bmi >= 25 && bmi < 30) {			
			System.out.println("비만입니다.");
		}
		else if(bmi >= 30) {			
			System.out.println("고도비만입니다.");
		}
		
	}
}
