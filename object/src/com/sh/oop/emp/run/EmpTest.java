package com.sh.oop.emp.run;

import java.util.Scanner;

import com.sh.oop.emp.model.vo.Employee;

public class EmpTest {
	Scanner sc = new Scanner(System.in);
	public static void main(String[]args) {
		EmpTest et = new EmpTest();
		et.mainMenu();
	}
	
	public void mainMenu() {
		String menu = "******* 사원 정보 관리 프로그램 **********\n" 
								+ "1. 새 사원 정보 입력\n" 
								+ "2. 사원 정보 삭제\n" 
								+ "3. 사원정보 출력\n"
								+ "9. 끝내기\n" 
								+ "*************************************\n" 
								+ "입력 : ";

		Employee e = null;
		
		while (true) {
			System.out.print(menu);
			int ch = sc.nextInt();
			switch(ch) {
			case 1:
               if (e == null) {
                   e = new Employee(); // 새로운 Employee 객체 생성
               }
                 e.empInput();
                 System.out.println("사원정보를 저장했습니다.");
                 break;
			case 2 : 
				if(e == null) {
					System.out.println("삭제할 사원 정보가 없습니다.");
				} else {
					e = null; // 사원 정보 삭제
					System.out.println("사원 정보가 삭제되었습니다.");
				}
				break;
			case 3 :
				if(e == null) {
					System.out.println("출력할 사원 정보가 없습니다.");
				} else {
					e.empOutput();
				}
				break;
            case 9:
                System.out.println("프로그램을 종료합니다.");
                return; // 프로그램 종료
            
            default:
                System.out.println("메뉴에 있는 항목을 선택해주세요.");
                break;
			}
			
		}

	}

}
