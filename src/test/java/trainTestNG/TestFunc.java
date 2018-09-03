package trainTestNG;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

@Test(groups="func",dependsOnGroups={"init"})
public class TestFunc{

	
	public void testMethod2()
	{
		System.out.println("m2222");
	}
	
	public void testMethod3()
	{
		System.out.println("m3333");
	}
	
	@Test(dependsOnMethods={"testMethod1"})
	public void testMethod4()
	{
		System.out.println("m4444");
		
	}
	
	public void testMethod1()
	{
		System.out.println("m1111");
		assertTrue(1==2);
	}
	
	
}
