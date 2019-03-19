package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.imageio.IIOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;

public class FakePersonController implements Initializable {

    @FXML
    TextField nameField = new TextField();

    public void generate() throws  java.io.IOException {

        File file = new File("C:\\Users\\Kris\\IdeaProjects\\Crypt\\src\\sample\\example.txt");
        Scanner sc = new Scanner(file);

        FileReader fr = new FileReader(file);
        LineNumberReader lnr = new LineNumberReader(fr);

        int linenumber = 0;

        while (lnr.readLine() != null){
            linenumber++;
        }

        lnr.close();

        String[] list = new String[linenumber];
        int i = 0;
        while (sc.hasNextLine()) {
            list[i] = sc.nextLine();
            i++;
        }
        int r = new Random().nextInt(linenumber);
        System.out.println("Total number of lines : " + linenumber + "\n picked element of an array: " + r);
        nameField.setText(list[r]);

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

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
