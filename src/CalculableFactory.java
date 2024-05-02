public class CalculableFactory implements ICalculableFactory{
    @Override
    public Calculable create(Complex primaryArg) {
        return new Calculator(primaryArg);
    }
}
