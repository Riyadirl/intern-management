module com.example.intern {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.intern to javafx.fxml;
    exports com.example.intern;
}