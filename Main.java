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
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.util.converter.IntegerStringConverter;

import java.io.IOException;
import java.util.function.UnaryOperator;
import java.util.regex.Pattern;

public class Main extends Application {



    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("FXML/menu.fxml"));

        Scene scene = new Scene(root);
        primaryStage.getIcons().add(new Image("http://www.logospng.com/images/12/c-launcher-team-fast-smart-launch-apps-on-google-play-12804."));
        primaryStage.setResizable(false);
        primaryStage.setTitle("Cipher");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    @FXML
    public void transScreen(ActionEvent e) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("FXML/transposition.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        app_stage.hide(); //optional
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }

    @FXML
    public void cesarScreen(ActionEvent e) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("FXML/cesar.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        app_stage.hide(); //optional
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }

    @FXML
    public void fakepersonScreen(ActionEvent e) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("FXML/fakeperson.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        app_stage.hide(); //optional
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }

    @FXML
    public void authorScreen(ActionEvent e) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("FXML/author.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        app_stage.hide(); //optional
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }

    @FXML
    public void quit(ActionEvent e) throws  IOException {
       Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
       app_stage.close();
    }

    @FXML
    public void myGithubScreen(ActionEvent e) throws  IOException {
        getHostServices().showDocument("https://github.com/KrystianJanowicz");
   ;
    }

    @FXML
    public void passwordGeneratorScreen(ActionEvent e) throws  IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("FXML/password_generator.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        app_stage.hide(); //optional
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
