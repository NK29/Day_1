package Org.lang;

public class StateDetails extends LanguageInfo{
	
	public void southIndia() {
		System.out.println("SouthIndia: karnataka");
	}
	public void northIndia() {
		System.out.println("NorthIndia: Mumbai");
	}
	

	public static void main(String[] args) {
		//ClassaName ObjName = new ClassaName();
		StateDetails statedetails = new StateDetails();
		statedetails.southIndia();
		statedetails.northIndia();
		statedetails.tamilLanguage();
		statedetails.englishLanguage();
		statedetails.hindiLanguage();
	}

}
