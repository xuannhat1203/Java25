package BT03;

public class main {
    public static void main(String[] args) {
        Car car1 = new Car.CarBuilder()
                .setEngine("V8")
                .setSeats(4)
                .setColor("Red")
                .build();

        Car car2 = new Car.CarBuilder()
                .setEngine("Electric")
                .setSeats(2)
                .setColor("Blue")
                .build();
        car1.displayInfo();
        car2.displayInfo();
    }
}
