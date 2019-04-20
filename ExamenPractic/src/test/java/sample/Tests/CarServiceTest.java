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
    void addShouldAddTheGivenInvoice() {

        InvoiceValidator validator = new InvoiceValidator();
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
        InvoiceValidator validator = new InvoiceValidator();
        FileRepository<Invoice> repository = new FileRepository<>(validator, "test2.json", Invoice[].class);
        InvoiceService service = new InvoiceService(repository);

        service.add("1", 261, "test", "20.04.2019");
        service.add("2", 252, "test1", "21.04.2019");
        service.add("3", 343, "test2", "20.04.2019");
        service.add("4", 434, "test3", "20.04.2019");
        service.add("5", 525, "test4", "21.04.2019");
        service.add("6", 616, "test5", "22.04.2019");

        double sum20 = service.getDaySum("20.04.2019");
        double sum21 = service.getDaySum("21.04.2019");
        double sum22 = service.getDaySum("22.04.2019");

        assertEquals(261+343+434, sum20);
        assertEquals(252+525, sum21);
        assertEquals(616, sum22);

        assertThrows(InvoiceDateFormatException.class, () -> service.getDaySum("rewrwfsd"));
        assertThrows(InvoiceDateFormatException.class, () -> service.getDaySum("63.13.2014"));
    }
}