package sample;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
public class Controller {
@FXML
    TextField txtOkul, txtBolum ,txtSonuc;
public void onayEvent(){
    txtSonuc.setText(txtOkul.getText()+" "+txtBolum.getText());
 }
public void silEvent(){
    txtOkul.clear();
    txtBolum.clear();
    txtSonuc.clear();
}
}





