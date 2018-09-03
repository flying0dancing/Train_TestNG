package trainTestNG;

import org.testng.annotations.*;

public class TestDataProvider {

	@DataProvider(name="test1")
	public Object[][] createData1(){
		return new Object[][]{
				{"MAS610",30016},
				{"FED610",30017}
		};
	}
	
	@Test(dataProvider="test1")
	public void verifyData1(String name,Integer id){
		System.out.println(name+" : "+id);
		
	}
	
}
