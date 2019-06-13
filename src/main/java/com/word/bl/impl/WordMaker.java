package com.word.bl.impl;

import com.util.ILibrary;
import com.util.impl.Library;
import com.word.bl.IWordMaker;
import com.word.bl.NumGenerator;

public class WordMaker implements IWordMaker {

	ILibrary lib= new Library();
	NumGenerator ng= new NumGenerator();
	public String makeWord(int num) {
		// TODO Auto-generated method stub
		int count=digitCount(num);
		StringBuilder sbr= new StringBuilder();
		int temp=0,rem=0;
		
		switch(count) {
		
		case 1 : return lib.wordLibrary(num);
		case 2 : 
			if(num<=20 || (num%10==0)) {
				return lib.wordLibrary(num);
			}else {
				rem=num%10;
				temp=num-rem;
				sbr.append(lib.wordLibrary(temp)).append(" ").append(lib.wordLibrary(rem));
				return sbr.toString();
			}
		case 3 : 
			sbr.append(lib.wordLibrary(ng.getFirstNum(num))).append(" HUNDRED ");
			if(num%100 !=0) {
				sbr.append(" AND ").append(makeWord(num%100));
			}
			return sbr.toString();
		case 4 :
			
			sbr.append(lib.wordLibrary(ng.getFirstNum(num))).append(" THOUSAND ");
			if(num%1000 != 0) {
				sbr.append(makeWord(num%1000));
			}
			return sbr.toString();
		case 5 :
			sbr.append(makeWord(ng.getTwoNum(num))).append(" ");
			if(num%10000 == 0) {
				sbr.append(" THOUSAND ");
			}
			if(num%10000 != 0) {
				sbr.append(" THOUSAND ").append(makeWord(num%1000));
			}
			return sbr.toString();
		case 6 :
			sbr.append(makeWord(ng.getFirstNum(num))).append(" HUNDERD ");
			if(num%100000 == 0) {
				sbr.append(" THOUSAND ");
			}
			if(num%100000 != 0) {
				sbr.append(makeWord(num-(ng.getFirstNum(num)*100000)));
			}
			return sbr.toString();
		case 7 :
			sbr.append(lib.wordLibrary(ng.getFirstNum(num))).append(" MILLION ");
			if(num%1000000 != 0) {
				sbr.append(makeWord(num-(ng.getFirstNum(num)*1000000)));
			}
			return sbr.toString();
			
		case 8 :
			sbr.append(makeWord(ng.getTwoNum(num))).append(" ");
			if(num%10000000 == 0)
			sbr.append(" MILLION ");
			else if(num%10000000 != 0) {
				sbr.append(" MILLION ").append(makeWord(num%1000000));
			}
			return sbr.toString();
			
		case 9 :
			sbr.append(makeWord(ng.getFirstNum(num))).append(" HUNDRED ");
			if(num%100000000 == 0)
			sbr.append(" MILLION ");
			else if(num%100000000 != 0) {
				sbr.append(makeWord(ng.getTwoNum(num)));
				sbr.append(" MILLION ").append(makeWord(num%1000000));
			}
			return sbr.toString();
			
		}
		
		
		return sbr.toString();
	}

	public static int digitCount(int num) {
		
		int count=0, rem=num;
		
		while(rem >= 1) {
				rem=rem/10;
				count++;
		}
		return count;
	}
	
	
}
