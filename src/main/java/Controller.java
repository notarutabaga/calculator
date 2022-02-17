import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import javax.lang.model.type.NullType;
import java.security.spec.RSAOtherPrimeInfo;

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
    public JFXButton clearEntryButton;

    public double firstTerm;
    public char function;
    public double result;
    public TextField termsField;
    public JFXButton clearButton;

    public void initialize() {
        System.out.println(firstTerm);
    }

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
            String input = textField.getText();
            input = input.concat(digit);
            textField.setText(input);
            System.out.println(input);
        }
    }

    public void clearEntryField() {
        textField.clear();
    }

    public void changeSign() {
        if (!textField.getText().isEmpty()) {
            String input = textField.getText();

            if (input.startsWith("-")) {
                input = input.substring(1);
            } else {
                input = "-" + input;
            }

            System.out.println(input);
            textField.setText(input);
        }
    }

    public void deciButtonPressed() {
        String input = "";
        if (textField.getText().isEmpty()) {
            input = "0.";
            textField.setText(input);
            System.out.println(input);
        } else {
            input = textField.getText();

            if (!input.contains(".")) {
                input = input.concat(".");
                textField.setText(input);
                System.out.println(input);
            }
        }
    }

    public void getFirstTerm() {
        if (textField.getText().isEmpty()) {
            firstTerm = 0;
        } else {
            firstTerm = Double.parseDouble(textField.getText());
        }
        System.out.println(firstTerm);
    }

    public void multPressed() {
        getFirstTerm();

        function = 'x';

        int intTest = (int)firstTerm;
        System.out.println(intTest);

        if (firstTerm == intTest) {
            termsField.setText(String.valueOf(intTest) + " x");
        } else {
            termsField.setText(String.valueOf(firstTerm) + " x");
        }

        textField.clear();
    }

    public void subtPressed() {
        getFirstTerm();

        int intTest = (int)firstTerm;
        System.out.println(intTest);

        if (firstTerm == intTest) {
            termsField.setText(String.valueOf(intTest) + " -");
        } else {
            termsField.setText(String.valueOf(firstTerm) + " -");
        }

        function = '-';
        textField.clear();
    }

    public void addPressed() {
        getFirstTerm();

        int intTest = (int)firstTerm;
        System.out.println(intTest);

        if (firstTerm == intTest) {
            termsField.setText(String.valueOf(intTest) + " +");
        } else {
            termsField.setText(String.valueOf(firstTerm) + " +");
        }

        function = '+';
        textField.clear();
    }

    public void diviPressed() {
        getFirstTerm();

        int intTest = (int)firstTerm;
        System.out.println(intTest);

        if (firstTerm == intTest) {
            termsField.setText(String.valueOf(intTest) + " /");
        } else {
            termsField.setText(String.valueOf(firstTerm) + " /");
        }

        function = '/';
        textField.clear();
    }

    public void equalsPressed() {
        String inputString = textField.getText();
        double inputDouble = Double.parseDouble(inputString);
        int resIntTest;
        String terms;
        int firstIntTest = (int) firstTerm;
        int inputIntTest = (int) inputDouble;

        if (function == '+') {
            result = firstTerm + inputDouble;

            if (firstIntTest == firstTerm) {
                terms = String.valueOf(firstIntTest);
            } else {
                terms = String.valueOf(firstTerm);
            }

            terms = terms.concat(" + ");

            if (inputIntTest == inputDouble) {
                terms = terms.concat(String.valueOf(inputIntTest));
            } else {
                terms = terms.concat(String.valueOf(inputDouble));
            }

            termsField.setText(terms);

            resIntTest = (int) result;
            if (resIntTest == result) {
                textField.setText(String.valueOf(resIntTest));
            } else {
                textField.setText(String.valueOf(result));
            }
            System.out.println(result);
        } else if (function == '-') {
            result = firstTerm - inputDouble;

            if (firstIntTest == firstTerm) {
                terms = String.valueOf(firstIntTest);
            } else {
                terms = String.valueOf(firstTerm);
            }

            terms = terms.concat(" - ");

            if (inputIntTest == inputDouble) {
                terms = terms.concat(String.valueOf(inputIntTest));
            } else {
                terms = terms.concat(String.valueOf(inputDouble));
            }

            termsField.setText(terms);

            resIntTest = (int) result;
            if (resIntTest == result) {
                textField.setText(String.valueOf(resIntTest));
            } else {
                textField.setText(String.valueOf(result));
            }
            System.out.println(result);
        } else if (function == 'x') {
            result = firstTerm * inputDouble;

            if (firstIntTest == firstTerm) {
                terms = String.valueOf(firstIntTest);
            } else {
                terms = String.valueOf(firstTerm);
            }

            terms = terms.concat(" x ");

            if (inputIntTest == inputDouble) {
                terms = terms.concat(String.valueOf(inputIntTest));
            } else {
                terms = terms.concat(String.valueOf(inputDouble));
            }

            termsField.setText(terms);

            resIntTest = (int) result;
            if (resIntTest == result) {
                textField.setText(String.valueOf(resIntTest));
            } else {
                textField.setText(String.valueOf(result));
            }
            System.out.println(result);
        } else if (function == '/') {
            result = firstTerm / inputDouble;
            if (firstIntTest == firstTerm) {
                terms = String.valueOf(firstIntTest);
            } else {
                terms = String.valueOf(firstTerm);
            }

            terms = terms.concat(" / ");

            if (inputIntTest == inputDouble) {
                terms = terms.concat(String.valueOf(inputIntTest));
            } else {
                terms = terms.concat(String.valueOf(inputDouble));
            }

            termsField.setText(terms);

            resIntTest = (int) result;
            if (resIntTest == result) {
                textField.setText(String.valueOf(resIntTest));
            } else {
                textField.setText(String.valueOf(result));
            }
            System.out.println(result);
        }
    }

    public void clearAll() {
        termsField.clear();
        textField.clear();
    }
}
