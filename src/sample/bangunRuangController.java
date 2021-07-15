package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class bangunRuangController implements Initializable {

    @FXML
    private BorderPane brPane;
    @FXML
    private Button hitungLuasPermukaanButton;
    @FXML
    private Button hitungVolumeButton;
    @FXML
    private TextField sisiField;
    @FXML
    private TextField panjangField;
    @FXML
    private TextField lebarField;
    @FXML
    private TextField jariField;
    @FXML
    private TextField resultTextField;
    @FXML
    private TextField tinggiField;
    @FXML
    private ImageView exit;
    @FXML
    private ImageView home;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void kubus(ActionEvent event) {
        Loader object = new Loader();
        Pane view = object.getPage("kubus");
        brPane.setCenter(view);
    }

    @FXML
    private void balok(ActionEvent event) {
        Loader object = new Loader();
        Pane view = object.getPage("balok");
        brPane.setCenter(view);
    }

    @FXML
    private void tabung(ActionEvent event) {
        Loader object = new Loader();
        Pane view = object.getPage("tabung");
        brPane.setCenter(view);
    }

    @FXML
    private void kerucut(ActionEvent event) {
        Loader object = new Loader();
        Pane view = object.getPage("kerucut");
        brPane.setCenter(view);
    }

    @FXML
    private void bola(ActionEvent event) {
        Loader object = new Loader();
        Pane view = object.getPage("bola");
        brPane.setCenter(view);
    }

    Kubus kubus = new Kubus(0);
    Balok balok = new Balok(0,0,0);
    Tabung tabung = new Tabung(0,0);
    Kerucut kerucut1 = new Kerucut(0,0);
    Kerucut kerucut2 = new Kerucut(0,0,0);
    Bola bola = new Bola(0);

    @FXML
    public void hitungLuasPermukaanKubusOnAction(ActionEvent event) {
        if (sisiField.getText().isEmpty()) {
            resultTextField.setText("Sisi must be entered");
        } else {
            kubus.setSisi(Double.parseDouble(sisiField.getText()));
            resultTextField.setText("Luas Permukaan Kubus : " + kubus.hitungLuasPermukaan() + " cm\u00B2");
        }
    }

    @FXML
    public void hitungVolumeKubusOnAction(ActionEvent event) {
        if (sisiField.getText().isEmpty()) {
            resultTextField.setText("Sisi must be entered");
        } else {
            kubus.setSisi(Double.parseDouble(sisiField.getText()));
            resultTextField.setText("Volume Kubus : " + kubus.hitungVolume() + " cm\u00B3");
        }
    }

    @FXML
    public void hitungLuasPermukaanBalokOnAction(ActionEvent event) {
        if (panjangField.getText().isEmpty()||lebarField.getText().isEmpty()||tinggiField.getText().isEmpty()) {
            resultTextField.setText("Panjang, Lebar, and Tinggi must be entered");
        } else {
            balok.setPanjang(Double.parseDouble(panjangField.getText()));
            balok.setLebar(Double.parseDouble(lebarField.getText()));
            balok.setTinggi(Double.parseDouble(tinggiField.getText()));
            resultTextField.setText("Luas Permukaan Balok : " + balok.hitungLuasPermukaan() + " cm\u00B2");
        }
    }

    @FXML
    public void hitungVolumeBalokOnAction(ActionEvent event) {
        if (panjangField.getText().isEmpty()||lebarField.getText().isEmpty()||tinggiField.getText().isEmpty()) {
            resultTextField.setText("Panjang, Lebar, and Tinggi must be entered");
        } else {
            balok.setPanjang(Double.parseDouble(panjangField.getText()));
            balok.setLebar(Double.parseDouble(lebarField.getText()));
            balok.setTinggi(Double.parseDouble(tinggiField.getText()));
            resultTextField.setText("Volume Balok : " + balok.hitungVolume() + " cm\u00B3");
        }
    }

    @FXML
    public void hitungLuasPermukaanTabungButtonOnAction(ActionEvent event) {
        if (jariField.getText().isEmpty()||tinggiField.getText().isEmpty()) {
            resultTextField.setText("Jari-Jari and Tinggi must be entered");
        } else {
            tabung.setJari(Double.parseDouble(jariField.getText()));
            tabung.setTinggi(Double.parseDouble(tinggiField.getText()));
            resultTextField.setText("Luas Permukaan Tabung : " + tabung.hitungLuasPermukaan() + " cm\u00B2");
        }
    }

    @FXML
    public void hitungVolumeTabungButtonOnAction(ActionEvent event) {
        if (jariField.getText().isEmpty()||tinggiField.getText().isEmpty()) {
            resultTextField.setText("Jari-Jari and Tinggi must be entered");
        } else {
            tabung.setJari(Double.parseDouble(jariField.getText()));
            tabung.setTinggi(Double.parseDouble(tinggiField.getText()));
            resultTextField.setText("Luas Permukaan Tabung : " + tabung.hitungVolume() + " cm\u00B3");
        }
    }

    @FXML
    public void hitungLuasPermukaanKerucutButtonOnAction(ActionEvent event) {
        if (jariField.getText().isEmpty()||sisiField.getText().isEmpty()) {
            resultTextField.setText("Jari-Jari and Sisi must be entered");
        } else {
            kerucut1.setJari(Double.parseDouble(jariField.getText()));
            kerucut1.setSisi(Double.parseDouble(sisiField.getText()));
            resultTextField.setText("Luas Permukaan Kerucut : " + kerucut1.hitungLuasPermukaan() + " cm\u00B2");
        }
    }

    @FXML
    public void hitungVolumeKerucutButtonOnAction(ActionEvent event) {
        if (jariField.getText().isEmpty()||tinggiField.getText().isEmpty()) {
            resultTextField.setText("Jari-Jari and Tinggi must be entered");
        } else {
            kerucut2.setJari(Double.parseDouble(jariField.getText()));
            kerucut2.setTinggi(Double.parseDouble(tinggiField.getText()));
            resultTextField.setText("Volume Kerucut : " + kerucut2.hitungVolume() + " cm\u00B3");
        }
    }

    @FXML
    public void hitungLuasPermukaanBolaButtonOnAction(ActionEvent event) {
        if (jariField.getText().isEmpty()) {
            resultTextField.setText("Jari-Jari must be entered");
        } else {
            bola.setJari(Double.parseDouble(jariField.getText()));
            resultTextField.setText("Luas Permukaan Bola : " + bola.hitungLuasPermukaan() + " cm\u00B2");
        }
    }

    @FXML
    public void hitungVolumeBolaButtonOnAction(ActionEvent event) {
        if (jariField.getText().isEmpty()) {
            resultTextField.setText("Jari-Jari must be entered");
        } else {
            bola.setJari(Double.parseDouble(jariField.getText()));
            resultTextField.setText("Luas Permukaan Bola : " + bola.hitungVolume() + " cm\u00B3");
        }
    }

    @FXML
    public void exitButtonOnAction(MouseEvent event) {
        Stage primarystage = (Stage) exit.getScene().getWindow();
        primarystage.close();
    }

    @FXML
    public void homeButtonOnAction(MouseEvent event) throws IOException {
        Parent homePage = FXMLLoader.load(getClass().getResource("fxml/homepage.fxml"));
        Scene homePageScene = new Scene(homePage);
        Stage homePageStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        homePageStage.hide();
        homePageStage.setScene(homePageScene);
        homePageStage.show();
    }
}