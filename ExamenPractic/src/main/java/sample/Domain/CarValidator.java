package sample.Domain;

public class CarValidator {

    public void validate(Car car) {
        if (car.getId() <= 0) {
            throw new RuntimeException("Insert a valid ID.");
        }
    }
}