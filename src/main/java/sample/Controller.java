package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class Controller {
    @FXML
    private TextField numbersTextfield;


    public void onButtonClick(ActionEvent e){
        Button b = (Button) e.getSource();
        numbersTextfield.setText(numbersTextfield.getText() + b.getText());

    }

    public void onEqualClick(){
        Expression ex = new ExpressionBuilder(numbersTextfield.getText()).build();
        numbersTextfield.setText(Double.toString(ex.evaluate()));
    }
}
