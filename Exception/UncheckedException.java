package com.Exception;

 class UncheckedExceptionmethod {
	
	static void getAge(int age) throws Exception
	{
		if(age<18)
			throw new Exception("You are not eligible for voting");
		else
			System.out.println("You are eligible");
	}

}

public class UncheckedException
{
	public static void main(String args[]) {
		try
		{
			UncheckedExceptionmethod.getAge(12);	
		}
		catch(Exception e)
		{
			System.out.println("Exception :"+e.getMessage());
		}
		//fghjk
		
	}
}