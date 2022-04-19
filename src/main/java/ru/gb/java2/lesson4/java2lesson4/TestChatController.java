package ru.gb.java2.lesson4.java2lesson4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class TestChatController {
    @FXML
    private Label statusText;
    @FXML
    private TextField sendText;
    @FXML
    private TextArea messageText;

    @FXML
    private void onSend(ActionEvent actionEvent) {
        messageText.appendText(sendText.getText()+"\n");
        sendText.setText("");
    }
}