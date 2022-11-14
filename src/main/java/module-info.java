module com.example.homework100 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.homework100 to javafx.fxml;
    exports com.example.homework100;
}