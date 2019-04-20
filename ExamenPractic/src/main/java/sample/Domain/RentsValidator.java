package sample.Domain;

public class RentsValidator {

    public void validate(Rents rents) {
        if (car.getId() <= 0) {
            throw new RuntimeException("Insert a valid ID.");
        }
    }
}