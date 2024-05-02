public class LogCalculableFactory implements ICalculableFactory {
    private final Logable logable;

    public LogCalculableFactory(Logable logable) {
        this.logable = logable;
    }
    @Override
    public Calculable create(Complex primaryArg) {
        return new LogCalculator(new Calculator(primaryArg), this.logable);
    }
}
