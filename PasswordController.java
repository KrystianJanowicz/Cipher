package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableSet;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class PasswordController implements Initializable {
    @FXML
    private TextField passwordField;
    @FXML
    private ChoiceBox<String> choiceBox;
    @FXML
    private Button Button1;
    @FXML
    private CheckBox uppersCheckBox;
    @FXML
    private CheckBox numbersCheckBox;
    @FXML
    private CheckBox specialsCheckBox;

    @FXML
    private void generate() {
        char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char[] uppers = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] specials = {'!', '@', '#', '$', '%', '^', '&', '*', '?'};
        char[] combined = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        if(numbersCheckBox.isSelected()) {
            combined = combine(numbers, combined);
        }
        if(uppersCheckBox.isSelected()){
            combined=combine(uppers, combined);
        }
        if(specialsCheckBox.isSelected()){
            combined=combine(specials, combined);
        }
        if(numbersCheckBox.isSelected() && uppersCheckBox.isSelected()) {
            combined = combine(numbers, combined);
            combined = combine(uppers, combined);
        }
        if(numbersCheckBox.isSelected() && specialsCheckBox.isSelected()) {
            combined = combine(numbers, combined);
            combined = combine(specials, combined);
        }
        if(uppersCheckBox.isSelected() && specialsCheckBox.isSelected()) {
            combined = combine(uppers, combined);
            combined = combine(specials, combined);
        }
        if(uppersCheckBox.isSelected() && specialsCheckBox.isSelected() && numbersCheckBox.isSelected()) {
            combined = combine(uppers, combined);
            combined = combine(specials, combined);
            combined = combine(numbers, combined);
        }
            char[] pass = new char[16];
            int lenghtOfPassword = 8;
            String password;
            int r;

            for (int i = 0; i < lenghtOfPassword; i++) {
                r = new Random().nextInt(combined.length);
                pass[i] = combined[r];

            }
        password = String.valueOf(pass);
        passwordField.setText(password);

        }


    public static char[] combine(char[] a, char[] b){
        int length = a.length + b.length;
        char[] result = new char[length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;
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

    @FXML
    public void copyClicked(){
        String password=passwordField.getText();
        final Clipboard clipboard = Clipboard.getSystemClipboard();
        final ClipboardContent content = new ClipboardContent();
        content.putString(password);
        clipboard.setContent(content);
    }

    public void initialize(URL url, ResourceBundle rb) {
    }

}

