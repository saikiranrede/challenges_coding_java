package inter.strings;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SherlockAndValidString {

	    // Complete the isValid function below.
	    static String isValid(String s) {
	    	int[] alpha = new int[26];
	        int count = 0;
	            
	            for(int i=0; i<s.length(); i++) {
	                char c = s.charAt(i);
	                alpha[c-'a']++;
	                // System.out.println("Character: "+c+" count: "+alpha[c-'a']);
	            }
	            System.out.println("After==========================");
	            for(int j=0; j<alpha.length; j++) {
	                char bc = (char)(j+'a');
	                if(alpha[j]==1 || alpha[j]>2) {
	                    if(count==0) {
	                        count++;
	                        alpha[bc-'a']--;
	                    }
	                }
	                System.out.println("Character: "+bc+" count: "+alpha[bc-'a']);
	            }
	            for(int k=0; k<alpha.length; k++) {
	                if(alpha[k]==1 || alpha[k]>2) {
	                        return "NO";
	                }
	            }
	            
	            return "YES";
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String s = scanner.nextLine();

	        String result = isValid(s);

	        bufferedWriter.write(result);
	        bufferedWriter.newLine();

	        bufferedWriter.close();

	        scanner.close();
	    }
	}
