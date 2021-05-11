/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.fcys.programacion2.simulacionexamen.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import ni.edu.uni.fcys.programacion2.simulacionexamen.pojo.EnumTipoActivo;

/**
 * FXML Controller class
 *
 * @author Sistemas-09
 */
public class ActivoFXMLController implements Initializable {

    @FXML
    public TableView<?> tblView;
    @FXML
    public Button btnCalcular;
    @FXML
    public TextField txtNombre;
    @FXML
    public TextField txtValorActivo;
    @FXML
    public ComboBox<EnumTipoActivo> cmbTipoActivo;
    @FXML
    public TextField txtValorSalvado;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cmbTipoActivo.getItems().setAll(EnumTipoActivo.values());
    }    

    @FXML
    public void btnCalcularAction(ActionEvent event) {
        
    }
    
}
