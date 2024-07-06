package com.sh.test.bc;

import java.util.Random;
import java.util.Scanner;

public class breakContinue {
	Scanner sc = new Scanner(System.in);
//	정수 한 개를 입력 받아, 1부터 입력 받은 정수까지의 홀수의 곱을 출력하세요.
//	출력예시
//	정수를 하나 입력하세요. => 10
//	1부터 10까지 홀수의 곱은 945입니다.
	public void test() {
	System.out.print("정수를 하나 입력하세요. => ");
	  int num = sc.nextInt();
	  int product = 1; // 홀수의 곱을 저장할 변수

	  // 1부터 입력받은 정수까지 반복
	  for (int i = 1; i <= num; i++) {
	    if (i % 2 == 0) { // i가 홀수인 경우
	      continue;
	    }
	     product *= i; // 곱하기
	      	}
	  	System.out.printf("1부터 %d까지 홀수의 곱은 %d입니다.%n", num, product);
	    	}

	public void test1() {
		System.out.print("정수를 하나 입력하세요. => ");
		int num1 = sc.nextInt();
		System.out.print("다른 정수를 하나 입력하세요. => ");
		int num2 = sc.nextInt(); 
		
		int sum = 0;
		
		for(int i = num1; i <= num2; i++) {//1; 7; i++ i가 1일때 1은 7보다 작거나 같다 맞으면 증감
			if(i%2!=0) {
			sum+=i;
		}
	}
		System.out.printf("%d부터 %d까지 홀수의 합은 %d입니다.%n", num1, num2, sum);
		}
	public void test2() {
		Random rd = new Random();
		int com = rd.nextInt(100)+1; // 0~99 +1 을 뜻함 [컴퓨터]
		int count = 0; // 몇 회만에 정답을 맞출것인가..
		
		for(;;) {
			
			System.out.println("정수를 하나 입력하세요. => ");
			int num = sc.nextInt();
			
			if(com > num) { 
				System.out.println("입력하신 정수보다 큽니다."); 
				count++;
			} else if(com < num) {
				System.out.println("입력하신 정수보다 작습니다.");
				count++;
			} else if(num==com) {
				count++;
				System.out.printf("정답입니다. %d회 만에 정답을 맞추셨습니다.", count);
				break;
			}
		}
		

	}
}


