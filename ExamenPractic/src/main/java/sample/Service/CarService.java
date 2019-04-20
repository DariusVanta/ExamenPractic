package sample.Service;

import sample.Domain.Invoice;
import sample.Domain.InvoiceValidator;
import sample.Repository.IRepository;

import java.util.List;

public class CarService {

    private IRepository<Invoice> repository;

    /**
     * Constructs a service.
     * @param repository the backing repository.
     */
    public CarService(IRepository<Car> repository) {
        this.repository = repository;
    }

    /**
     * Adds a car with the given fields.
     * @param id the id - must be unique.
     * @param model the model.
     * @param mileage Acquisitiont he mileage on Acquisition.
     * @param dayRentPrice the day Rent Price.
     */
    public void add(String id, String model, double sum, double mileageAcquisition, double dayRentPrice) {
        Car car = new Car(id, model, mileageAcquisition, dayRentPrice);
        repository.upsert(car);
    }

    /**
     * Gets the sum of all invoices in a given day.
     * @param date the given date.
     * @return the sum of all invoices in date.
     */


    public double getMileageAcquisition(double mileas) {
        InvoiceValidator validator = new InvoiceValidator();
        Invoice dummy = new Car(null, null, mileas, null );
        validator.validate(dummy);

        double mils = 0;
        for (Car car : repository.getAll()) {
            if (car.getgetMileageAcquisition().equals(mileas)) {
                mils += car.getgetMileageAcquisition();
            }
        }
        return mils;
    }
    /*
    public double getDaySum(String date) {
        InvoiceValidator validator = new InvoiceValidator();
        Invoice dummy = new Invoice(null, 0, null, date);
        validator.validate(dummy);

        double sum = 0;
        for (Invoice invoice : repository.getAll()) {
            if (invoice.getDate().equals(date)) {
                sum += invoice.getSum();
            }
        }
        return sum;
    } */

    /**
     * Gets a list of all cars.
     * @return a list of all cars.
     */
    public List<Car> getAll() {
        return repository.getAll();
    }
}
