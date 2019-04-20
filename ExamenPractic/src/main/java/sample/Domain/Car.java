package sample.Domain;

public class Car extends Entity {

    private String model;
    private double mileageAcquisition;
    private double dayRentPrice;


    public Car(String id, String model, double mileageAcquisition, double dayRentPrice) {
        super(id);
        this.model = model;
        this.mileageAcquisition = mileageAcquisition;
        this.dayRentPrice = dayRentPrice;
    }
    public String getModel() {
        return model;
    }

    public double getMileageAcquisition() {
        return mileageAcquisitiont;
    }

    public double getDayRentPrice() {
        return dayRentPrice;
    }

    public void setDayRentPrice(double DayRentPrice) {
        this.dayRentPrice = dayRentPrice;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMileageAcquisition(double MileageAcquisition) {
        this.mileageAcquisition= mileageAcquisition;
    }

      @Override
    public String toString() {
        return "Car{" +
                "model=" + model +
                "with mileage on Acquisition='" + mileageAcquisition + '\'' +
                " have a rent price per day ='" + dayRentPrice + '\'' +
                '}';
    }
}
