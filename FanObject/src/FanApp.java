
public class FanApp {

	public static void main(String[] args) {
    Fan fan1=new Fan(4,"Black", 2500, "Usha");
    fan1.rotate();
    fan1.blowAir();
    System.out.println("==============================================================");
    Fan fan2=new Fan(5,"White",31110,"Crompton");
    fan2.rotate();
    fan2.blowAir();
    System.out.println("==================================================================");
    Fan fan3=new Fan(4,"Blue",25400,"Oriental");
    fan3.rotate();
    fan3.blowAir();
    		
	}
}
