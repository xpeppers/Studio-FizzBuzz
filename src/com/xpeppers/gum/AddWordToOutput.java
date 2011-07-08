package com.xpeppers.gum;

public class AddWordToOutput implements OutputAdder {
	private final String word;

	public AddWordToOutput(String word) {
		this.word = word;
	}

	@Override
	public void add(StringBuilder stringBuilder) {
		stringBuilder.append(word);
	}

}
