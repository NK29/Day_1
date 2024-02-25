package Org.phone;

public class PhoneInfo {
	
	public void phoneName() {
		System.out.println("phone Name   : Redmi");
	}
	public void phoneMieiNum() {
		System.out.println("phoneMiei Num: A1");
	}
	public void Camera() {
		System.out.println("Camera       : 64");
	}
	public void storage() {
		System.out.println("storage      : 128");
	}
	public void osName() {
		System.out.println("osName       : oxygen");
	}

	public static void main(String[] args) {
		//ClassaName ObjName = new ClassaName();
		PhoneInfo phoneinfo = new PhoneInfo();
		phoneinfo.phoneName();
		phoneinfo.phoneMieiNum();
		phoneinfo.Camera();
		phoneinfo.storage();
		phoneinfo.osName();
	}

}
