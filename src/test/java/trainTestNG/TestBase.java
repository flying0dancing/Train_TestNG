package trainTestNG;

import org.testng.annotations.Test;

@Test(groups = "init")
public class TestBase {

	public void initial()
	{
		System.out.println("initial");
	}
	
	public void checkMethod(){
		System.out.println("checkMethod");
	}
	
	public void setup(){
		System.out.println("setup");
	}
	
}
