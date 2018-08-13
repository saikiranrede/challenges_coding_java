package inter.checksums;

import java.io.*;
import java.util.*;
import java.security.*;

public class ChecksumOfInputString {
	

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String str = scan.next();
	        scan.close();
	        try {
	            MessageDigest md = MessageDigest.getInstance("MD5");
	            md.update(str.getBytes());
	            byte[] digest = md.digest();
	            for (byte b : digest) {
	                System.out.printf("%02x", b);
	            }
	        } catch (Exception ex) {
	            throw new RuntimeException(ex);
	        }
	        
	    }
	}
