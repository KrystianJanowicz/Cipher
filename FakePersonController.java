package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.imageio.IIOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class FakePersonController implements Initializable {

    @FXML
    TextField nameField = new TextField();

    public void generate() throws  java.io.IOException {

        File file = new File("C:\\Users\\Kris\\IdeaProjects\\Crypt\\src\\sample\\example.txt");
        Scanner sc = new Scanner(file);
        //     nameField.setText(sc.nextLine());


        FileReader fr = new FileReader(file);
        LineNumberReader lnr = new LineNumberReader(fr);

        int linenumber = 0;

        while (lnr.readLine() != null){
            linenumber++;
        }

        System.out.println("Total number of lines : " + linenumber);
        lnr.close();

        String[] list = new String[linenumber];
        int i = 0;
        while (sc.hasNextLine()) {
            list[i] = sc.nextLine();
            i++;
        }
        nameField.setText(list[8]);

    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
