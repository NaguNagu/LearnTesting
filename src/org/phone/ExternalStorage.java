package org.phone;

public class ExternalStorage {
		
	public void size() {
		
			System.out.println("Phones External Storage - 256gb");
			
	}
	
	public static void main(String[] args) {
		
		InternalStorage i = new InternalStorage();
		ExternalStorage e = new ExternalStorage();
		
		i.ramSize();
		i.processorName();
		e.size();
		
		System.out.println("day1 task 7th question");
	}
}
