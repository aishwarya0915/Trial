package com.first_java;

public class Calculate 
{
 static int cube(int x)
{  
		  return x*x*x;  
}  

 int square(int y)
 
 {   System.out.println("Class 1");
	 int result2=Calculate.cube(5);  
	  System.out.println(result2);  
	
	  return y*y;
 }
 
 void square1()
 
 {
	/*int result4 = square(5);
	System.out.print(result4);*/
	System.out.print("Nonstatic method");
	
 }
 
		  
public static void main(String args[])
{  
		  int result=Calculate.cube(5);  
		  System.out.println(result);  
		  
		  int result1=Calculate.cube(5);  
		  System.out.println(result1);  
		  
		  Calculate s1 = new Calculate();
		  int result2=s1.square(5);  
		  System.out.println(result2);  

} 
}
