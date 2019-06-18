package com.leela.numberformat.number2word.validators;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import com.leela.numberformat.number2word.validations.Number2WordValidator;

@SuppressWarnings("static-access")
@RunWith(MockitoJUnitRunner.class)
public class Number2WordValidatorTest
{
	@InjectMocks
    Number2WordValidator number2WordValidator;
	
	@Test
	public void testValiateForNegative()
	{
		Float value = number2WordValidator.validateInput("-22");
		assertNull(value);
	}
	
	@Test
	public void testValiateForMaxValue()
	{
		Float value = number2WordValidator.validateInput("99999999999999999");
		assertNull(value);
	}
	
	@Test
	public void testValiateForSpecialChars()
	{
		Float value = number2WordValidator.validateInput("##");
		assertNull(value);
	}
	
	@Test
	public void testValiateForNoValue()
	{
		Float value = number2WordValidator.validateInput("");
		assertNull(value);
	}
	
	@Test
	public void testValiateForNonNumaric()
	{
		Float value = number2WordValidator.validateInput("xyz");
		assertNull(value);
	}
	
	@Test
	public void testValiateForSucces()
	{
		Float value = number2WordValidator.validateInput("22");
		assertNotNull(value);
	}
}
