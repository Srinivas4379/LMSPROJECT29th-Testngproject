package group1_package;

import org.testng.annotations.Test;

public class pack2 {
	
	@Test (groups = {"Regression"})
	public void test5() {
		
		System.out.println("Add");
		
	}
	
	@Test(groups= {"Regression", "Sanity"})
	public void test6() {
		
		System.out.println("rules");
	}
	@Test(groups = {"Regression"})
public void test7() {
		
		System.out.println("sub");
	}
	@Test(groups = {"Sanity"})
public void test8() {
	
	System.out.println("mul");
}
	

	public static void main(String[] args) {
		
		
		
	
		}
		

	}


