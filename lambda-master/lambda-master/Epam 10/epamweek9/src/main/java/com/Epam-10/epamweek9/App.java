package com.epamweek9.epamweek9;
import java.util.*;
import java.util.function.Predicate;

/**
 * Hello world!
 *
 */
public class App 
{
	public static List<String> filter(List<String> list,Predicate<String> predicate) {
		List<String> fin = new ArrayList<>();
		for(String s : list) {
			if(predicate.test(s)) fin.add(s);
		}
		return fin;
	}
    public static void main( String[] args )
    {
    	Scanner in = new Scanner(System.in);
    	boolean flag = true;
    	while(flag) {
    		System.out.println("This Class has 3 Functinalities");
        	System.out.println("1) For Average of a list of numbers : Press 1");
        	System.out.println("2) For filter List of Strings Starts with 'a' and length of String equal to 3 : Press 2");
        	System.out.println("3) For given List of Strings filter the Palindrome strings : press 3");
        	System.out.println("4) For EXIT the program : press 4");
        	int option = in.nextInt();
        	if(option!=4) System.out.println("Enter Size of the list");
        	if(option == 1){
        		int siz = in.nextInt();
        		List<Integer> list = new ArrayList<>();
        		for(int i = 0;i<siz;i++) list.add(in.nextInt());
        		Average avg = new Average();
        		System.out.println("The average of the list you entered is "+ Double.toString(avg.avgList(list)));
        	}
        	else if(option == 2) {
        		int siz = in.nextInt();
        		List<String> list = new ArrayList<>();
        		for(int i = 0;i<siz;i++) list.add(in.next());
        		Identifystring obj = new Identifystring();
        		System.out.print("The final list of filtered Strings is ");
        		System.out.println(obj.filter(list));
        		
        	}
        	else if(option == 3){
        		int siz = in.nextInt();
        		List<String> list = new ArrayList<>();
        		for(int i = 0;i<siz;i++) list.add(in.next());
        		List<String> result = filter(list, Stringpal::check_palindrome);
        		System.out.print("The final list of palindrome Strings is ");
        		System.out.println(result);
        	}
        	else flag = false;
        	System.out.println();
    	}
    	
    	in.close(); 
    }
}
