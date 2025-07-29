package group_package2;

import org.testng.annotations.Test;

public class pack1 {
	
	@Test (groups = {"Regression"})
	public void test() {
		
		System.out.println("Add");
		
	}
	
	@Test(groups= {"Regression", "Sanity"})
	public void test2() {
		
		System.out.println("rules");
	}
	@Test(groups = {"Regression"})
public void test3() {
		
		System.out.println("sub");
	}
	@Test(groups = {"Sanity"})
public void test4() {
	
	System.out.println("mul");
}
	

	public static void main(String[] args) {
		
		
		
	
		}
		

	}


