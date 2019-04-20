package sample.Domain;

public class Rents extends Entity {

    private String carId;
    private double RentDays;
    private double mileage;


    public Rents(String id, String carId, double rentDays, double mileage) {
        super(id);
        this.carId = carId;
        this.rentDays = rentDays;
        this.mileage = mileage;
    }

    public Entity(String CarId) {
        this.carId = CarId;
    }


    public String getModel() {
        return model;
    }

    public double getMileage() {
        return mileage;
    }

    public double getRentDays() {
        return RentDays;
    }

      @Override
    public String toString() {
        return "Car{" +
                "car ID=" + carId +
                "rent days='" + rentDays + '\'' +
                ", mileage ='" + mileage + '\'' +
                '}';
    }
}
