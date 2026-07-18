/*write a program to print the sum of all the digits of a given number*/

import java.util.*;
public class test2{
	
	int num,rem,sum;
	public void cal(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	num = sc.nextInt();
	
	while(num>0){
		rem=num%10;
		sum=sum+rem;
		num=num/10;
		
	}
	System.out.println("The sum of the number is"+sum);


	}
	
	public static void main(String args[]){
	test2 ob =new test2();
	
	ob.cal();
	
	
	
	}
}
