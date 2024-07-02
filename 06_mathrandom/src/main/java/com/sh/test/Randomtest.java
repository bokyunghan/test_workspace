package com.sh.test;

import java.util.Random;
import java.util.Scanner;

public class Randomtest {
	public void r1() {
		Random rd = new Random(); // 랜덤 값 부여
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== 가위 바위 보 게임 ===");
		System.out.print("숫자를 선택하세요.(1.가위/2.바위/3.보) : ");
		int player = sc.nextInt(); // 주인장 (me)
		
		System.out.println("======= 결과 =======");
		String first = (player == 1) ? "가위" :((player == 2) ? "바위" : "보"); 
		System.out.println("당신은 " + first + "를 냈습니다.");
		int com = rd.nextInt(3)+1; // 0~2 +1 을 뜻함 [컴퓨터]
		String second = (com == 1) ? "가위" : ((com == 2) ? "바위" : "보");
		System.out.println("컴퓨터는 " + second + "를 냈습니다.");
		
		System.out.println("====================");
		
		switch(player) {
		case 1: {
			System.out.println((com == 3) ? "이겼어요!" : (com == 1) ? "비겼어요.." : "졌어요");
			break;
		}
		case 2: {
			System.out.println((com == 1) ? "이겼어요!" : (com == 2) ? "비겼어요.." : "졌어요");
			break;
		}
		default : {
			System.out.println((com == 2) ? "이겼어요!" : (com == 3) ? "비겼어요.." : "졌어요");
			break;
			}
		}
	}
}
