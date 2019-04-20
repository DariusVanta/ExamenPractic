package sample.Domain;

public class Car extends Entity {

    private String model;


    private double sum;
    private String description;
    private String date;

    public Car(String id, String model, double sum, String description, String date) {
        super(id);
        this.model = model;



        this.sum = sum;
        this.description = description;
        this.date = date;
    }

    public double getSum() {
        return sum;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Car{" +
                "sum=" + sum +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
