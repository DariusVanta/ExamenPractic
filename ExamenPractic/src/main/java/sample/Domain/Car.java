package sample.Domain;

public class Car extends Entity {

    private String model;
    private double mileageAcquisition;
    private double daysRent;


    public Car(String id, String model, double mileageAcquisition, double daysRent) {
        super(id);
        this.model = model;
        this.mileageAcquisition = mileageAcquisition;
        this.dayRent = daysRent;
    }
    public String getModel() {
        return model;
    }

    public double getMileageAcquisition() {
        return mileageAcquisitiont;
    }

    public double getDaysRent() {
        return daysRent;
    }

    public void setDaysRent(double DaysRent) {
        this.daysRent= daysRent;
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
                " have a rent per day ='" + dayRent + '\'' +
                '}';
    }
}
