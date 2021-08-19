package abstract1;

public class Abstractfunctionality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new Car();
		Truck truck=new Truck();
		car.enginetype();
		car.color();
		truck.enginetype();
		truck.color();
		car.setEngine("car abc");
		truck.setEngine("truck abc");
		car.getEngine();
		System.out.println(car.getEngine());
		
	}

}
