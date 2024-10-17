package com.sh.oop.person.run;

import com.sh.oop.person.controller.PersonController;

public class PersonRun {
	public static void main(String[] args) {
		PersonController pc = new PersonController();
		pc.input();
		pc.output();
		pc.avginformation();
	}

}
