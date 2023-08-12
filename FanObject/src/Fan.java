
public class Fan {
int no_Of_Wings;
String color;
int cost;
String brand;
public Fan(int a,String b,int c,String d)
{
no_Of_Wings=a;
color=b;
cost=c;
brand=d;
}
void rotate()
{
	System.out.println("User should know "+"fan color "+color+"fan brand "+brand+"fan cost "+cost+no_Of_Wings+"Wings Fan is rotating");
}
void blowAir()
{
	System.out.println("Color fan "+color+"Fan is blowing air ");
}
}