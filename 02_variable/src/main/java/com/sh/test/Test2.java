package com.sh.test;

public class Test2 {
	public static void main(String[] args) {
	String name = "홍길동";
	int age = 22;
	char gender = '남';
	String phone = "01012341234";
	String email = "hgd@naver.com";
	String address = "경기도 광주시";
	
	System.out.printf("%-6s%-6s%-6s%-20s%-20s%-10s\n","이름","나이","성별","전화번호","이메일","주소");
	System.out.println("=======================================================================");
	System.out.printf("%-6s%-6s%-6s%-20s%-20s%-10s\n", name , age, gender, phone, email, address);
	
	  // 값 다시 대입
    name = "신사임당";
    age = 30;
    gender = '여';
    phone = "01033334444";
    email = "sinsa@naver.com";
    address = "경기도 광주시";
    System.out.printf("%-6s%-6s%-6s%-20s%-20s%-10s\n",name , age, gender, phone, email, address);
    
	}
}
