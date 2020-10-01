package GroupTest;

import org.testng.annotations.Test;

public class Car_loan {



	@Test  
	public void WebLoginCarLoan()  
	{  
		System.out.println("NA");  
	}  
	@Test  
	public void MobileLoginCarLoan()  
	{  
		System.out.println("NA");  
	}  


	@Test(groups= {"SmokeTest"})  
	public void APILoginCarLoan()  
	{  
		System.out.println("API Login Home Loan");  
	}  
}  

