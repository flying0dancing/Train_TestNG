package trainTestNG;

public class FormCode {

	public static int getFormCodeFor(String formName){
		if(formName.equalsIgnoreCase("MAS610")){
			return 30016;
		}
		if(formName.equalsIgnoreCase("FED610")){
			return 30017;
		}
		if(formName.equalsIgnoreCase("ECR610")){
			return 30018;
		}
		return 0;
	}
}
