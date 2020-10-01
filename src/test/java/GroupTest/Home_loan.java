package GroupTest;

import org.testng.annotations.Test;

public class Home_loan {


	@Test  
	public void WebLoginHomeLoan()  
	{  
		System.out.println("NA");  
	}  


	@Test(groups= {"SmokeTest"})  
	public void MobileLoginHomeLoan()  
	{  
		System.out.println("Mobile Login Home Loan");  
	}  
	@Test  
	public void APILoginHomeLoan()  
	{  
		System.out.println("NA");  
	}  
}  


