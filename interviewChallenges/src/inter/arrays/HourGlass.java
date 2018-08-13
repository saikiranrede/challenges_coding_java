package inter.arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HourGlass {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
    	int temp_sum = 0, max_sum = Integer.MIN_VALUE;
    		for(int i=0; i<6; i++) {
    			for(int j=0; j<6; j++) {
    				if(i+2 < 6 && j+2 < 6) {
    					temp_sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + 
    							   arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
    					if(temp_sum > max_sum) {
    						max_sum = temp_sum;
    					}
    			}
    		}
    	}
		

    	return max_sum;
    }
    
    static int subArraySum(int[] hourValues) {
    	int sumValue = 0;
    	for(int p=0; p<6; p++) {
    		if(p != 3 && p != 5) {
    			sumValue = sumValue + hourValues[p];
    		}
    	}
    	
		return sumValue;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
