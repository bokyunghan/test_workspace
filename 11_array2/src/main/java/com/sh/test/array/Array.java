package com.sh.test.array;

import java.util.Scanner;

public class Array {
	Scanner sc = new Scanner(System.in);
	public void test1() {
	 
    System.out.println("전화번호 입력 : ");  // 전화번호 입력 받기
    String nums = sc.next(); // 예: "01012345678"
    
    // 전화번호 길이만큼의 문자 배열 생성
    char ch[] = new char[nums.length()]; // 예: ch 배열의 길이는 11 (01012345678)
    char copy[] = new char[ch.length]; // 동일한 길이의 copy 배열 생성

    // 문자 배열 'ch'에 전화번호 문자열 'nums'의 각 문자 복사 (원본 데이터)
    for(int i = 0; i < nums.length(); i++) {
        ch[i] = nums.charAt(i); // nums의 각 문자를 ch 배열에 복사
    }

    // 문자 배열 'copy'에 'ch'의 내용을 복사 (를 복사한 데이터) 
    for(int i = 0; i < nums.length(); i++) {
        copy[i] = ch[i]; // ch 배열의 각 문자를 copy 배열에 복사
    }

    // 출력 부분
    System.out.print("출력 : ");
    for(int i = 0; i < nums.length(); i++) {
        // 전화번호의 4번째부터 7번째까지 문자를 '*'로 대체
        if(i >= 3 && i <= 6) {
            copy[i] = '*'; // 예: 01012345678 -> 010****5678
        }
        System.out.print(copy[i]); // copy 배열의 각 문자를 출력
    }
    System.out.println(); // 줄 바꿈
}
	
	
	public void test2() {
	System.out.print("홀수인 양의 정수를 하나 입력하세요 ==>");
	int num = sc.nextInt();
	int[] nums = new int[num];
	int a = 1;

	
	if(num%2!=0) {
		System.out.print("[");
		for(int i = 0; i < nums.length; i++) {
			if(i < nums.length/2) { // 배열 인덱스 중앙을 찾기 위해 나누기 
				nums[i] = a++;
			} else {
				nums[i] = a--;
			}
			System.out.print(nums[i] + ",");
		}
		System.out.print("]");
	} else {
		System.out.println("잘못 입력했습니다. 홀수가 아닙니다.");
	}
	
	}
}


