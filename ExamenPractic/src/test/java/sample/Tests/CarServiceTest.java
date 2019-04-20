package sample.Tests;

import org.junit.jupiter.api.Test;
import sample.Domain.Invoice;
import sample.Domain.InvoiceDateFormatException;
import sample.Domain.InvoiceValidator;
import sample.Repository.FileRepository;
import sample.Service.InvoiceService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarServiceTest {
    @Test
    void addShouldAddTheGivenCar() {

        CarValidator validator = new CarValidator();
        FileRepository<Car> repository = new FileRepository<>(validator, "test1.json", Car[].class);
        CarService service = new CarService(repository);

        service.add("1", "Fiat",123, 5);
        List<Car> all = service.getAll();
        assertEquals(1, all.size());
        assertEquals("1", all.get(0).getId());
        assertEquals("Fiat", all.get(0).getModel());
        assertEquals(123, all.get(0).getMileageAcquisition());
        assertEquals(5, all.get(0).getDayRentPrice());

    }

    @Test
    void getDaySumShouldComputeCorrectDailySums() {
        CarValidator validator = new CarValidator();
        FileRepository<Car> repository = new FileRepository<>(validator, "test2.json", Car[].class);
        CarService service = new CarService(repository);

        service.add("1", "Dacia", 1224, 4 );
        service.add("2", "Aro", 122333, 10);
        service.add("3", "Lastun", 12121, 2);
        service.add("4", "Dacia", 11111, 3);
        service.add("5", "Dacia", 100000, 11);
        service.add("6", "Aro", 20000, 200);

        double milaq20 = service.getMileageAcquisition("Dacia");
        double milaq21 = service.getMileageAcquisition("Aro");
        double milaq22 = service.getMileageAcquisition("Lastun");

        assertEquals(1224+11111+20000, milaq20);
        assertEquals(122333+100000, milaq21);
        assertEquals(12121, milaq22);

        assertThrows(InvoiceDateFormatException.class, () -> service.getMileageAcquisition(0));
        assertThrows(InvoiceDateFormatException.class, () -> service.getMileageAcquisition(-4445));
    }
}