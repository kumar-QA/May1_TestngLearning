package demoscript;

import org.testng.annotations.Test;

public class C {

	@Test
	public void m9() {
		System.out.println("D script");	
	}
	@Test(priority = -2)
	public void m10() {
		System.out.println("C script");	
	}
}
