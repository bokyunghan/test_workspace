package com.sh.cast.practice;

import java.util.Scanner;

public class CastingSample {
	Scanner sc = new Scanner(System.in);
	
	public void printUnicode() {
		System.out.println("문자 입력 : ");
		char ch = sc.next().charAt(0);
		System.out.println(ch + " is unicode : " + (int)ch);
	}
	public void calculatorScore(){
		System.out.println("국어 : ");
		double kor = sc.nextDouble();
		System.out.println("영어 : ");
		double eng = sc.nextDouble();
		System.out.println("수학 : ");
		double math = sc.nextDouble();
		
		int sum = (int)(kor + eng + math);
		System.out.println("-----------------------------");
		System.out.printf("총점 : %d%n" , sum);
		System.out.println("평균 : " + sum/3);
		
	}
}
