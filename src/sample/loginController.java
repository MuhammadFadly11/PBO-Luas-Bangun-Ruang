package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class loginController implements Initializable {
    @FXML
    private TextField userNameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button loginButton;
    @FXML
    private Button exitButton;
    @FXML
    private Label alertLabel;

    Account fahri = new Account("fahridarmawan", "12345", "Fahri Darmawan");
    Account fadly = new Account("mfadly", "54321", "Muhammad Fadly");
    Account ayu = new Account("ayulaura", "13579", "Ayu Laura Limbong");

    @Override
    public void initialize(URL url, ResourceBundle rb){}

    @FXML
    public void loginButtonOnAction(ActionEvent event) throws IOException {
        if (userNameField.getText().isEmpty()||passwordField.getText().isEmpty()) {
            alertLabel.setText("Please enter username and password!!");
        } else if (userNameField.getText().equals(fahri.getUserName())&&passwordField.getText().equals(fahri.getPassword())) {
                FXMLLoader loader = new FXMLLoader(Main.class.getResource("fxml/homepage.fxml"));
                Parent root = loader.load();
                homePageController hpCtrl = loader.getController();
                hpCtrl.showInformation(fahri.getFullName());
                Scene homePageScene = new Scene(root);
                Stage homePageStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                homePageStage.hide();
                homePageStage.setScene(homePageScene);
                homePageStage.show();
        } else if (userNameField.getText().equals(fadly.getUserName())&&passwordField.getText().equals(fadly.getPassword())) {
                FXMLLoader loader = new FXMLLoader(Main.class.getResource("fxml/homepage.fxml"));
                Parent root = loader.load();
                homePageController hpCtrl = loader.getController();
                hpCtrl.showInformation(fadly.getFullName());
                Scene homePageScene = new Scene(root);
                Stage homePageStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                homePageStage.hide();
                homePageStage.setScene(homePageScene);
                homePageStage.show();
        } else if (userNameField.getText().equals(ayu.getUserName())&&passwordField.getText().equals(ayu.getPassword())) {
                FXMLLoader loader = new FXMLLoader(Main.class.getResource("fxml/homepage.fxml"));
                Parent root = loader.load();
                homePageController hpCtrl = loader.getController();
                hpCtrl.showInformation(ayu.getFullName());
                Scene homePageScene = new Scene(root);
                Stage homePageStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                homePageStage.hide();
                homePageStage.setScene(homePageScene);
                homePageStage.show();
        } else {
            alertLabel.setText("Username and password doesn't match");
        }
    }

    @FXML
    public void exitButtonOnAction(ActionEvent event) {
        Stage primarystage = (Stage) exitButton.getScene().getWindow();
        primarystage.close();
    }
}
