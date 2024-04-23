package TestCases;

import org.testng.annotations.Test;

import BaseTests.BaseTestTricentis;

public class TricentisRegistrationPositiveFlowTest extends BaseTestTricentis{
	@Test
	public void testRegistrationFlow() {
		
		landingPageTricentisPage.openWebsite();
		landingPageTricentisPage.nav_automobileClick();
		
		automobileEnterVehicleDataTricentisPage.inputAutomobileEnterVehicleDataTricentisPage();
		automobileEnterInsurantDataTricentisPage.inputAutomobileEnterInsurantDataTricentisPage();
		automobileEnterProductDataTricentisPage.inputAutomobileEnterProductDataTricentisPage();
		
		System.out.println("SELENIUM AUTOMATION @Test testRegistrationFlow method..");
	}
}
