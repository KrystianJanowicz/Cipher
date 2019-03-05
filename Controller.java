package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller extends Main implements Initializable {

    @FXML private TextField vector;
    @FXML private TextField textField1;
    @FXML private TextField textField2;
    @FXML private Button Button;

    @FXML private TextField textFieldA;
    @FXML private TextField input;
    @FXML private TextField output;

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
    private void refresh(ActionEvent event) {
       output.setText("alibab");
        }



 @FXML
    public void changeScreen(ActionEvent e) throws IOException {
     Parent home_page_parent = FXMLLoader.load(getClass().getResource("przestawny.fxml"));
     Scene home_page_scene = new Scene(home_page_parent);
     Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
     app_stage.hide(); //optional
     app_stage.setScene(home_page_scene);
     app_stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}