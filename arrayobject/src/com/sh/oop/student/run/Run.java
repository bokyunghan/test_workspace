package com.sh.oop.student.run;

import com.sh.oop.student.controller.StudentController;

public class Run {
		public static void main(String[] args) {
		StudentController sc = new StudentController();
		sc.insertStdtInfo();
//		sc.printAvg();
		sc.printStdt();
		}
	}

