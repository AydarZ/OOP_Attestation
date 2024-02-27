package Model;

import Controller.Interfases.iCalculable;
import Model.Core.ComplexNumber;

public class Decorator implements iCalculable {
    Calculator calculator;
    Logger logger;

    public Decorator(Calculator calc, Logger log) {
        this.calculator = calc;
        this.logger = log;
    }

    @Override
    public void setNum1(ComplexNumber num1) {
        calculator.setNum1(num1);

    }

    @Override
    public iCalculable sum(ComplexNumber num2) {
        logger.log(
                String.format("Первое значение калькулятора %f + %fi. Начало вызова метода sum с параметром %f + %fi",
                        calculator.getResult().getFirstArg(), calculator.getResult().getSecondArgs(),
                        num2.getFirstArg(), num2.getSecondArgs()));
        iCalculable result = calculator.sum(num2);
        return result;
    }

    @Override
    public iCalculable multi(ComplexNumber num2) {
        logger.log(
                String.format("Первое значение калькулятора %f + %fi. Начало вызова метода multi с параметром %f + %fi",
                        calculator.getResult().getFirstArg(), calculator.getResult().getSecondArgs(),
                        num2.getFirstArg(), num2.getSecondArgs()));
        iCalculable result = calculator.multi(num2);
        return result;
    }

    @Override
    public iCalculable divide(ComplexNumber num2) {
        logger.log(String.format(
                "Первое значение калькулятора %f + %fi. Начало вызова метода divide с параметром %f + %fi",
                calculator.getResult().getFirstArg(), calculator.getResult().getSecondArgs(), num2.getFirstArg(),
                num2.getSecondArgs()));
        iCalculable result = calculator.divide(num2);
        return result;
    }

    @Override
    public ComplexNumber getResult() {
        logger.log(String.format("Получение результата: %f + %fi", calculator.getResult().getFirstArg(),
                calculator.getResult().getSecondArgs()));
        return calculator.getResult();
    }

}
