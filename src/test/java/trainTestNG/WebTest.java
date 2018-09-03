package trainTestNG;

import org.testng.annotations.Test;

public class WebTest {

	private int numberoftimes;
	public WebTest(int numberOftimes){
		numberoftimes=numberOftimes;
	}
	
	@Test
	public void testServer(){
		System.out.println("  access the web page "+numberoftimes+" times.");
		/*for(int i=0;i<numberoftimes;i++){
			System.out.println("  access the web page "+(i+1)+" times.");
		}*/
	}
	
	
}
