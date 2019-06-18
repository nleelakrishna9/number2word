package com.leela.numberformat.number2word.service;

import com.leela.numberformat.number2word.Exceptions.NumberIncorrectException;

public interface Number2Word
{
	public String num2WordConverter(float num) throws NumberIncorrectException;
}
