import static org.junit.Assert.*;

import org.junit.Test;

public class NumberTest {

	@Test
	public void test() {
		
		//Percentage
		String percentage=NumberUtility.Percentage(0.6);
		assertTrue(percentage.equals("60%"));
		System.out.println(percentage);
	
	
		//Currency
		String currency=NumberUtility.Currency(11.875);
		assertTrue(currency.equals("$11.88"));
		System.out.println(currency);
		
		//Decimal
		String decimal=NumberUtility.Decimal(17.789, 2);
		assertTrue(decimal.equals("17.79"));
		System.out.println(decimal);
		
		//Random
		int random=NumberUtility.Random(2, 9);
		assertTrue(random<9&&random>2);
		System.out.println(random);
		
		//Max
		double max=NumberUtility.Max(2.7, 5.9);
		assertTrue(max==5.9);
		System.out.println(max);
		
		//Min
		double min=NumberUtility.Min(2.7, 5.9);
		assertTrue(min==2.7);
		System.out.println(min);
		
		
	
	}

}
