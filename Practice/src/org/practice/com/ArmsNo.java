package org.practice.com;

import java.util.Scanner;

public class ArmsNo {

	public static void main(String[] args) {
		  int   b, n, sum =0;

		 
	        Scanner input= new Scanner(System.in);
	        int i=input.nextInt();
	        
	            n=i;
	            while(n > 0)
	            {
	                b = n % 10;
	                sum = sum + (b * b * b);
	                n = n / 10;
	            }
	            if(sum ==i)
	            {
	                System.out.println(i+" is a arm No");
	            }
	            else 
	            {
	            	 System.out.println(i+" not a arm No");
	            }
	           
		


	}

}
