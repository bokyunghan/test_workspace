package com.sh.test.array;

import java.util.Scanner;

public class Array {
	public void test1() {
//		길이가 100인 배열을 선언하고
//		  1~100까지의 값을 순서대로 배열 인덱스에 넣어
//		  그 값을 출력하는 코드를 작성하세요.

		int num[] = new int[100];
		for(int i = 1; i <num.length; i++) {
			num[i]+=1+i;
			System.out.printf("%d\n",num[i]);
		}
	}
	public void test2() {
		String name[] = {"딸기", "복숭아", "키위", "사과", "바나나"};
		System.out.println(name[4]);
	}
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력 : ");
		String text = sc.next();
		System.out.println("검색문자 입력 : ");
		char ch = sc.next().charAt(0);
		int chartext = 0;
		if(ch >'a' || ch <'z') {
			for(int i =0; i < text.length(); i++) {
				if(text.charAt(i) == ch) {
					chartext++;
				}
			}
		}
		System.out.printf("출력 : 입력하신 문자열 %s에서 찾으시는 문자 %c은 %d개 입니다", text, ch, chartext);
	}
}
