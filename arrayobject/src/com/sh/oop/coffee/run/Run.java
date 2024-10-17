package com.sh.oop.coffee.run;

import com.sh.oop.coffee.controller.manager.CoffeeManager;

public class Run {
	public static void main(String[] args) {
		CoffeeManager cm = new CoffeeManager();
		cm.inputcoffee();
		cm.outputcoffee();
	}

}
