package com.sh.oop.person.controller;

import java.util.Scanner;

import com.sh.oop.coffee.model.dto.Coffee;
import com.sh.oop.person.model.Person;

public class PersonController {
	
	Scanner sc = new Scanner(System.in);
	final int MAX_Person = 2;
	Person ps[] = new Person[MAX_Person];
	
	int personIndex = 0;
	
	public void input() {
		System.out.println("인적 사항을 작성해주세요.");
		for(int i =0; i<MAX_Person; i++) {
			System.out.println("이름 : ");
			String name = sc.next();
			System.out.println("나이 : ");
			int age = sc.nextInt();
			System.out.println("키 : ");
			double height = sc.nextDouble();
			System.out.println("몸무게 : ");
			double weight = sc.nextDouble();
			System.out.println("재산 : ");
			int money = sc.nextInt();
			
			ps[personIndex++] = new Person(name, age, height, weight, money);
			}
		}
	
	public void output() {
		
		System.out.println("총 인원" +"["+personIndex+"]");
		System.out.println("-------------------------------------------");
		System.out.println("이름      나이      키      몸무게     재산");
		for(int i =0; i<personIndex; i++) {
			System.out.print(ps[i].getName()+"    ");
			System.out.print(ps[i].getAge()+"    ");
			System.out.print(ps[i].getHeight()+"    ");
			System.out.print(ps[i].getWeight()+"    ");
			System.out.println(ps[i].getMoney()+"    ");
		}
	
	}
	
	public void avginformation() {
		double sumAge = 0;
		double sumHeight = 0;
		double sumWeight = 0;
		double sumMoney = 0;
		
		for(int i =0; i<ps.length; i++) {
			sumAge += ps[i].getAge();
			sumHeight += ps[i].getHeight();
			sumWeight += ps[i].getWeight();
			sumMoney += ps[i].getMoney();
		}
		
		double avgAge = sumAge/ps.length;
		double avgHeight = sumHeight/ps.length;
		double avgWeight = sumWeight/ps.length;
		double avgMoney = sumMoney/ps.length;
		
		System.out.println("-------------------------------------------");
		System.out.printf("총 평균" + "[" + "평균 나이: %.1f, 평균 키: %.1f, 평균 몸무게: %.1f, 평균 재산: %.1f" +"]",avgAge, avgHeight, avgWeight, avgMoney);
	}
	

}
