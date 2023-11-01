package org.demo;

 class Finish extends AbstraCa{
	@Override
	void method() {
		System.out.println("finish method name");
		super.method();
	}
	public Finish() {
		System.out.println("abstract class to abstract class");
	}
	@Override
	void method2() {
		System.out.println("finish method 2");
		super.method2();
	}
	@Override
	int method3() {
		System.out.println("finish method 3");
		return super.method3();
	}
	@Override
	public long method4() {
		System.out.println("finish method 4");
		return super.method4();
	}
	@Override
	public void high() {
		
		super.high();
	}
	public static void main(String[] args) {
		Finish f=new Finish();
		//f.high();
		//f.method();
		f.method2();
		//f.method3();
		//f.method4();
		//Finish.method5();
	}
	

}
