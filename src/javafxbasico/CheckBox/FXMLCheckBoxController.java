
package javafxbasico.CheckBox;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;


public class FXMLCheckBoxController  {

  
     @FXML
    private CheckBox cbjava;

    @FXML
    private CheckBox cbphp;

    @FXML
    void pegarValores() {
        
        System.out.println(cbjava.selectedProperty().getValue());
        System.out.println(cbphp.selectedProperty().getValue());

    }
    
}
