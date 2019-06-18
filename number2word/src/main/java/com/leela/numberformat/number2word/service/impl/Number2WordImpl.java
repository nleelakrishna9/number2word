package com.leela.numberformat.number2word.service.impl;

import java.util.logging.Logger;

import com.leela.numberformat.number2word.Exceptions.NumberIncorrectException;
import com.leela.numberformat.number2word.constants.WordsEnum;
import com.leela.numberformat.number2word.service.Number2Word;

public class Number2WordImpl implements Number2Word{
	Logger log = Logger.getAnonymousLogger();
	public String num2WordConverter(float num) throws NumberIncorrectException{
		String finalWord = "";
		if(num == 0) {
			return "zero";
		}
		else {
		
		String current = "";
		int place = 0;
		int number = (int)Math.round(num);
		do {
			int n = number % 1000;
			log.info("Splitting based on mutiples of 1000" );
			if (n != 0) {
				String s = convertLessThanOneThousand(n);
				
				current = s + WordsEnum.OTHERDIGITS.getValue()[place] + current;
				log.info("Current Word as per iteration :: "+current +" ::");
			}
			place++;
			number /= 1000;
		} while (number > 0);

		 return (finalWord + current).trim();
		}
	}

	private String convertLessThanOneThousand(int number) {
		String current;
		if (number % 100 < 20) {
			log.info("Handling Numbers from 11 to 19");
			current = WordsEnum.SINGLEDIGITS.getValue()[number % 100];
			number /= 100;
		} else {
			current = WordsEnum.SINGLEDIGITS.getValue()[number % 10];
			number /= 10;
			current = WordsEnum.TWODIGITS.getValue()[number % 10] + current;
			number /= 10;
		}
		if (number == 0)
			return current;
		return WordsEnum.SINGLEDIGITS.getValue()[number] + " hundred" + current;
	}
	
	 
	
	
}
