package com.epamweek9.epamweek9;

public class Stringpal {
	public static boolean check_palindrome(String s){
		if(s.length() == 0) return false;
	    if(s.length() == 1) return true;
	    int i = 0,j = s.length()-1;
	    while(i<j){
	        if(s.charAt(i)!=s.charAt(j)) return false;
	        i++;
	        j--;
	    }
	    return true;
	}

}
