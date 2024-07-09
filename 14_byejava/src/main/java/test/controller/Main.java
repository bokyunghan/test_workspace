package test.controller;

import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	// 키보드로 1개의 정수형(int) 데이터를 입력 받아, 1~100 사이의 값일 때만 2의 배수인지 아닌지를 출력 처리한다.
	// 실행 결과 입력 : 3 -> 2의 배수가 아닙니다.
	// 입력 : 80 -> 2의 배수입니다.
	public void test1() {
	System.out.println("정수를 입력하세요.(1~100) : ");
	int num = sc.nextInt();
	if(num >= 1 && num <= 100) {
		if(num%2!=0) {
			System.out.println("2의 배수가 아닙니다.");
		} else {
			System.out.println("2의 배수입니다.");
		} 
	} else {
		  System.out.println("1과 100 사이의 정수를 입력해주세요.");
		
	}
	}	
}

