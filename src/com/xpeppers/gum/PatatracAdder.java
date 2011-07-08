package com.xpeppers.gum;

public class PatatracAdder implements OutputAdder {

	@Override
	public void add(StringBuilder stringBuilder) {
		stringBuilder.delete(0, stringBuilder.length());
		stringBuilder.append("Patatrac");
	}

}
