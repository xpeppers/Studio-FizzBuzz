package com.xpeppers.gum;

public class AddNumberIfOutputIsEmpty implements OutputAdder {
	private final int number;

	public AddNumberIfOutputIsEmpty(int number) {
		this.number = number;
	}

	@Override
	public void add(StringBuilder stringBuilder) {
		if(stringBuilder.length() == 0) {
			stringBuilder.append(number);
		}
	}

}
