package com.Exception;

class InvalidAgeEception extends Exception
{
	public InvalidAgeEception(String msg)
	{
		super(msg);
	}
}	

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			getAge(13);	
		}
		catch(Exception e)
		{
			System.out.println("Exception :"+e.getMessage());
		}
	}
		static void getAge(int age) throws InvalidAgeEception 
		{
			if(age<18)
				throw new InvalidAgeEception("You are not eligible for voting");
			else
				System.out.println("You are eligible");
		}
	
	}

