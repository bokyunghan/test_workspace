package com.sh.test.array;

import java.util.Scanner;

public class Array {
	Scanner sc = new Scanner(System.in);
	public void test1() {
	System.out.println("전화번호 입력 : ");
	String nums = sc.next(); // 전화번호 입력 받음
	char ch[] = new char[nums.length()]; // 전화번호 길이만큼의 문자 배열 생성
	char copy[] = new char[ch.length]; // 동일한 길이의 문자 배열 생성
	
	for(int i = 0; i <nums.length(); i++) {
		ch[i] = nums.charAt(i);
	}
	
	for(int i = 0; i<nums.length(); i++) {
		copy[i] = ch[i];
	}
	System.out.print("출력 : ");
	for(int i =0; i<nums.length(); i++) {
		if(i >= 3 && i<=6) {
			copy[i] = '*';
		}
		System.out.print(copy[i]);
	}
	
	}
//	public void test2() {
//	
//	}
//	public void test3() {
//		
//	}
}
