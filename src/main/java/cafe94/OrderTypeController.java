package cafe94;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.util.Objects;

/**
 * OrderType Controller controls the order type stage,
 * where users can choose which type of order they are making.
 * @author Alexander Charlesworth
 * @version 0.1.1
 */
public class OrderTypeController {

    private int orderType;
    private Stage stage;
    private Scene scene;
    private Parent root;

    /**
     * Controls order type choice and loads ordering stage.
     * @param event button click
     * @throws Exception
     */
    public void getOrderType(ActionEvent event) throws Exception {
        Button orderTypeButton = (Button) event.getSource();
        OrderManager.getCurrentOrder().setOrderType(OrderType.valueOf(orderTypeButton.getId()));
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("make-order.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
    }

    /**
     * Sets order type locally.
     * @param orderType value of order type
     */
    public void setOrderType(int orderType) {
        this.orderType = orderType;
    }
}
