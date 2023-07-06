package training.day4.homework;

public class Main {
    public static void main(String[] args) {

        SportCar sportCar = new SportCar(15, 200);
        sportCar.drive(90);

        RaceMotorcycle raceMotorcycle = new RaceMotorcycle(50, 150);
        raceMotorcycle.drive(60);

        Car car = new Car(70, 100);
        car.drive(50);

    }
}
