package com.xpeppers.gum;

import java.util.ArrayList;
import java.util.List;

public class OutputBuilder {
	
	List<OutputAdder> outputAdders = new ArrayList<OutputAdder>();

	public void appendAdder(OutputAdder outputAdder) {
		outputAdders.add(outputAdder);
	}

	public void printTo(OutputPrinter outputPrinter) {
		StringBuilder stringBuilder = new StringBuilder();
		for (OutputAdder adder : outputAdders) {
			adder.add(stringBuilder);
		}
		outputPrinter.print(stringBuilder.toString());
	}

	public void clear() {
		outputAdders.clear();
	}

}
