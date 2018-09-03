package trainTestNG;

public class Email {
	
	/**
	 * used to get email list, if type is equal to <I>fixed</I>, it will return fixed email list, others will return random email list. 
	 * @param type 
	 * @return return null if type is null
	 */
	public String getEmail(String type)
	{
		String str=null;
		if(type!=null){
			IEmailGenerator emailGenerator=null;
			if(type.equalsIgnoreCase("fixed")){
				emailGenerator=new FixedEmailGenerator();
			}else
			{
				emailGenerator=new RandomEmailGenerator();
			}
			str=emailGenerator.generate();
		}
		return str;
	}
	
}
