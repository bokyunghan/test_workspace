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
	// 2단에서 5단까지의 구구단 결과 중 홀수인 것만 출력한다. 단, for문을 이용한다.
	// 3*1=3 ... 5*1=5...5*9=45
	public void test2() {
	for(int i = 2; i <=5; i++)	{
		if(i%2==0){
			// 짝수일때 실행 X 
			continue;
		}
		System.out.printf("=========%d단=========\n",i);
		for(int j = 1; j <= 9; j++) {
			System.out.printf("%d*%d=%d\n",i,j,i*j);
		}
	}
	}
	// 1부터 100까지의 모든 정수들의 합과 평균을 구하는 프로그램을 작성한다.
	// 단, while문이라 do while문을 이용하여 작성한다.
	// 합계와 평균은 double 형으로 계산한다. (합계 : xxx , 평균 : xxx)
	public void test3() {
		// for문 사용했을 때 
	//	double sum = 0;
	//	double avg = 0;
	//	for(int n =1; n <= 100; n++) {
	//	sum+=n;
	//		}
	//	System.out.println("합계 : "+ sum);	
	//	System.out.println("평균 : "+ sum/100);		
		
		// while문을 사용했을 때	
		double sum = 0.0;
		int num = 1;
		
		while(num<=100) {
			sum+=num;
			num++;
		}
		
		System.out.printf("합계 : %.0f\n", sum);
		System.out.printf("평균 : %.1f\n", sum/100);
	}
	// main의 argument로 1자리 정수형(1부터 9까지만)값을 2개 입력받아 4칙연산 결과를 출력한다.
	// 입력값은 모두 int형으로 처리한다. (합 : / 차 : / 곱 : / 나누기 : /)
	public void test4() {
		
	}

	}


