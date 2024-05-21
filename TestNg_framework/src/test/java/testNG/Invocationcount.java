package testNG;

import org.testng.annotations.Test;

public class Invocationcount {
 
	
	@Test(invocationCount = 5,invocationTimeOut = 10)
	public void invocation() {
		int a=5;
		int b=6;
		int sum= a+b;
		
		System.out.println(sum);
	}
}
