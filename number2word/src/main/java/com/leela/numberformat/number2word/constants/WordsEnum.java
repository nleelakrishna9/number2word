
package com.leela.numberformat.number2word.constants;

public enum WordsEnum
{
	SINGLEDIGITS(new String[] { "", " one", " two", " three", " four", " five", " six", " seven", " eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen",
			" seventeen", " eighteen", " nineteen" }),
	
	TWODIGITS(new String[] { "", " ten", " twenty", " thirty", " forty", " fifty", " sixty", " seventy", " eighty", " ninety" }),
	
	OTHERDIGITS(new String[] { "", " thousand", " million", " billion", " trillion", " quadrillion", " quintillion" });
	
	private final String[] myArray;
	
	private WordsEnum(String[] myArray)
	{
		this.myArray = myArray;
	}
	
	public String[] getValue()
	{
		return this.myArray;
	}
	
}
