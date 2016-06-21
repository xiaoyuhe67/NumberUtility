import java.text.NumberFormat;
import java.util.Random;

public class NumberUtility {
	
	public static String Percentage(double num)
	{
		NumberFormat percent = NumberFormat.getPercentInstance();
		return percent.format(num);
	}
	
	public static String Currency(double num)
	{
		NumberFormat currency = NumberFormat.getCurrencyInstance();

		return currency.format(num); 
	}
	
	public static String Decimal(double num, int i)
	{
		NumberFormat number = NumberFormat.getNumberInstance();

		number.setMaximumFractionDigits(i);

		return number.format(num);
		
	}
	
	public static int Random(int num1, int num2)
	{
		Random rand=new Random();	
		return rand.nextInt((num2-num1)+1)+num1;
	}
	public static int Max(int num1, int num2)
	{
		int max=0;
		if(num1>num2) max=num1;
		else max=num2;
		return max;
	}
	public static int Min(int num1, int num2)
	{
		int min=0;
		if(num1>num2) min=num2;
		else min=num1;
		return min;
	}
	

}
