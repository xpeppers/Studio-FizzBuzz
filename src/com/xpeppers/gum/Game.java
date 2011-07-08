package com.xpeppers.gum;


public class Game {
	
	private final RulesBuilder rulesBuilder;
	private final OutputBuilder output;
	private final OutputPrinter outputPrinter;
	
	public Game(RulesBuilder rulesBuilder, OutputBuilder outputBuilder, OutputPrinter outputPrinter) {
		this.rulesBuilder = rulesBuilder;
		this.output = outputBuilder;
		this.outputPrinter = outputPrinter;
	}
		

	public void say(int number) {
		output.clear();
		
		for (DividerRule rule : rulesBuilder.createRulesList(number)) {
			rule.applyRule(number, output);
		}
		
		output.printTo(outputPrinter);
	}

}
