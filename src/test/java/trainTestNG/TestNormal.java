package trainTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNormal {

	@Test
	public void verfiyFormCode(){

		Assert.assertEquals(30016, FormCode.getFormCodeFor("MAS610"),"error notes");
		Assert.assertEquals(30017, FormCode.getFormCodeFor("FED610"),"error notes");
	}
}
