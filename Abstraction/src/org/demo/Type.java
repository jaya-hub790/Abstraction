package org.demo;

public class Type extends StatiCa{
	int i=23,j=90;
	
	@Override
	int method3() {
		System.out.println(i);
		return 10;
	}
	@Override
	public long method4() {
		System.out.println(j);
		return 8;
	}
	//normal method override
	void method() {
		System.out.println("overridewq");
	} 
	//normal method overload
	void method2(int age,String name)
	{
		System.out.println("name is: "+name);
		System.out.println("age is: "+age);
	}

	@Override
	int method3(int age) {
		System.out.println("overload abstract method");
		return age;
	}

	


	
	public static void main(String[] args) {
	Type t=new Type();
	t.method();
	t.method2(22,"gandhigee");
	t.method3();
	t.method4();
	Type.method5();
	t.method3(32);
	
	
}
}
