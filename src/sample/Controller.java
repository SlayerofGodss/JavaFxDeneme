package sample;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
public class Controller {
    @FXML
        TextField sayi1,sayi2,sonuc;
        public void toplaEvent(){
            sonuc.setText(String.valueOf(Integer.parseInt(sayi1.getText())+Integer.parseInt(sayi2.getText())));
    }
}

