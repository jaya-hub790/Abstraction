package org.demo;

public abstract class AbstraCa  extends StatiCa{
	@Override
	int method3() {
		System.out.println("method 3");
		return 0;
	}
	@Override
	public long method4() {
		System.out.println("method 4");
		return 0;
	}
	@Override
	void method() {
		System.out.println("method ");
		super.method();
	}
	@Override
	void method2() {
		System.out.println("method 2$$$$");
		super.method2();
	}	
		public void high() {
			System.out.println("high high high high");
			
		}
		@Override
		int method3(int age) {
			System.out.println("overload abstract method");
			return age;
		}
	
	public static void main(String[] args) {
		AbstraCa a=new AbstraCa() {

			
		};
		//a.method();
		a.method2();
		//a.method3();
		//a.method4();
		//a.high();
	}
	
	
	

}
