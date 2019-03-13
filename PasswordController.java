package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


import java.io.IOException;
import java.util.Random;

public class PasswordController {

    @FXML
    private TextField passwordField;

    @FXML
    private void generate() {
        char[] pass = new char[8];
        String password;
        char alphabet[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','!','@','#','$','%','^','&','*','?'};
        int r;

        for (int i = 0; i < 8; i++) {
            r = new Random().nextInt(44 + 1);
            pass[i]=alphabet[r];
            password=String.valueOf(pass);
            passwordField.setText(password);
        }

    }

    @FXML
    public void returnScreen(ActionEvent e) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("FXML/menu.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        app_stage.hide(); //optional
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }

}


