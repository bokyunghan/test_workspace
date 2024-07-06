package com.sh.test.loop;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	public void test1() {
		System.out.println("문자열 입력 : ");
		String text = sc.next();
		
		System.out.println("검색할 문자 입력 : ");
		char ch = sc.next().charAt(0);
		
		int count = 0; // 총 갯수 초기화
		// 검색할 문자가 포함 되어 있는지 ch
		if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
			// 문자열의 길이 측정
			for(int i = 0; i<text.length(); i++ ) {
				// 문자열 입력 길이와 검색한 문자는 같음 (같을 경우 갯수를 더할 것 ++)
				if(text.charAt(i) == ch) {
					count++;
				} 
			} 
			System.out.println("포함된 개수 : " + count); 
		} else {
			System.out.println("영문자가 아닙니다.");
		}
	}
	public void test2() {
		String info = "";
		String name = "";
		int age = 0;
		String addr = "";
		int height = 0;
		int weight = 0;
		String phone = "";
		
		int memberCount = 2;
		
		 // 총합
		 int sumAge = 0;
		 int sumHeight = 0;
		 int sumWeight = 0;
		 
		 // 총합 평균
		 double avgAge = 0;
		 double avgHeight = 0;
		 double avgWeight = 0;

		 for(int i = 0; i < memberCount; i++) {
		 System.out.println("--------------회원정보(" + (i + 1) + ")-----------------");
		 info+=i;
		 System.out.println("이름을 입력하세요 : ");
		 name = sc.next();
		 info += " " + name;
		 System.out.println("나이를 입력하세요 : ");
		 age = sc.nextInt();
		 info += " " + age + "세";
		 System.out.println("주소를 입력하세요 : ");
		 addr = sc.next();
		 info += " " + addr;
		 System.out.println("키를 입력하세요 : ");
		 height = sc.nextInt();
		 info += " " + height + "cm"; 
		 System.out.println("몸무게를 입력하세요 : ");
		 weight = sc.nextInt();
		 info += " " + weight + "kg";
		 System.out.println("전화번호를 입력하세요 : ");
		 phone = sc.next();
		 info += " " + phone + "\n";
		 // 개인(1명) 당 합계
		 sumAge+=age;
		 sumHeight+=height;
		 sumWeight+=weight;
		 }
		 // 전체 회원 합계 평균
		 avgAge = sumAge / memberCount;
		 avgHeight = sumHeight / memberCount;
		 avgWeight = sumWeight / memberCount;

		 System.out.println("=================== 회원목록 ====================");
		 System.out.println(info);
		 System.out.println("==============================================");
		 System.out.printf("평균나이 : %.1f세 | 평균신장 : %.1fcm | 평균몸무게 : %.1fkg", avgAge, avgHeight, avgWeight);
	}
	
	public void test3() {
	// price : 개당 가격, choice : 메뉴 선정, choiceCount : 메뉴 갯수, total : 선택 메뉴(1개) 총 가격, totalLast : 총 가격
		        String menu = "김밥류 ==================\n"
		                + "1.원조김밥==========1500원\n"
		                + "2.치즈김밥==========2000원\n"
		                + "3.참치김밥==========2300원\n"
		                + "라면류 ==================\n"
		                + "4.그냥라면==========3000원\n"
		                + "5.치즈라면==========3500원\n"
		                + "6.짬뽕라면==========4000원\n"
		                + "분식류 ==================\n"
		                + "7.떡볶이===========2500원\n"
		                + "8.순대============2500원\n"
		                + "9.오뎅============1000원\n"
		                + "기타 ===================\n"
		                + "10.음료수==========1000원\n"
		                + "------------------------\n"
		                + "선택 : ";

		        int choice, price, choiceCount, total, totalLast = 0;
		        String name = "";

		        ArrayList<String> receiptList = new ArrayList<>();

		        for(;;) { // 무한루프
		            System.out.print(menu);

		            choice = sc.nextInt(); // 메뉴 선정

		            System.out.println("개수 : ");
		            choiceCount = sc.nextInt(); // 개수 
		            
		            switch(choice) {
		                case 1: name = "원조김밥"; price = 1500; break;
		                case 2: name = "치즈김밥"; price = 2000; break;
		                case 3: name = "참치김밥"; price = 2300; break;
		                case 4: name = "그냥라면"; price = 3000; break;
		                case 5: name = "치즈라면"; price = 3500; break;
		                case 6: name = "짬뽕라면"; price = 4000; break;
		                case 7: name = "떡볶이"; price = 2500; break;
		                case 8: name = "순대"; price = 2500; break;
		                case 9: name = "오뎅"; price = 1000; break;
		                case 10: name = "음료수"; price = 1000; break;
		                default:
		                    System.out.println("잘못 입력하셨습니다.");
		                    return;
		            }
		            
		            total = price * choiceCount;
		            totalLast += total; // 누적 될거임

		         // 주문 내역을 생성하는 코드
		            String receipt = name + ": " + choiceCount + "개 - " + total + "원";
		            
		         // 생성된 주문 내역을 ArrayList에 추가
		            receiptList.add(receipt);

		            System.out.print("추가 주문 하시겠습니까? (y/n) : ");
		            char ch = sc.next().charAt(0);
		            if(ch == 'y') {
		                continue; // 다시 for(;;) 무한루프 메뉴 카테고리로 이동 
		            } else {
		                break; // n면 루프가 완전히 종료됨 
		            }
		        }

		        System.out.println("==========================\n"
		                + "주문하신 정보는 다음과 같습니다.\n" + "----------------------------");

		        for(String receiptall : receiptList) {
		            System.out.println(receiptall);
		        }

		        System.out.printf("합계 : %d원\n", totalLast);
		        System.out.println("============================\n"
		                + "감사합니다 😊");
	}
	
}


