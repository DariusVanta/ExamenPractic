package sample.Domain;

public class Car extends Entity {

    private String model;
    private double mileageAcquisition;
    private double dayRent;


    public Car(String id, String model, double mileageAcquisition, double dayRent) {
        super(id);
        this.model = model;
        this.mileageAcquisition = mileageAcquisition;
        this.dayRent = dayRent;
    }
    public String getModel() {
        return model;
    }

    public double getMileageAcquisition() {
        return mileageAcquisitiont;
    }

    public double getDayRent() {
        return dayRent;
    }

      @Override
    public String toString() {
        return "Car{" +
                "model=" + model +
                "with mileage on Acquisition='" + mileageAcquisition + '\'' +
                " have a rent per day ='" + dayRent + '\'' +
                '}';
    }
}
