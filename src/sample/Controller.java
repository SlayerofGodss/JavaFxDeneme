package sample;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
public class Controller {
@FXML
    Label lbl;
public void fontDegistir(){
    lbl.setFont(Font.font("Consolas",FontWeight.BOLD,25));
}
}



