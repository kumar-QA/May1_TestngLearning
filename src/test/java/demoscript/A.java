package demoscript;

import org.testng.annotations.Test;

public class A {

	@Test
	public void m4() {
		System.out.println("D script");	
	}
	
	
	@Test(priority = -2)
	public void m3() {
		System.out.println("C script");	
	}
	@Test(priority =-2)
	public void m2() {
		System.out.println("B script");
	}
	@Test
	public void m1() {
		System.out.println("A script");	
	}
}
