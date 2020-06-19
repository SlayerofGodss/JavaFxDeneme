package sample;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class Controller {
@FXML
    TextField txt;
@FXML
Label lbl;
    public void bulEvent(){
    int uzunluk;
    uzunluk=txt.getLength();
    lbl.setText("kelime uzunluğu:"+uzunluk+" karakter");
}
}





