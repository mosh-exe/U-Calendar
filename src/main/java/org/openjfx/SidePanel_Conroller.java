package org.openjfx;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;




/*
@Author Ayman Abu Awad
 */
public class SidePanel_Conroller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;


    @FXML
    void Quit(MouseEvent event) { System.exit(0);}


    @FXML
    void initialize() {

    }


    @FXML
    void Quit(MouseEvent event) { System.exit(0);}

    @FXML
    void handleAdd(MouseEvent event) throws IOException {

        Parent mainApp = FXMLLoader.load(getClass().getResource("AddEvent.fxml"));
        Scene mainScene = new Scene(mainApp);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setTitle("Add Event");
        window.setScene(mainScene);
        window.show();

    }

}
