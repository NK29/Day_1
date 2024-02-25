package Org.network;

public class Wifi {
	
	public void WifiName() {
		System.out.println("Wifi Name: Karthik 5G");	
		}

	public static void main(String[] args) {
		//ClassaName ObjName = new ClassaName();
		Wifi wifi = new Wifi();
		wifi.WifiName();
		
		MobileData mobiledata = new MobileData();
		mobiledata.dataName();
		
		Lan lan = new Lan();
		lan.lanName();
		
		Wireless wireless = new Wireless();
		wireless.modamName();
	}

}
