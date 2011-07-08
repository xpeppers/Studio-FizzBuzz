package com.xpeppers.gum;

import java.util.ArrayList;
import java.util.List;

public class RulesBuilder {

	public List<DividerRule> createRulesList(int number) {
		List<DividerRule> rules = new ArrayList<DividerRule>();
		rules.add(new DividerRule(2, new AddWordToOutput("Fizz")));
		rules.add(new DividerRule(3, new AddWordToOutput("Buzz")));
		rules.add(new DividerRule(7, new PatatracAdder()));
		rules.add(new DividerRule(1, new AddNumberIfOutputIsEmpty(number)));
		return rules;
	}
}
