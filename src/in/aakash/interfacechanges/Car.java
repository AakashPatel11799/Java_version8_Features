package in.aakash.interfacechanges;

interface Vehicle {
	public abstract void startVehicle();

	public default void cleanVehicle() {
		System.out.println("Vehicle clean.....");
	}

	public static void drive() {
		System.out.println("Gerney started.. ");
	}
}

public class Car implements Vehicle {

	@Override
	public void startVehicle() {
		System.out.println("Car started ....");

	}

	public static void main(String[] args) {
                
		Car car = new Car();
		car.cleanVehicle();
		car.startVehicle();
	}

}
