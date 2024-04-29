package cafe94;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.util.Objects;

public class OrderTypeController {

    private int orderType;
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void getOrderType(ActionEvent event) throws Exception {
        Button orderTypeButton = (Button) event.getSource();
        OrderManager.getCurrentOrder().setOrderType(OrderType.valueOf(orderTypeButton.getId()));
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("make-order.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
    }

    public void setOrderType(int orderType) {
        this.orderType = orderType;
    }
}
