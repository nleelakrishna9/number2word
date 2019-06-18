package com.leela.numberformat.number2word.serivice.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import com.leela.numberformat.number2word.Exceptions.NumberIncorrectException;
import com.leela.numberformat.number2word.service.impl.Number2WordImpl;

@RunWith(MockitoJUnitRunner.class)
public class Number2WordImplTest
{
	@InjectMocks
    Number2WordImpl number2Word;
	
	@Test
	public void testForPrintZero() throws NumberIncorrectException
	{
		String word = number2Word.num2WordConverter(0);
		assertEquals("zero", word);
	}
	
	@Test
	public void testForSingleNumberToWord() throws NumberIncorrectException
	{
		String word = number2Word.num2WordConverter(5);
		assertEquals("five", word);
	}
	
	@Test
	public void testForDoubleNumberToWord() throws NumberIncorrectException
	{
		String word = number2Word.num2WordConverter(55);
		assertEquals("fifty five", word);
	}
	
	@Test
	public void testFor3DigitWord() throws NumberIncorrectException
	{
		String word = number2Word.num2WordConverter(888);
		assertEquals("eight hundred eighty eight", word);
	}
	
	@Test
	public void testForMultipleDigitWord() throws NumberIncorrectException
	{
		String word = number2Word.num2WordConverter(88787);
		assertEquals("eighty eight thousand seven hundred eighty seven", word);
	}
}
