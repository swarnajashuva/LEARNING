import java.util.Scanner;

public class ConvertorApp {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("To convert temperatures from fahrenheit to celsius");
double fahrenheit=scan.nextDouble();
TemperatureConverter temperatureConverter = new TemperatureConverter();
 double res=temperatureConverter .convertFahrenheitToCelsius( fahrenheit);
 System.out.println(res);
	}

}
