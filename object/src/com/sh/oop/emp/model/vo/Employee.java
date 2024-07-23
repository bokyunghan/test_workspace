package com.sh.oop.emp.model.vo;

import java.util.Scanner;

public class Employee {
	private int empNo; // 사번
	private String empName; // 이름
	private String dept; // 소속부서
	private String job; // 직급
	private int age; // 나이
	private char gender; // 성별
	private int salary; // 급여
	private double bounsPoint; // 보너스포인트
	private String phone; // 핸드폰
	private String address; // 주소
	

	public Employee() {
	}

	public Employee(int empNo, String empName, String dept, String job, int age, char gender, int salary,
			double bounsPoint, String phone, String address) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.bounsPoint = bounsPoint;
		this.phone = phone;
		this.address = address;
	}
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public double getBounsPoint() {
		return bounsPoint;
	}
	public void setBounsPoint(double bounsPoint) {
		this.bounsPoint = bounsPoint;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void empInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("사번을 입력해주세요.(숫자)>>");
		setEmpNo(sc.nextInt());
		System.out.print("이름을 입력해주세요.>>");
		setEmpName(sc.next());
		System.out.print("소속부서를 입력해주세요.>>");
		setDept(sc.next());
		System.out.print("직급을 입력해주세요.>>");
		setJob(sc.next());
		System.out.print("나이를 입력해주세요.(숫자)>>");
		setAge(sc.nextInt());
		System.out.print("성별을 입력해주세요.(남/여)>>");
		setGender(sc.next().charAt(0));
		System.out.print("급여를 입력해주세요.(숫자)>>");
		setSalary(sc.nextInt());
		System.out.print("보너스포인트를 입력해주세요.>>");
		setBounsPoint(sc.nextDouble());
		System.out.print("핸드폰 번호를 입력해주세요.>>");
		setPhone(sc.next());
		sc.nextLine();//공백방지용
		System.out.print("주소를 입력해주세요.>>");
		setAddress(sc.nextLine());
	}
	public void empOutput() {
		System.out.printf("=====정보=====\n"
				+"사번:%d\n"
				+ "이름:%s\n"
				+ "소속부서:%s\n"
				+ "직급:%s\n"
				+ "나이:%d\n"
				+ "성별:%c\n"
				+ "급여:%d\n"
				+ "보너스포인트:%.2f\n"
				+ "핸드폰번호:%s\n"
				+ "주소:%s\n"
				+ "============\n",
				getEmpNo(),getEmpName(),getDept(),getJob(),getAge(),getGender(),
				getSalary(),getBounsPoint(),getPhone(),getAddress());

		}
	}

