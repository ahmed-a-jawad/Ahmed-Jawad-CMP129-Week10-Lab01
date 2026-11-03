public class VehicleTest {
    public static void main(String[] args) {
        Car car1 = new Car("Honda", "Civic", 2009);
        Car car2 = new Car("Mitsubishi", "Eclipse", 1995);

        Truck truck1 = new Truck("Suzuki","Carry",1989);
        Truck truck2 = new Truck("Nissan","Frontier",2018);
        
        car1.displayInfo();
        car1.displayType();
        car2.displayInfo();
        car2.displayType();

        truck1.displayInfo();
        truck1.displayType();
        truck2.displayInfo();
        truck2.displayType();

        car1.setModel("Prelude");
        car1.displayInfo();
        System.out.println(car1.getYear());    }
}
