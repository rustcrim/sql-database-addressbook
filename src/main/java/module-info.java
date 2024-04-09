module com.example.adressbook {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.adressbook to javafx.fxml;
    exports com.example.adressbook;
    exports com.example.controller;
    opens com.example.controller to javafx.fxml;
    exports com.example.addressbook.model;
    opens com.example.addressbook.model to javafx.fxml;
}