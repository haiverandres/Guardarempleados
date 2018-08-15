/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionarchivosxml;

import Modelo.Empleado;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author ricky.mosquera
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label Ltitulo;
    @FXML
    private Label Lnombre;
    @FXML
    private Label Ldireccion;
    @FXML
    private Label Ledad;
    @FXML
    private Label LcodeEmpleado;
    @FXML
    private Label Ldepartamento;
    
    @FXML
    private TextField TNombre;
    @FXML
    private TextField Tdireccion;
    @FXML
    private TextField Tedad;
    @FXML
    private TextField TcodeEmpleado;
    @FXML
    private TextField Tdepartamento;
    
    LinkedList<Empleado> listEmpleado;
                    
    
    @FXML
    private void AgregarEmpleadoLista(ActionEvent event) {
        //System.out.println("You clicked me!");
        //label.setText("Hello World!");
     String nombre = TNombre.getText();
     String direccion = Tdireccion.getText();
     int edad = Integer.parseInt(Tedad.getText());
     String codigoEmpleado = TcodeEmpleado.getText();
     String departamento = Tdepartamento.getText();
     
     Empleado objE = new Empleado(codigoEmpleado, nombre, direccion, edad);
     listEmpleado.add(objE);
        
    }
    @FXML
    private void GuardarArchivoXML(ActionEvent event) {
        
        Empleado objE = new Empleado();
        boolean guardar = objE.crearFileXML(listEmpleado);
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        listEmpleado = new LinkedList<>();
        
    }    
    
}
