package com.first_java;

public class Calculate2 {
	static int cube1(int x)
	{  
		 int resultz=Calculate.cube(5);  
		  System.out.println(resultz); 
		    return x*x*x; 
		 	  
	}  

	 int square1(int y)
	 
	 {
		 int result2=Calculate.cube(5);  
		  System.out.println(result2);  
		
		  return y*y;
	 }
	 
	 void square2()
	 
	 {
		int result4 = square1(5);
		System.out.print(result4);
	 }
	 
			  
	public static void main(String args[])
	{  
			  int result=Calculate.cube(5);  
			  System.out.println(result);  
			  
			  int result1=Calculate.cube(5);  
			  System.out.println(result1);  
			  
			  Calculate s2 = new Calculate();
			  int result2=s2.square(5);  
			  System.out.println(result2);  
			  
			  Calculate.cube(5);

	} 
}


