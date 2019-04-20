package sample.Domain;

public class Rents extends Entity {

    private String carId;
    private double RentDays;
    private double mileage;


    public Rents(String id, String carId, double rentDays, double mileage) {
        super(id);
        this.carId = carId;
        this.mileageAcquisition = mileageAcquisition;
        this.dayRent = dayRent;
    }

    public Entity(String idCa) {
        this.id = id;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return Objects.equals(id, entity.id);
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
