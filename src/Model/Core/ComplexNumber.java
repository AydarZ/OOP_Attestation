package Model.Core;

public class ComplexNumber {
    private double firstArg;
    private double secondArgs;
    
    public ComplexNumber(double firstArg, double secondArgs) {
        this.firstArg = firstArg;
        this.secondArgs = secondArgs;
    }

    public double getFirstArg() {
        return firstArg;
    }

    public void setFirstArg(double firstArg) {
        this.firstArg = firstArg;
    }

    public double getSecondArgs() {
        return secondArgs;
    }

    public void setSecondArgs(double secondArgs) {
        this.secondArgs = secondArgs;
    }

    
}
