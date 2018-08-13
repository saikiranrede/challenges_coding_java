package inter.sortings;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MarkAndToys {
	

	    // Complete the maximumToys function below.
	    static int maximumToys(int[] prices, int k) {
	    	for(int i=0; i<prices.length; i++) {
	    		for(int j = 0; j<prices.length-1; j++) {
		    		if(prices[j] > prices[j+1]) {
		    			int temp = prices[j];
		    			prices[j] = prices[j+1];
		    			prices[j+1] = temp;
		    		}
		    	}
	    	}
	    	int maxVal = 0;
	    	int count = 0;
	    	for(int item=0; item<prices.length; item++) {
	    		if(maxVal<=k) {
	    			maxVal = maxVal + prices[item];
	    			count++;
	    		}
	    	}
	    	
			return count-1;
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String[] nk = scanner.nextLine().split(" ");

	        int n = Integer.parseInt(nk[0]);

	        int k = Integer.parseInt(nk[1]);

	        int[] prices = new int[n];

	        String[] pricesItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int pricesItem = Integer.parseInt(pricesItems[i]);
	            prices[i] = pricesItem;
	        }

	        int result = maximumToys(prices, k);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedWriter.close();

	        scanner.close();
	    }
	}
