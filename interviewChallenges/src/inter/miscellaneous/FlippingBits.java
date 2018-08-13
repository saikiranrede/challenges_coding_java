package inter.miscellaneous;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FlippingBits {
	

	    // Complete the flippingBits function below.
	    static long flippingBits(long n) {
	    	int[] bitArr = new int[32];
            long lastResult = 0;
            int count=31;
            long temp = n;
            
            for(int j=bitArr.length-1; j>=0; j--) {
                n = temp;
                bitArr[j] = (int)(n%2);
                temp = temp/2;
            }
            
            System.out.println("Binary number is : ");
            for(int k=0; k<bitArr.length; k++) {
                System.out.print(bitArr[k]);
                if(bitArr[k] == 0) {
                    bitArr[k] = 1;
                }else if(bitArr[k] == 1){
                    bitArr[k] = 0;
                }
            
            }
            
            for(int l=0; l<bitArr.length; l++) {
                lastResult = lastResult + bitArr[l] * (long)Math.pow(2, count);
                System.out.println("\n power of  "+count+ " = "+ bitArr[l] * (long)Math.pow(2, count));
                count--;
            }
            
            
            return lastResult;
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int q = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int qItr = 0; qItr < q; qItr++) {
	            long n = scanner.nextLong();
	            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	            long result = flippingBits(n);

	            bufferedWriter.write(String.valueOf(result));
	            bufferedWriter.newLine();
	        }

	        bufferedWriter.close();

	        scanner.close();
	    }
	}
