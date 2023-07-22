module com.example.javafxnew {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxnew to javafx.fxml;
    exports com.example.javafxnew;
}