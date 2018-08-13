package inter.strings;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Anagrams {

	    // Complete the makeAnagram function below.
	    static int makeAnagram(String a, String b) {
	    	int[] charAlpha = new int[26];
	    	for(int i=0; i<a.length(); i++) {
	    		char c = a.charAt(i);
	    		charAlpha[c-'a']++;
	    	}
	    	
	    	for(int j=0; j<b.length(); j++) {
	    		char bc = b.charAt(j);
	    		charAlpha[bc-'a']--;
	    	}
	    	
	    	int result = 0;
	    	
	    	for(int k=0; k<charAlpha.length; k++) {
	    		result = result + Math.abs(charAlpha[k]);
	    	}
	    	
			return result;
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String a = scanner.nextLine();

	        String b = scanner.nextLine();

	        int res = makeAnagram(a, b);

	        bufferedWriter.write(String.valueOf(res));
	        bufferedWriter.newLine();

	        bufferedWriter.close();

	        scanner.close();
	    }
	}
