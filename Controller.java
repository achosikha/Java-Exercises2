package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {
    public ListView output_list;
    public TextField input_field;
    public Button send;

    public void sendMessage(ActionEvent actionEvent) {
        output_list.getItems().add(input_field.getText());
        input_field.clear();
    }

    public void keyListener(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER) {
            output_list.getItems().add(input_field.getText());
            input_field.clear();
        }
    }
}
