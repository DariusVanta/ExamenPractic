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

        if (car.isLeftService() && car.getMileageAcquisition() <= 0) {
            throw new RuntimeException("Mileage on Acquisition must be positive!");
        }
        if (car.getDaysRent() < 0) {
            throw new RuntimeException("Rent Days must be positive and minimum a day!");
        }

    }
}