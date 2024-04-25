module com.example.cafenintyfour {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cafenintyfour to javafx.fxml;
    exports com.example.cafenintyfour;
}