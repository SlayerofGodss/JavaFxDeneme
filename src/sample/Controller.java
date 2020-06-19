package sample;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class Controller {
   @FXML
    TextField txt;
   @FXML
    Label lbl;
   public void GosterEvent(){
       String k=txt.getText();
       if (! k.matches("[0-9]*"))
           lbl.setText("Sadece Sayı Girebilirsizniz");
   }
}

