package com.main;

import java.util.Scanner;

import com.word.bl.IWordMaker;
import com.word.bl.impl.WordMaker;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc= new Scanner(System.in);
    	
    	System.out.println("Welcome to Number Converter!!");
    	
    	int press=0;
    	
    	do {
    		System.out.println("Press 1 to continue any other number to stop: ");
        	press=sc.nextInt();
    	switch(press) {
    	case 1:
    	System.out.println("Please enter the number to be converted \n Limits(0-999999999)");
    	int number=sc.nextInt();
    	
    	if(number==0) {
    		System.out.println("Zero");
    	}
    	else if(number>0 && number<=999999999) {
    		IWordMaker im= new WordMaker();
    		System.out.println(im.makeWord(number));
    		
    	} break;
    	
    	default: 
    		System.out.println("Incorrect Input!!");
    		break;
    }} while(press==1);
    }
}
