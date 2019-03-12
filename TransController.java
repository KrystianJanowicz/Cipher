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

public class TransController extends Main implements Initializable {

    @FXML private Button refresh;
    @FXML private TextField inputA;
    @FXML private TextField inputB;
    @FXML private TextField inputC;
    @FXML private TextField inputD;
    @FXML private TextField inputE;
    @FXML private TextField inputF;
    @FXML private TextField inputG;
    @FXML private TextField inputH;
    @FXML private TextField inputI;
    @FXML private TextField inputJ;
    @FXML private TextField inputK;
    @FXML private TextField inputL;
    @FXML private TextField inputM;
    @FXML private TextField inputN;
    @FXML private TextField inputO;
    @FXML private TextField inputP;
    @FXML private TextField inputQ;
    @FXML private TextField inputR;
    @FXML private TextField inputS;
    @FXML private TextField inputT;
    @FXML private TextField inputU;
    @FXML private TextField inputV;
    @FXML private TextField inputW;
    @FXML private TextField inputX;
    @FXML private TextField inputY;
    @FXML private TextField inputZ;
    @FXML private TextField input;
    @FXML private TextField output;


    @FXML
    private void refresh(ActionEvent event) {
        char toCrypt[] = input.getText().toCharArray();


        for (int i = 0; i < toCrypt.length; i++) {

            switch (toCrypt[i]) {
                case 'a':
                    char A[]=inputA.getText().toCharArray();
                    if (inputA.getText().isEmpty()) {
                        toCrypt[i] = 'a';
                    }
                    else{
                            toCrypt[i] = A[0];
                        }
                    break;
                case 'b':
                    char B[]=inputB.getText().toCharArray();
                    if (inputB.getText().isEmpty()) {
                        toCrypt[i] = 'b';
                    }
                    else {
                        toCrypt[i] = B[0];
                    }
                    break;

                case 'c':
                    char C[]=inputC.getText().toCharArray();
                    if (inputC.getText().isEmpty()) {
                        toCrypt[i] = 'c';
                    }
                    else {
                        toCrypt[i] = C[0];
                    }
                    break;
                case 'd':
                    char D[]=inputD.getText().toCharArray();
                    if (inputD.getText().isEmpty()) {
                        toCrypt[i] = 'd';
                    }
                    else {
                        toCrypt[i] = D[0];
                    }
                    break;

                case 'e':
                    char E[]=inputE.getText().toCharArray();
                    if (inputE.getText().isEmpty()) {
                        toCrypt[i] = 'e';
                    }
                    else {
                        toCrypt[i] = E[0];
                    }
                    break;
                case 'f':
                    char F[]=inputF.getText().toCharArray();
                    if (inputF.getText().isEmpty()) {
                        toCrypt[i] = 'f';
                    }
                    else {
                        toCrypt[i] = F[0];
                    }
                    break;
                case 'g':
                    char G[]=inputG.getText().toCharArray();
                    if (inputG.getText().isEmpty()) {
                        toCrypt[i] = 'g';
                    }
                    else {
                        toCrypt[i] = G[0];
                    }
                    break;
                case 'h':
                    char H[]=inputH.getText().toCharArray();
                    if (inputH.getText().isEmpty()) {
                        toCrypt[i] = 'h';
                    }
                    else {
                        toCrypt[i] = H[0];
                    }
                    break;
                case 'i':
                    char I[]=inputI.getText().toCharArray();
                    if (inputI.getText().isEmpty()) {
                        toCrypt[i] = 'i';
                    }
                    else {
                        toCrypt[i] = I[0];
                    }
                    break;

                case 'j':
                    char J[]=inputJ.getText().toCharArray();
                    if (inputJ.getText().isEmpty()) {
                        toCrypt[i] = 'j';
                    }
                    else {
                        toCrypt[i] = J[0];
                    }
                    break;
                case 'k':
                    char K[]=inputK.getText().toCharArray();
                    if (inputK.getText().isEmpty()) {
                        toCrypt[i] = 'k';
                    }
                    else {
                        toCrypt[i] = K[0];
                    }
                    break;
                case 'l':
                    char L[]=inputL.getText().toCharArray();
                    if (inputA.getText().isEmpty()) {
                        toCrypt[i] = 'a';
                    }
                    else {
                        toCrypt[i] = L[0];
                    }
                    break;
                case 'm':
                    char M[]=inputM.getText().toCharArray();
                    if (inputM.getText().isEmpty()) {
                        toCrypt[i] = 'm';
                    }
                    else {
                        toCrypt[i] = M[0];
                    }
                    break;
                case 'n':
                    char N[]=inputN.getText().toCharArray();
                    if (inputN.getText().isEmpty()) {
                        toCrypt[i] = 'n';
                    }
                    else {
                        toCrypt[i] = N[0];
                    }
                    break;
                case 'o':
                    char O[]=inputO.getText().toCharArray();
                    if (inputO.getText().isEmpty()) {
                        toCrypt[i] = 'o';
                    }
                    else {
                        toCrypt[i] = O[0];
                    }
                    break;
                case 'p':
                    char P[]=inputP.getText().toCharArray();
                    if (inputP.getText().isEmpty()) {
                        toCrypt[i] = 'p';
                    }
                    else {
                        toCrypt[i] = P[0];
                    }
                    break;
                case 'q':
                    char Q[]=inputQ.getText().toCharArray();
                    if (inputQ.getText().isEmpty()) {
                        toCrypt[i] = 'q';
                    }
                    else {
                        toCrypt[i] = Q[0];
                    }
                    break;
                case 'r':
                    char R[]=inputR.getText().toCharArray();
                    if (inputR.getText().isEmpty()) {
                        toCrypt[i] = 'r';
                    }
                    else {
                        toCrypt[i] = R[0];
                    }
                    break;
                case 's':
                    char S[]=inputS.getText().toCharArray();
                    if (inputS.getText().isEmpty()) {
                        toCrypt[i] = 's';
                    }
                    else {
                        toCrypt[i] = S[0];
                    }
                    break;
                case 't':
                    char T[]=inputT.getText().toCharArray();
                    if (inputT.getText().isEmpty()) {
                        toCrypt[i] = 't';
                    }
                    else {
                        toCrypt[i] = T[0];
                    }
                    break;
                case 'u':
                    char U[]=inputU.getText().toCharArray();
                    if (inputU.getText().isEmpty()) {
                        toCrypt[i] = 'u';
                    }
                    else {
                        toCrypt[i] = U[0];
                    }
                    break;
                case 'v':
                    char V[]=inputV.getText().toCharArray();
                    if (inputV.getText().isEmpty()) {
                        toCrypt[i] = 'v';
                    }
                    else {
                        toCrypt[i] = V[0];
                    }
                    break;
                case 'w':
                    char W[]=inputW.getText().toCharArray();
                    if (inputW.getText().isEmpty()) {
                        toCrypt[i] = 'w';
                    }
                    else {
                        toCrypt[i] = W[0];
                    }
                    break;
                case 'x':
                    char X[]=inputX.getText().toCharArray();
                    if (inputX.getText().isEmpty()) {
                        toCrypt[i] = 'x';
                    }
                    else {
                        toCrypt[i] = X[0];
                    }
                    break;
                case 'y':
                    char Y[]=inputY.getText().toCharArray();
                    if (inputY.getText().isEmpty()) {
                        toCrypt[i] = 'y';
                    }
                    else {
                        toCrypt[i] = Y[0];
                    }
                    break;
                case 'z':
                    char Z[]=inputZ.getText().toCharArray();
                    if (inputZ.getText().isEmpty()) {
                        toCrypt[i] = 'z';
                    }
                    else {
                        toCrypt[i] = Z[0];
                    }
                    break;



                default: {
                    output.setText("inne");
                }
            }

        }
        String print=new String(toCrypt);
        output.setText(print);
    }

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