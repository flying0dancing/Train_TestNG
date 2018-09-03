package trainTestNG;

import org.testng.annotations.*;

public class WebTestFactory {

	@Factory
	public Object[] createInstances(){
		Object[] ret=new Object[5];
		for(int i=0;i<5;i++){
			ret[i]=new WebTest((i+1)*10);
		}
		return ret;
	}
}
