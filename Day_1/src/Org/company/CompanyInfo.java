package Org.company;

public class CompanyInfo {
	
	public void companyName() {
		System.out.println("company Name: Wissen");
	}
	public void companyId() {
		System.out.println("company Id: 6090");
	}
	public void companyAddress() {
		System.out.println("company Address: whitefied");
	}

	public static void main(String[] args) {
		//ClassaName ObjName = new ClassaName();
		CompanyInfo companyinfo = new CompanyInfo();
		companyinfo.companyName();
		companyinfo.companyId();
		companyinfo.companyAddress();

	}

}
