package testpages;

import org.testng.annotations.Test;

public class democlass {

	@Test
	public void D() {
		System.out.println("D script");	
	}
	@Test(priority = -2)
	public void C() {
		System.out.println("C script");	
	}
	@Test(priority =-2)
	public void B() {
		System.out.println("B script");
	}
	@Test
	public void A() {
		System.out.println("A script");	
	}
	
	
	
}
