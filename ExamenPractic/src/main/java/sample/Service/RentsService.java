package sample.Service;

import sample.Domain.Invoice;
import sample.Domain.InvoiceValidator;
import sample.Repository.IRepository;

import java.util.List;

public class RentsService {

    private IRepository<Rents> repository;

    /**
     * Constructs a rent.
     * @param repository the backing repository.
     */
    public RentsService(IRepository<Renrs> repository) {
        this.repository = repository;
    }

    /**
     * Adds a rent with the given fields.
     * @param id the id - must be unique.
     *  @param carId the car Id.
     * @param rentDays the rent days.
     * @param mileage the mileage after rent.
     */
    public void addRents(String id, String carId, double rentDays, double mileage) {
        Invoice rents = new Invoice(id, carId, rentDays, mileage);
        repository.upsert(rents);
    }

    /**
     * Gets the sum of all invoices in a given day.
     * @param carID the given Id car.
     * @return the sum of all invoices in date.
     */
    public double getCarIncomes(String carID) {
        RentsValidator validator = new RentsValidator();
        Rents dummy = new Invoice(null, carID, null, null);
        validator.validate(dummy);

        double income = 0;
        for (Rents rents : repository.getAll()) {
            if (rents.getCarId().equals(carID)) {
                income += (rents.getRentDays() * car.getCayRentPrice());
            }
        }
        return income;
    }

    /**
     * Gets a list of all rents.
     * @return a list of all rents.
     */
    public List<Rents> getAll() {
        return repository.getAll();
    }
}
