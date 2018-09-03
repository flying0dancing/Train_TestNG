package trainTestNG;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class EmailGeneratorTest {

	@BeforeTest
	public void setup()
	{
		Assert.assertEquals(1,1);
	}
	
	@Test
	@Parameters({"emailType"})
	public void testRandomEmail1(@Optional("bb") String emailTyp){
		System.out.println(emailTyp);
		Email emailGen=new Email();
		String email=emailGen.getEmail(emailTyp);
		Assert.assertNotNull(email);
		Assert.assertEquals(email, "random@trainTestNG.com");
	}
	
	@Test
	public void testRandomEmail2(){
		Email emailGen=new Email();
		String email=emailGen.getEmail("");
		Assert.assertNotNull(email);
		Assert.assertEquals(email, "rndom@trainTestNG.com");
	}
}
