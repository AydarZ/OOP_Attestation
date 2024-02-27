package Model;

import Controller.Interfases.iCalculable;
import Model.Core.ComplexNumber;

public class Calculator implements iCalculable {

    private ComplexNumber num1;

    public Calculator(ComplexNumber num1) {
        this.num1 = num1;
    }

    public void setNum1(ComplexNumber num1) {
        this.num1 = num1;
    }

    @Override
    public iCalculable sum(ComplexNumber num2) {
        double newNum1 = num1.getFirstArg() + num2.getFirstArg();
        double newNum2 = num1.getSecondArgs() + num2.getSecondArgs();
        num1.setFirstArg(newNum1);
        num1.setSecondArgs(newNum2);
        return this;
    }

    @Override
    public iCalculable multi(ComplexNumber num2) {
        double newNum1 = (num1.getFirstArg() * num2.getFirstArg()) - (num1.getSecondArgs() + num2.getSecondArgs());
        double newNum2 = (num1.getFirstArg() * num2.getSecondArgs()) + (num2.getFirstArg() * num1.getSecondArgs());
        num1.setFirstArg(newNum1);
        num1.setSecondArgs(newNum2);
        return this;
    }

    @Override
    public iCalculable divide(ComplexNumber num2) {
        double newNum1 = ((num1.getFirstArg() * num2.getFirstArg()) + (num1.getSecondArgs() * num2.getSecondArgs()))
                / (Math.pow(num2.getFirstArg(), 2) + Math.pow(num2.getSecondArgs(), 2));
                double newNum2 = ((num1.getSecondArgs() * num2.getFirstArg()) + (num1.getFirstArg() * num2.getSecondArgs()))
                / (Math.pow(num2.getFirstArg(), 2) + Math.pow(num2.getSecondArgs(), 2));
        num1.setFirstArg(newNum1);
        num1.setSecondArgs(newNum2);
        return this;
    }

    @Override
    public ComplexNumber getResult() {
        return num1;
    }

}
