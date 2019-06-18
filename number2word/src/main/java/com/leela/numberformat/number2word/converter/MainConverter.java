
package com.leela.numberformat.number2word.converter;

import java.util.Scanner;

import com.leela.numberformat.number2word.Exceptions.NumberIncorrectException;
import com.leela.numberformat.number2word.service.Number2Word;
import com.leela.numberformat.number2word.service.impl.Number2WordImpl;
import com.leela.numberformat.number2word.validations.Number2WordValidator;

public class MainConverter
{
	final static String quitValue = "q";
	
	public static void main(String... strings) throws NumberIncorrectException
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			String input;
			Number2Word num2word = new Number2WordImpl();
			while (true)
			{
				askUserToPrint();
				try
				{
					input = sc.nextLine();
					if (quitValue.equalsIgnoreCase(input.trim()))
					{
						System.out.println("Exit From Program.");
						break;
					}
					Float inputValue = Number2WordValidator.validateInput(input);
					String word = num2word.num2WordConverter(inputValue);
					System.out.println("Word Is : "+word);
				}
				catch (Exception e)
				{
					continue;
				}
			}
		}
		finally
		{
			sc.close();
		}
		
	}
	
	static void askUserToPrint()
	{
		System.out.println("Enter any number from 0 - 999999999 [To Quit The Program Enter (" + quitValue + ")]");
	}
}
