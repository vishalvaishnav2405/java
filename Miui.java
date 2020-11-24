 interface Vehicleone{
	int  speed=90;
	void distance();
}

interface Vehicletwo{
	int distance=100;
	 void speed();
}
 class Vehicle  implements Vehicleone,Vehicletwo{
	public void distance(){
		int  distance=speed*100; 
		System.out.println("distance travelled is "+distance);
	}
	public void speed(){
		int speed=distance/100;
		System.out.println("speed is "+speed);
	}
}

public class Miui{
	public static void main(String args[]){
	
		Vehicle a = new Vehicle();
		a.distance();
		a.speed();
	}
}