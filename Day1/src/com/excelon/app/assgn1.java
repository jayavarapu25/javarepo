package com.excelon.app;

public class assgn1 {

	public static void main(String[] args) {
		
		
		sumOfThreeDigits(123);
		sumOfFirstandLast(12345);
		reverseNumber(23478,0);

	}
	public static void sumOfThreeDigits(int num) {
		int sum=0;
		int lastdigit=num % 10; //3
		sum+=lastdigit; //sum=3
		
		num = num/10; //12
		int seconddigit=num % 10; //2
		sum+= seconddigit; //sum=5
		
		num = num/10; //1
		int thirddigit=num%10; //1
		sum+=thirddigit; //sum=6
		
		System.out.println("sum of three digits: "+sum);
		
	}
	public static void sumOfFirstandLast(int num) {
		int sum1=0;
		int lastdigit = num % 10;
		sum1 += lastdigit;
		
		num = num/10000;
		int firstdigit = num %10;
		sum1 += firstdigit;
		
		System.out.println(sum1);
		
		}
	public static void reverseNumber(int num,int reverse) {
		
		for(;num != 0;) 
		{
		int remainder = num % 10;  
		reverse = reverse * 10 + remainder;  
		num=num/10; 
		}
		
		System.out.println("sum= "+reverse);
		
		
	}
}
