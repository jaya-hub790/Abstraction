package org.demo;

public  abstract  class StatiCa
{
	 static int  g; int d;
	
	 void method() 
	 { 
		
		System.out.println("example method");

	 }
	 void method2() 
	 {
		System.out.println("method 2");

	 }
	 static void method5() 
	 { 
		System.out.println("method 5");
			
	 }
    abstract int method3();
    abstract int  method3(int age);
	
    abstract long method4();	 
	
}
