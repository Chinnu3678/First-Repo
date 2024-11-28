package mavaenfirstproject;

import java.util.Scanner;

public class Maven_Firstprogramm {

	public static void main(String[] args) {
	
		
		 Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the number : ");
		   int num=sc.nextInt();
		   
		   int org_num=num;
		   int rev=0;
		   
		   while(num>0)
		   {
		      int digit=num%10;
			  rev=rev*10+digit;
			  num/=10; 
		   }
		   
		   System.out.println("Number you provided :" + org_num);
		   System.out.println("Reverse of the number is : "+ rev);
		   
		sc.close();

	}

}
