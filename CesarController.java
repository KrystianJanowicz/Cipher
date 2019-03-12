package sample;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.stage.Stage;
import javafx.util.converter.IntegerStringConverter;

import java.io.IOException;
import java.util.function.UnaryOperator;
import java.util.regex.Pattern;

public class CesarController {


    @FXML
    private TextField vector;
    @FXML
    private TextField textField1;
    @FXML
    private TextField textField2;

    public void returnScreen(ActionEvent e) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("FXML/menu.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        app_stage.hide(); //optional
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if ((textField1.getText() != null && !textField1.getText().isEmpty())) {
            char crypt[]=textField1.getText().toCharArray();
            int crypted[]=new int[crypt.length];
            int vectorCesar;
            if (vector.getText().isEmpty()) {
                vectorCesar=0;
            }
            else {
                vectorCesar=Integer.parseInt(vector.getText());
            }
            for (int i = 0; i < crypt.length; i++) {
                if(crypt[i]==32) { //check if space
                    crypted[i]=crypt[i];
                }else {
                    crypted[i] = crypt[i] + vectorCesar;
                }
            }
            for (int i = 0; i < crypt.length; i++) {
                if(crypted[i]>=122){
                    crypted[i]=crypted[i]-25;
                }
                crypt[i] = (char) crypted[i];

            }

            String print=new String(crypt);
            textField2.setText(print);
        }
    }

}
