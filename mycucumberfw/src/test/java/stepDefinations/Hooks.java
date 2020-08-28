package stepDefinations;

import io.cucumber.java.Before;
import io.cucumber.java.After;

public class Hooks {

	@Before("@smoke")
	public void beforeValidation() {
		System.out.println("This is before smoke test");
	}
	@After("@smoke")
	public void afterValidation() {
		System.out.println("This is After smoke test");
		System.out.println("*******************************************************");
	}
	@Before("@regression")
	public void beforeValidation1() {
		System.out.println("This is before regression test");
	}
	@After("@regression")
	public void afterValidation1() {
		System.out.println("This is after regression test");
		System.out.println("*******************************************************");
	}
}
