package View;

import java.util.Scanner;
import Controller.Interfases.iCalculable;
import Model.Core.ComplexNumber;

public class ViewCalculator {
    private iCalculable calc;

    public ViewCalculator(iCalculable calc) {
        this.calc = calc;
    }

    public void run() {
        while (true) {
            double primaryArgA = promptInt(
                    "Введите поочередно элементы первого комплексного числа вида 'а+bi':n\'число а: ");
            double primaryArgB = promptInt("число b: ");
            ComplexNumber num1 = new ComplexNumber(primaryArgA, primaryArgB);
            calc.setNum1(num1);

            while (true) {
                String cmd = promptStr("Введите команду (+, *, /, =) : ");
                if (cmd.equals("+")) {
                    double secondaryArgA = promptInt(
                            "Введите поочередно элементы второго комплексного числа вида 'а+bi':n\'число а: ");
                    double secondaryArgB = promptInt("число b: ");
                    ComplexNumber num2 = new ComplexNumber(secondaryArgA, secondaryArgB);
                    calc.sum(num2);
                    continue;
                }

                if (cmd.equals("*")) {
                    double secondaryArgA = promptInt(
                            "Введите поочередно элементы второго комплексного числа вида 'а+bi':n\'число а: ");
                    double secondaryArgB = promptInt("число b: ");
                    ComplexNumber num2 = new ComplexNumber(secondaryArgA, secondaryArgB);
                    calc.multi(num2);
                    continue;
                }

                if (cmd.equals("/")) {
                    double secondaryArgA = promptInt(
                            "Введите поочередно элементы второго комплексного числа вида 'а+bi':n\'число а: ");
                    double secondaryArgB = promptInt("число b: ");
                    ComplexNumber num2 = new ComplexNumber(secondaryArgA, secondaryArgB);
                    calc.divide(num2);
                    continue;
                }

                if (cmd.equals("=")) {
                    ComplexNumber result = calc.getResult();
                    System.out.printf("Результат:\n %f + %fi\n", result.getFirstArg(), result.getSecondArgs());
                    break;
                }
            }
            String cmd = promptStr("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private double promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }

    private String promptStr(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
