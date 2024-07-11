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
		System.out.println("정수를 입력하세요(1~9까지) : ");
		int num1 = sc.nextInt();
		System.out.println("정수를 하나 더 입력하세요(1~9까지) : ");
		int num2 = sc.nextInt();
		if(num1>= 1 && num1 <=9 && num2 >=1 && num2 <=9) {
			System.out.printf("합 : %d%n",num1+num2);
			System.out.printf("차 : %d%n", num1-num2);
			System.out.printf("곱 : %d%n", num1*num2);
			System.out.printf("나누기 : %d%n", num1/num2);
		} else {
			System.out.println("1~9중의 정수를 입력하세요.");
		}
	}
	// 키보드로 2개의 정수형 데이터를 입력 받아, 두 수가 모두 1부터 9까지의 수일때만 두 수의 곱이 한자리인지 두 자리인지 출력
	// 3*3 한 자리수입니다. 7*3 두자리 수입니다.
	public void test5() {
		System.out.println("정수를 입력하세요(1~9까지) : ");
		int num1 = sc.nextInt();
		System.out.println("정수를 하나 더 입력하세요(1~9까지) : ");
		int num2 = sc.nextInt();
		
		if(num1>= 1 && num1 <=9 && num2 >=1 && num2 <=9) {
			int sum = num1*num2;
			if(sum>=1&&sum<=9) {
				System.out.println("한 자리수 입니다.");
			} else if(sum>=10&&sum<=99) {
				System.out.println("두 자리수 입니다.");
			}
		} else {
			System.out.println("1~9중의 정수를 입력하세요.");
		}
		
		}
	// 키보드로 1개의 정수형(int) 데이터를 입력 받아 1부터 5까지 일때만 해당 숫자에 해당하는 결과 출력
	// switch문 이용
	// 1. 입력이 정상적으로 되었습니다. / 2. 조회가 시작되었습니다. / 3. 수정이 정상적으로 되었습니다. / 4. 삭제 / 5. 정상적으로 종료 되었습니다.
	// 1~5가 아닌 경우 - 다시 입력해주세요.(1~5사이 정수 입력)
	public void test6() {
		System.out.println("1~5사이 정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 :
			System.out.println("입력이 정상적으로 되었습니다.");
			break;
		case 2 : 
			System.out.println("조회가 시작되었습니다.");
			break;
		case 3 : 
			System.out.println("수정이 정상적으로 되었습니다.");
			break;
		case 4 : 
			System.out.println("삭제가 정상적으로 되었습니다.");
			break;
		case 5 : 
			System.out.println("정상적으로 종료 되었습니다.");
			break;	
			}
		if(num<1 || num>5) { // 1미만 5 초과 
			System.out.println("다시 입력해주세요.(1~5사이 정수 입력)");
		}
		}
	
	// 배열에 들어있는 데이터 중 홀수의 값들을 출력하고 합을 구함 (합계는 double)
	public void test7() {
		int array[] = {1,2,3,4,5,6,7,8,9,10};
		double sum = 0.0;
		
		for(int i =0; i< array.length; i++) {
			if(array[i]%2!=0) {
				sum+=array[i];
				System.out.println(array[i]);
			}
			
		}
		System.out.println("합계 : " + sum);
	}
	// 2차원 배열에 들어있는 데이터들의 합계와 평균을 구함 (합계/ 평균은 double)
	/*	int rows = array.length; // 행의 수
		int cols = array[0].length; // 열의 수
		*/
	public void test8() {
		int[][] array = {
				{12, 41, 36, 56}, 
				{82, 10, 12, 61}, 
				{14, 16, 18, 78}, 
				{45, 26, 72, 23}};
		double sum = 0;
		double avg = 0;
		int count = 0;
		for(int i = 0; i < array.length; i++) { 
			for(int j = 0; j <array[i].length; j++) {
				sum+=array[i][j];
				count++;
			}
		}
		System.out.println("합계 : "+sum);
		System.out.println("합계 : "+sum/count);
	}
	
	// 2차원 배열에 들어있는 데이터중 가장 큰 값과 가장 작은 값을 구함
	public void test9() {
		int[][] array = {
				{12, 41, 36, 56}, 
				{82, 10, 12, 61}, 
				{14, 16, 18, 78}, 
				{45, 26, 72, 23}};
		
		int max = Integer.MIN_VALUE; // 큰 값
		int min = Integer.MAX_VALUE; // 작은 값
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j <array[i].length; j++) {
				
				if(max < array[i][j]) {
					max = array[i][j];
				} else if(min > array[i][j]) {
					min = array[i][j];
				}
			}
			
		}
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);
	}
	// 2차원 배열에 들어있는 데이터들 중 3의 배수만 골라내서 새로운 1차원 배열에 기록하고 출력 (단, 중복 값은 하나만 기록)
	public void test10() {
		// 2차원 배열 선언 및 초기화
	    int[][] array = {
	        {12, 41, 36, 56}, 
	        {82, 10, 12, 61}, 
	        {14, 16, 18, 78}, 
	        {45, 26, 72, 68}};
	    
	    // 3의 배수가 몇 개일지 모르므로 최대 크기의 배열을 생성한다.
	    int[] copyArr = new int[array.length * array[0].length];
	    int copyIndex = 0;
	    
	    // 2차원 배열을 순회
	    for(int i = 0; i < array.length; i++){
	        abc: // continue abc를 사용하여 바깥 루프를 제어하기 위해 라벨을 지정
	        for(int j = 0; j < array[i].length; j++){
	            // 3의 배수 검사
	            if(array[i][j] % 3 == 0){
	                // 중복 검사: 중복된 수가 있다면, copyArr에 담지 않는다.
	                for(int k = 0; k < copyIndex; k++){
	                    if(copyArr[k] == array[i][j]){
	                        // 중복된 경우 다음 요소로 이동
	                        continue abc;
	                    }
	                }
	                // 중복이 아닌 경우 copyArr에 담는다.
	                copyArr[copyIndex++] = array[i][j];
	            }       
	        }
	    }
	    
	    // 출력
	    System.out.print("3의 배수 =[");
	    for(int i = 0; i < copyIndex; i++)
	    	System.out.print(copyArr[i] + (i != copyIndex - 1 ? ", " : ""));
	    System.out.println("]");
	}
}
	


