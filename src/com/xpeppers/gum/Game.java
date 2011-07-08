package com.xpeppers.gum;

import java.util.List;

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
		List<DividerRule> rules = rulesBuilder.createRulesList(number);
		
		for (DividerRule rule : rules) {
			rule.applyRule(number, output);
		}
		
		output.printTo(outputPrinter);
	}

}
