package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Node;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class homePageController implements Initializable {

    @FXML
    private Button bangunDatarButton;
    @FXML
    private Button bangunRuangButton;
    @FXML
    private Label nameLabel;
    @FXML
    private Label welcomeLabel;
    @FXML
    private ImageView exit;
    @FXML
    private ImageView logout;

    @Override
    public void initialize(URL url, ResourceBundle rb) { }

    @FXML
    public void bangunDatarButtonOnAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("fxml/bangunDatar.fxml"));
        Scene secondScene = new Scene(root);
        Stage secondStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        secondStage.hide();
        secondStage.setScene(secondScene);
        secondStage.show();
    }

    @FXML
    public void bangunRuangButtonOnAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("fxml/bangunRuang.fxml"));
        Scene thirdScene = new Scene(root);
        Stage thirdStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        thirdStage.hide();
        thirdStage.setScene(thirdScene);
        thirdStage.show();
    }

    @FXML
    public void logoutButtonOnAction(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("fxml/login.fxml"));
        Scene loginScene = new Scene(root);
        Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        loginStage.hide();
        loginStage.setScene(loginScene);
        loginStage.show();
    }

    @FXML
    public void exitButtonOnAction(MouseEvent event) {
        Stage primarystage = (Stage) exit.getScene().getWindow();
        primarystage.close();
    }

    public void showInformation(String name) {
        welcomeLabel.setText("Welcome, ");
        nameLabel.setText(name);
    }

}
