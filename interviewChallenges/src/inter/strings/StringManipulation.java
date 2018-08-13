package inter.strings;
import java.io.*;
import java.util.*;

public class StringManipulation {
	

	    public static void main(String[] args) {
	       
	        Scanner scan = new Scanner(System.in);
	        int T = scan.nextInt();
	        String str;
	        
	        for(int i=0; i<T; i++) {
	        	str = scan.next();
	        	
	        	for(int j=0; j<str.length(); j++) {
	        		if(j%2==0) {
	        			System.out.print(str.charAt(j));
	        		}
	        	}
	        	System.out.print(" ");
	        	
	        	for(int k=0; k<str.length(); k++) {
	        		if(k%2==1) {
	        			System.out.print(str.charAt(k));
	        		}
	        	}
	        	System.out.println();
	        }
	    }
	}
