package com.xpeppers.gum;

public class DividerRule {

	private final int numberToDivide;
	private final OutputAdder outputAdder;

	public DividerRule(int numberToDivide, OutputAdder outputAdder) {
		this.numberToDivide = numberToDivide;
		this.outputAdder = outputAdder;
	}
	
	public void applyRule(int number, OutputBuilder output) {
		if(number%numberToDivide == 0) {
			output.appendAdder(outputAdder);
		}
	}

}
