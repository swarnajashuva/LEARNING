import java.util.Scanner;

public class TemperatureConvertorApp {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("To convert temperatures from Fahrenheit to Celsius.");
		
		double fahrenheit=scan.nextDouble();
		TemperatureConverto temperatureConverter = new TemperatureConverto();
		double res=temperatureConverter.convertFahrenheitToCelsius(fahrenheit);
		System.out.println(res);
	}
}
