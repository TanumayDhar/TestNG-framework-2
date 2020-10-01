package ExceptionTest;

import java.io.IOException;

import org.testng.annotations.Test;


//This is exception test

public class Execption {


	@Test(expectedExceptions = { IOException.class })

	public void exceptionTestOne() throws Exception { throw new IOException(); }

	@Test(expectedExceptions = { IOException.class, NullPointerException.class })

	public void exceptionTestTwo() throws Exception { throw new Exception(); }




	@Test(expectedExceptions = {IOException.class}, expectedExceptionsMessageRegExp = "This is Error")

	public void customException ()throws Exception
	{



		throw new IOException("Error");

	}


}
