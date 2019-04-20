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


    public String getCarId() {
        return carId;
    }

    public double getMileage() {
        return mileage;
    }

    public double getRentDays() {
        return RentDays;
    }


    public void setMileage(double mileage) {
        this.mileage= mileage;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public void setRentDays(double rentDays) {
        this.rentDays= rentDays;
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
