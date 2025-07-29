package testngpc.copy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NG2 {

	@Test(priority=1 )
	public void login() {
		
		System.out.println("login");
		
	}
	
	
	@Test(priority=2)
	public void mail() {
		System.out.println("mail");
		
		
	}
	
	@Test(priority=3)
	public void perfomadd() {
	
		int i=10;
		int j=20;
		
		int res=i+j;
		
		Assert.assertEquals(res, 30);
		System.out.println("res ="+res);	
		
	}
}
