package demoscript;

import org.testng.annotations.Test;

public class B {
	@Test
	public void m5() {
		System.out.println("D script");	
	}
	@Test(priority = -2)
	public void m6() {
		System.out.println("C script");	
	}
	@Test(priority =-2)
	public void m7() {
		System.out.println("B script");
	}
	@Test
	public void m8() {
		System.out.println("A script");	
	}
}
