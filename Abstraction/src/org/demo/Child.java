package org.demo;

public class Child implements Sample,Water {
	
	@Override
	public void ball() {
		System.out.println("kkcw institutes");
	}
	@Override
	public void cat() {
		System.out.println("velammal newGen School");		
	}
	@Override
	public int van() {
		System.out.println("vasista junior college");
		return 0;
	}
	@Override
	public void zam() {
		System.out.println("victory high School");
		
	}
	public Child() {
		System.out.println("child");
	}
	@Override
	public void duster() {
		System.out.println("duster");
		
	}
	@Override
	public void umbrella() {
		System.out.println("umbrella");
		
	}
	
	
	public static void main(String[] args) {
		
		Child c=new Child();
		c.ball();
		c.cat();
		c.duster();
		c.umbrella();
		c.van();
		c.zam();
		
		
	}

}
