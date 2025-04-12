package com.practise.Exception;

import java.util.Scanner;

class AgeException extends Exception
{
	public AgeException(String message)
	{
		super(message);
	}
	
}
public class CustomeException {

	public static void main(String[] args) throws AgeException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Your Age");
int age=sc.nextInt();
try
{
	if(age>18)
		System.out.println("Your eligible for Voting");
	else
		throw new AgeException("Your not eligible");
		
}
catch(Exception e)
{
	e.printStackTrace();//only message
	
	//System.out.println(e.printStackTrace());
}
finally
{
	sc.close();
}
	}

}
