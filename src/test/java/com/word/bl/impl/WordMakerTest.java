package com.word.bl.impl;

import static org.junit.Assert.*;

import org.junit.Test;

public class WordMakerTest {

	private int input;
    private int expected;
    WordMaker wm= new WordMaker();
	@Test
	public void testMakeWord() {
	assertEquals("SEVEN MILLION SIX HUNDERD FORTY EIGHT  THOUSAND SEVEN HUNDRED  AND FIFTY FOUR",wm.makeWord(7648754));
	}

	@Test
	public void testDigitCount() {
		
	    assertEquals(5, wm.digitCount(77825));
		
	}

}
