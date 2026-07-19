/*write a program to print the sum of all the digits of a given number*/

import java.util.*;
public class test2{
	
	int num,rem,sum;
	//to calculate the sum of the number entered
	public void cal(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	num = sc.nextInt();
	//use of while loop for condition check 
	while(num>0){
		rem=num%10;
		sum=sum+rem;
		num=num/10;
		
	}
	System.out.println("The sum of the number is"+sum);//printing of the sum 


	}
	
	public static void main(String args[]){
	test2 ob =new test2();
	
	ob.cal();
	
	
	
	}
}
