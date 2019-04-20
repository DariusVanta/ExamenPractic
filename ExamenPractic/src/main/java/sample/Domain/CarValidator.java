package sample.Domain;
/**
 * Validates a car.
 * @param car the car to validate.
 * @throws RuntimeException if there are validation errors.
 */

public class CarValidator {

    public void validate(Car car) {
        if (car.getId() <= 0) {
            throw new RuntimeException("Insert a valid ID.");
        }

        if (car.getMileageAcquisition() <= 0) {
            throw new RuntimeException("Mileage on Acquisition must be positive!");
        }
        if (car.getDayRentPrice() < 0) {
            throw new RuntimeException("Rent price per Day must be positive!");
        }

    }
}