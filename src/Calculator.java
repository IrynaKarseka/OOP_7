public class Calculator implements Calculable {
    private Complex primaryArg;

    public Calculator(Complex primaryArg) {
        this.primaryArg = primaryArg;
    }
    @Override
    public Calculable sum(Complex arg) {
        this.primaryArg = this.primaryArg.plus(arg);
        return this;
    }

    @Override
    public Calculable multi(Complex arg) {
        this.primaryArg = this.primaryArg.plus(arg);
        return this;
    }

    @Override
    public Calculable div(Complex arg) {
        this.primaryArg = this.primaryArg.divide(arg);
        return this;
    }

    @Override
    public Complex getResult() {
        return primaryArg;
    }
}
