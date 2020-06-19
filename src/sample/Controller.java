package sample;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
public class Controller {
    @FXML
    TextField sayi1,sayi2,sonuc;
    public void toplaEvent(){
        int a,b;
        a=Integer.valueOf(sayi1.getText());
        b=Integer.valueOf(sayi2.getText());
        sonuc.setText(String.valueOf(a+b));
    }
}

