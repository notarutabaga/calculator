import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class Controller {
    public TextField textField;
    public JFXButton numButton7;
    public JFXButton numButton8;
    public JFXButton numButton9;
    public JFXButton numButton6;
    public JFXButton numButton5;
    public JFXButton numButton4;
    public JFXButton numButton1;
    public JFXButton numButton2;
    public JFXButton numButton3;
    public JFXButton multButton;
    public JFXButton subtButton;
    public JFXButton addButton;
    public JFXButton diviButton;
    public JFXButton signButton;
    public JFXButton numButton0;
    public JFXButton deciButton;
    public JFXButton equalButton;
    public JFXButton clearButton;

    public void pressed7() {
        numButtonPressed("7");
    }

    public void pressed8() {
        numButtonPressed("8");
    }

    public void pressed9() {
        numButtonPressed("9");
    }

    public void pressed6() {
        numButtonPressed("6");
    }

    public void pressed5() {
        numButtonPressed("5");
    }

    public void pressed4() {
        numButtonPressed("4");
    }

    public void pressed1() {
        numButtonPressed("1");
    }

    public void pressed2() {
        numButtonPressed("2");
    }

    public void pressed3() {
        numButtonPressed("3");
    }

    public void pressed0() {
        numButtonPressed("0");
    }

    public void numButtonPressed(String digit) {
        if (textField.getText().isEmpty()) {
            textField.setText(digit);
            System.out.println(digit);
        } else {
            String number = textField.getText();
            number = number.concat(digit);
            textField.setText(number);
            System.out.println(number);
        }
    }

    public void clearField() {
        textField.clear();
    }
    // on number button press
        // each button has a method that passes the button
            // get the text in the textfield
            // concat the number and set text
}
