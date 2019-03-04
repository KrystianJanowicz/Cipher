package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller implements Initializable {

    @FXML private TextField vector;
    @FXML private TextField textField1;
    @FXML private TextField textField2;
    @FXML
    private Button Button;

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
    @FXML
    public void changeScreen(ActionEvent event) {
            vector.setText("2");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}