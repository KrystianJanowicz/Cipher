package sample;

import java.io.*;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Text text = new Text();
        text.setX(150);
        text.setY(150);
        text.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 50));
        text.setText("Crypt");

        Text vectorDescribe = new Text();
        vectorDescribe.setText("o ile mam przesunąć?");

        TextField textField1 = new TextField();
        TextField vector = new TextField();
        TextField textField2 = new TextField();

        Button button1 = new Button("Crypt");
        Button button2 = new Button("Decrypt");

        vector.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    vector.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });



        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
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
        });

        GridPane gridPane = new GridPane();
        gridPane.setMinSize(400, 200);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(text, 0, 0);
        gridPane.add(textField1, 1, 0);
        gridPane.add(textField2, 1, 2);
        gridPane.add(vector, 1, 1);
        gridPane.add(button1, 0, 2);
        gridPane.add(button2, 0, 3);
        gridPane.add(vectorDescribe, 0, 1);

        Group group = new Group(gridPane);
        Scene scene = new Scene(root);
        scene.setFill(Color.ORANGE);

        primaryStage.setTitle("Crypt");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
