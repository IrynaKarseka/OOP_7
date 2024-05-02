public class LogCalculator implements Calculable {
    private final Calculable oldCalc;
    private final Logable logable;

    public LogCalculator(Calculable oldCalc, Logable logable) {
        this.oldCalc = oldCalc;
        this.logable = logable;
    }

    @Override
    public Calculable sum(Complex arg) {
        Complex firstArg = oldCalc.getResult();
        logable.log(String.format("Значение калькулятора %s. Начало вызова метода sum с параметром %s", firstArg, arg));
        Calculable result = oldCalc.sum(arg);
        logable.log("Вызов метода sum произошел.");
        return result;
    }

    @Override
    public Calculable multi(Complex arg) {
        Complex firstArg = oldCalc.getResult();
        logable.log(String.format("Значение калькулятора %s. Начало вызова метода multi с параметром %s", firstArg, arg));
        Calculable result = oldCalc.multi(arg);
        logable.log("Вызов метода multi произошел.");
        return result;
    }

    @Override
    public Calculable div(Complex arg) {
        Complex firstArg = oldCalc.getResult();
        logable.log(String.format("Значение калькулятора %s. Начало вызова метода div с параметром %s", firstArg, arg));
        Calculable result = oldCalc.div(arg);
        logable.log("Вызов метода div произошел.");
        return result;
    }

    @Override
    public Complex getResult() {
        Complex result = oldCalc.getResult();
        logable.log(String.format("Получение результата %s", result));
        return result;
    }
}
