package Org.phone1;

public class InternalStorage extends ExternalStorage{
	
	public void processorName() {
		System.out.println("processor Name: Intel");
	}
	public void ramSize() {
		System.out.println("RAM size: DD4");
	}

	public static void main(String[] args) {
		//ClassaName ObjName = new ClassaName();
		InternalStorage internalstorage = new InternalStorage();
		internalstorage.processorName();
		internalstorage.ramSize();
		internalstorage.size();
	}

}
