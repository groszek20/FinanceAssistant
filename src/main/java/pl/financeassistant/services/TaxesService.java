package pl.financeassistant.services;

import org.springframework.beans.factory.annotation.Autowired;

public class TaxesService {
	
	private InterfaceTestowy test;

	@Autowired
	public void setTest(InterfaceTestowy interfaceTestowy) {
		this.test = interfaceTestowy;
	}
	
	public void doSomething(int amount) {
		System.out.println("zobaczymy co si� stanie");
		test.dodamyTutajCosDlaTestu(amount);
	}
	

}
