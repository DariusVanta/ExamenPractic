package sample.Domain;

public class RentsValidator {

    public void validate(Rents rents) {
        if (car.getId() <= 0) {
            throw new RuntimeException("Insert a valid ID.");
        }
    }

            if (car.getRentDays() < 0) {
        throw new RuntimeException("Number of days to rens must be positive and minimum one day!");
    }
        if (car.getMileage() < 0) {
        throw new RuntimeException("Mileage must be positive!");
    }
}