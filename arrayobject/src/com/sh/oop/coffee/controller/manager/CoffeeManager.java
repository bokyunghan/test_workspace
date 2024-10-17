package com.sh.oop.coffee.controller.manager;

import java.util.Scanner;

import com.sh.oop.coffee.model.dto.Coffee;

public class CoffeeManager {
	Scanner sc = new Scanner(System.in);
	final int MAX_COFFEE = 3;
	Coffee cf[] = new Coffee[MAX_COFFEE];
	int coffeeIndex = 0;
	
	public void inputcoffee() {
		System.out.println("세계 3대 커피 원산지와 커피명을 입력하세요");
		
		for(int i = 0; i < MAX_COFFEE; i++) { // 3개 입력할 때 까지 반복문 재생 
			System.out.print("원산지 : ");
			String origin = sc.next();
			System.out.print("커피명 : ");
			String coffeeName = sc.next();
			
			cf[coffeeIndex++] = new Coffee(origin,coffeeName);
		}
		System.out.println("입력 완료!");
	}
	
	public void outputcoffee() {
		System.out.println("<세계" + coffeeIndex + "대커피>");
		System.out.println("원산지    커피명");
		System.out.println("-------------");
		for(int i = 0; i < coffeeIndex; i++) { // 입력값 출력
			System.out.print(cf[i].getOrigin()+"        ");
			System.out.println(cf[i].getCoffeeName());
		}
//		System.out.printf("%s%s%n" ,origin, coffeeName);
	}
}
