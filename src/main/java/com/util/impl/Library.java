package com.util.impl;

import java.util.HashMap;
import java.util.Map;

import com.util.ILibrary;

public class Library implements ILibrary{

	public String wordLibrary(int num) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> map = new HashMap<Integer, String>();
		
		map.put(1,"ONE");
		map.put(2,"TWO");
		map.put(3,"THREE");
		map.put(4,"FOUR");
		map.put(5,"FIVE");
		map.put(6,"SIX");
		map.put(7,"SEVEN");
		map.put(8,"EIGHT");
		map.put(9,"NINE");
		map.put(10,"TEN");
		map.put(11,"ELEVEN");
		map.put(12,"TWELVE");
		map.put(13,"THIRTEEN");
		map.put(14,"FORTEEN");
		map.put(15,"FIFTEEN");
		map.put(16,"SIXTEEN");
		map.put(17,"SEVENTEEN");
		map.put(18,"EIGHTEEN");
		map.put(19,"NINETEEN");
		map.put(20,"TWENTY");
		map.put(30,"THIRTY");
		map.put(40,"FORTY");
		map.put(50,"FIFTY");
		map.put(60,"SIXTY");
		map.put(70,"SEVENTY");
		map.put(80,"EIGHTY");
		map.put(90,"NINETY");
		map.put(100,"HUNDERD");
		map.put(1000,"THOUSAND");
	
		
		return map.get(num);
	}

}
