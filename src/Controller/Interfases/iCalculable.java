package Controller.Interfases;

import Model.Core.ComplexNumber;

public interface iCalculable {
    
    iCalculable sum(ComplexNumber num2);
    iCalculable multi(ComplexNumber num2);
    iCalculable divide(ComplexNumber num2);
    ComplexNumber getResult();
    void setNum1(ComplexNumber num1);

}
