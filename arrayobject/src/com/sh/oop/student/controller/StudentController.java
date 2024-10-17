package com.sh.oop.student.controller;

import java.util.Scanner;

import com.sh.oop.student.model.vo.Student;

public class StudentController {
	Scanner sc = new Scanner(System.in);
	final int MAX_STUDENT = 10; // 최대 10명의 학생 정보 저장
	Student[] sd = new Student[MAX_STUDENT];
	int studentIndex = 0;
	
	public void insertStdtInfo() {
		while(true) {
			for(int i = 0; i<MAX_STUDENT; i++) {
				System.out.println("학년 : ");
				int grade = sc.nextInt();
				System.out.println("몇 반 : ");
				int classroom = sc.nextInt();
				System.out.println("몇 번 : ");
				int stdtNo = sc.nextInt();
				System.out.println("이름 : ");
				String name = sc.next();
				System.out.println("점수 : ");
				int mark = sc.nextInt();
				
				sd[studentIndex++] = new Student(grade, classroom, stdtNo, name, mark);
				
				 System.out.print("학생 정보를 더 입력 하시겠습니까? >> (Y(예)/N(아니오)): ");
		            char ch = sc.next().charAt(0);
		            if (ch == 'n' || ch == 'N') {
		                break; // 루프 종료
		            } else if (ch == 'y' || ch == 'Y') {
		                continue; // 다시 입력 받기 위해 루프 계속
		            } else {
		                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
		            }
			}
			
			break; // N이 완벽하게 종료 처리 됨
		}
		}	
		

	public void printAvg() {
		System.out.println("------------------------------");
		double summark = 0;
		// 만약 MAX_STUDENT = 10일때 학생 정보를 5명만 저장해 놓고 평균 점수를 얻고자 한다면 i<studentIndex를 쓰면 됨 
		for(int i =0; i<sd.length; i++) { 
			summark += sd[i].getMark();
		}
		double avgmark = summark/sd.length;

		System.out.printf("현재 입력된 학생들의 점수의 평균은 : %.1f입니다.%n",avgmark);
	}
	
	public void printStdt() {
		System.out.println("------------------------------");
		for(int i =0; i<sd.length; i++) { // 얘도 마찬가지 2명의 정보만 알고 싶을때는 i<studentIndex를 쓰면 됨 
			System.out.printf("%d학년 %d반 %d번 %s의 점수는 %d입니다.\n",sd[i].getGrade(), sd[i].getClassroom(), sd[i].getStdtNo(), sd[i].getName(),sd[i].getMark());
		}
		}

}
