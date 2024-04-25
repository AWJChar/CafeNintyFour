module com.example.cafenintyfour {
    requires javafx.controls;
    requires javafx.fxml;


    opens cafe94 to javafx.fxml;
    exports cafe94;
}