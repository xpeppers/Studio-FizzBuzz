package com.xpeppers.gum;

public class StringOutputPrinter implements OutputPrinter {

	private String output;

	@Override
	public void print(String string) {
		this.output = string;
	}
	
	public String getOutput() {
		return output;
	}

}
