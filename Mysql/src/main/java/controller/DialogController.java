package controller;

import javafx.fxml.FXML;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogPane;
import javafx.scene.control.TextField;

public class DialogController {
    @FXML
    private TextField username;
    @FXML
    private TextField password;
    @FXML
    private DialogPane dialogPane;
    public void initialize(){
        dialogPane.getButtonTypes().add(
                ButtonType.CLOSE);
        dialogPane.getButtonTypes().add(
                ButtonType.OK
        );
    }

    public String getUsername() {
        return username.getText();
    }

    public String getPassword() {
        return password.getText();
    }
}
