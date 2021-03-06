package com.xpeppers.gum;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class GameTest {

	@Test
	public void testGame() throws Exception {
		StringOutputPrinter outputPrinter = new StringOutputPrinter();
		
		Game game = new Game(new RulesBuilder(), new OutputBuilder(), outputPrinter );
		
		assertOutputEquals(1, "1", game, outputPrinter);
		assertOutputEquals(2, "Fizz", game, outputPrinter);
		assertOutputEquals(3, "Buzz", game, outputPrinter);
		assertOutputEquals(2*3, "FizzBuzz", game, outputPrinter);
		assertOutputEquals(7, "Patatrac", game, outputPrinter);
		assertOutputEquals(7*3, "Patatrac", game, outputPrinter);
		assertOutputEquals(13, "Bang", game, outputPrinter);
		assertOutputEquals(13*2, "FizzBang", game, outputPrinter);
		assertOutputEquals(13*2*7, "Patatrac", game, outputPrinter);
	}

	private void assertOutputEquals(int number, String expected, Game game, StringOutputPrinter outputPrinter) {
		game.say(number);
		assertEquals(expected, outputPrinter.getOutput());
	}
}
