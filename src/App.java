import java.util.logging.Logger;

import Controller.Interfases.iCalculable;
import Model.Calculator;
import Model.Decorator;
import Model.Core.ComplexNumber;
import View.ViewCalculator;

public class App {
    public static void main(String[] args) throws Exception {
        ComplexNumber num = new ComplexNumber(0, 0);

        iCalculable decorator = new Decorator(new Calculator(num), new Model.Logger());
        ViewCalculator view = new ViewCalculator(decorator);
        view.run();
    }
}
