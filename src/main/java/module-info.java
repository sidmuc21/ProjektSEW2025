module com.example.projekt2025 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projekt2025 to javafx.fxml;
    exports com.example.projekt2025;
}