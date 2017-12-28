
package javafxbasico.Button;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;



//O uso de XML é possível no JavaFX para que possamos criar a GUI de uma aplicação
//e então referenciar o mesmo no código JavaFX. Os XMLs que contém componentes
//JavaFX são chamados de FXML.




public class FXMLButtonController implements Initializable {
    
    @FXML
    private Label labelOlaMundo;
    
    @FXML
    private TextField txtnome;

    
    @FXML
    private void AcaoDoBotao(ActionEvent event) {
        System.out.println("Você clicou...");
        labelOlaMundo.setText("Olá, Seja bem vindo "+txtnome.getText());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
