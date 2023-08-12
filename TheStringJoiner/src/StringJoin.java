import java.util.Scanner;

public class StringJoin {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter Your first name and last name ");
String firstName=scan.next();
String secondName=scan.next();
System.out.println(joinStrings(firstName,secondName));
	}
	public static String joinStrings(String str1, String str2)
	{
		return str1+str2;
	}
}
