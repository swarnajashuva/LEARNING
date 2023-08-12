
public class Demo {
public static void main(String[] args) {
	greet();
	add();
	int x=25;
	int y=22;
	int res=sub(x,y);
	System.out.println("Subtraction result is "+res);
	int res2=div(x,y);
	System.out.println("Divison result is "+res2);
	boolean res3=checkGreaterThan( x, y);
	System.out.println("checkGreaterThan Result is"+res3);
}
public static void greet()
{
	System.out.println("Thank you Jesus everything doing for me...");
}
public static void add()
{
	int a=25;
	int b=20;
	int c=a+b;
	System.out.println("Additon Result is .."+c);
}
public static int sub(int x, int y)
{
	return x-y;
}
public static int div(int m,int n)
{
	return m/n; 
}
public static int mod(int a,int b)
{
	return a%b;
}
public static boolean checkGreaterThan(int x,int y)
{
	return x>y;
}
}