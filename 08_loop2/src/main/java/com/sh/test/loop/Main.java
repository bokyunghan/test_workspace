package com.sh.test.loop;

import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
//	- 문자열과 문자열에서 검색될 문자를 입력 받아 문자열에 그 문자가 몇 개이었는지 개수를 확인하는 프로그램을 작성하세요.
//	- 또, 검색할 문자가 영문자가 아니면 "영문자가 아닙니다." 출력후
//	프로그램을 종료하세요.
//	- 문자열의 길이를 리턴하는 String의 메소드를 api에서 찾아 사용하세요.
//	문자열 입력 : application
//	검색할 문자 입력 : p
//	'p'가 포함된 갯수 : 2 개
//
//
//	문자열 입력 : apple_test123
//	문자 입력 : ㄱ
//	영문자가 아닙니다.
	public void test1() {
		System.out.println("문자열 입력 : ");
		String text = sc.next();
		System.out.println("문자 입력 : ");
		char ch = sc.next().charAt(0);
		if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
			int cnt = 0;
			
			for(int i = 0; i < text.length(); i++) {
				char c = text.charAt(i);
				if(c == ch)
					cnt++;
				
			}
			System.out.println("'" + ch + "'가 포함된 갯수 : " + cnt + "개");
			
		} else {
			System.out.println("영문자가 아닙니다. 프로그램을 종료합니다.");
		}
	}
}
