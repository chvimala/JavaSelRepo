package selenium.testScripts;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPrimeNumberValidationExample{

	public static Boolean validate(final Integer primeNumber) {

		for (int i = 2; i < (primeNumber / 2); i++) {
			if (primeNumber % i == 0) {
				return false;
			}
		}
		return true;
	}

	@DataProvider(name = "test1")
	public static Object[][] primeNumbers() {
		return new Object[][] {{2, true}, {6, false}, {19, true}, {22, false}, {23, true}};
	}


	 // This test will run 4 times since we have 5 parameters defined
	   @Test(dataProvider = "test1")
	   public void testPrimeNumberChecker(Integer inputNumber, Boolean expectedResult) {
	      System.out.println(inputNumber + " " + expectedResult);
	      Assert.assertEquals(validate(inputNumber),expectedResult);
	   }

}
