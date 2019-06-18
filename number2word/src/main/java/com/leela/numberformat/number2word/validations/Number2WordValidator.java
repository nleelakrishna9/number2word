package com.leela.numberformat.number2word.validations;

import java.util.logging.Logger;

import com.leela.numberformat.number2word.Exceptions.NumberIncorrectException;

public class Number2WordValidator
{
	static Logger log = Logger.getAnonymousLogger();
	private static final float max_value = 999999999f;
	public static Float validateInput(String input)
	{
		try
		{
			Float value =  Float.parseFloat(input);
			if(value < 0) {
				log.info("Entered number is Negative");
				throw new NumberIncorrectException("Negative number Entered");
			}
			
			if(value > max_value) {
				log.info("Entered number is beyond range" + max_value);
				throw new NumberIncorrectException("Entered number is beyond range");
			}
			return value;
		}
		catch (NumberIncorrectException e) {
			log.info("Invalid Input");
		}
		catch (Exception e) {
			log.info("Invalid Input");
		}
		return null;
	}
}
