package training.day4.homework;

public class Vehicle {
    private final static double DEFAULT_FUEL_CONSUMPTION = 1.25;
    private double fuelConsumption;
    private double fuel;
    private int horsePower;

    public Vehicle(double fuel, int horsePower) {
        this.fuel = fuel;
        this.horsePower = horsePower;
        this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
    }

    public void drive(double kilometers) {
        double roadRun = (getFuel() / getFuelConsumption()) * 100;
        double leftFuel = fuel - (kilometers * getFuelConsumption()) / 100;
        if (roadRun < kilometers) {
            throw new IllegalArgumentException("Not enough fuel! You can drive " + roadRun + "kilometers");
        } else {
            System.out.println("Successful run! You will have " + leftFuel + "kilometers");
        }
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        if (this.fuelConsumption < 0) {
            throw new IllegalArgumentException("Invalid data");
        }
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        if (this.fuel < 0) {
            throw new IllegalArgumentException("Invalid data");
        }
        this.fuel = fuel;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        if (this.horsePower < 50) {
            throw new IllegalArgumentException("Invalid data");
        }
        this.horsePower = horsePower;
    }

}
