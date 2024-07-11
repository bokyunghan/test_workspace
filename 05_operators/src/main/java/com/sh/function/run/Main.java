package com.sh.function.run;

import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public void opSample1() {
		System.out.println("국어 : ");
		int kor = sc.nextInt();
		System.out.println("영어 : ");
		int eng = sc.nextInt();
		System.out.println("수학 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum / 3;
		
		boolean num = (kor >= 40) && (eng >= 40) && (math >= 40) && (avg >= 60);
		System.out.println("--------------------");
		System.out.printf("평균 : %s%n" , avg);
		System.out.println(num ? "합격" : "불합격"); // 40점 이상 / 평균 60점 이상이면 합격 아니면 불합격 
		
	}
	
	public void opSample2() {
		System.out.println("학생 이름 : ");
		String name = sc.next();
		System.out.println("학년 : ");
		int grade = sc.nextInt();
		System.out.println("반 : ");
		int classroom = sc.nextInt();
		System.out.println("번호 : ");
		int num = sc.nextInt();
		System.out.println("성별(남/여) : ");
		char gender = sc.next().charAt(0);
		System.out.println("성적 : ");
		double score = sc.nextDouble();
		
		String gender1 = gender == '남' ? "남" : "여";
		System.out.println("--------------------");
		System.out.printf("%d학년 %d반 %d번 %s학생 %s의 성적이 %.2f이다.", grade, classroom, num, gender, name ,score);
		
	}
	
	public void opSample3() {
		System.out.println("숫자(소수점 없이)를 입력하세요 : ");
		int num = sc.nextInt();
		
		System.out.println(num > 0 ? "양수다" : "양수가 아니다");
	}
	
	public void opSample4() {
		System.out.println("숫자(소수점 없이)를 입력하세요 : ");
		int num = sc.nextInt();
		
		System.out.println((num%2)==0 ? "짝수다" : "짝수가 아니다");
	}
}
