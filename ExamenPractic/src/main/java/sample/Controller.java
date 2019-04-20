package sample;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.converter.DoubleStringConverter;
import sample.Domain.Invoice;
import sample.Domain.InvoiceDateFormatException;
import sample.Service.InvoiceService;
import sun.security.pkcs11.wrapper.CK_ATTRIBUTE;

public class Controller {
    public TableView tableViewCarss;
    public TableColumn tableColumnId;
    public TableColumn tableColumnModel;
    public TableColumn tableColumnmileageAcquisition;
    public TableColumn tableColumnDaysRent;
    public TextField txtId;
    public TextField txtModel;
    public TextField txtMileageAcquisition;
    public TextField txtDaysRent;
    public Button btnAdd;
    public TextField txtCarMileage;
    public TextField txtCarIncomes;
    public TextField txtCarRentDaysResult;
    public Button btnSumForDay;

    private CarService CarService;
    private ObservableList<Car> cars = FXCollections.observableArrayList();

    public void btnAddClick(ActionEvent actionEvent) {
        try {
            String id = txtId.getText();
            double mileageAcquisition = Double.parseDouble(txtMileageAcquisition.getText());
            double daysRent = Double.parseDouble(txtDaysRent.getText());
            String model = txtDescription.getText();

            carService.add(id, model, mileageAcquisition, daysRent);

            txtId.clear();
            txtModel.clear();
            txtMileageAcquisition.clear();
            txtDaysRent.clear();

            cars.clear();
            cars.addAll(carService.getAll());

        } catch (CarDateFormatException idfe) {
            Common.showValidationError(idfe.getMessage());
        } catch (RuntimeException rex) {
            Common.showValidationError(rex.getMessage());
        }
    }

    public void setServices(CarService carService) {
        this.carService = carService;
    }

    @FXML
    private void initialize() {

        Platform.runLater(() -> {
            cars.addAll(carService.getAll());
            tableViewCars.setItems(cars);
        });
    }

    public void btnMilesPerCarClick(ActionEvent actionEvent) {
        try {
            String model = txtModel.getText();
            double mileageAcquisition = carService.getMileageAcquisition(double);
            txtCarMileage.setText(String.valueOf(mileageAcquisition));
        } catch (CarDateFormatException idfe) {
            Common.showValidationError(idfe.getMessage());
        }
    }

    /*
    public void btnSumForDayClick(ActionEvent actionEvent) {
        try {
            String date = txtSumDay.getText();
            double sum = invoiceService.getDaySum(date);
            txtSumResult.setText(String.valueOf(sum));
        } catch (CarDateFormatException idfe) {
            Common.showValidationError(idfe.getMessage());
        }
    }*/
}
