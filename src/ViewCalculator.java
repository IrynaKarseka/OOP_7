import java.util.Scanner;

public class ViewCalculator {
    private ICalculableFactory calculableFactory;

    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        while (true) {
            Complex primaryArg = promptComplex("Введите первый аргумент \n");
            Calculable calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (*, +, /, =): ");
                if (cmd.equals("*")) {
                    Complex arg = promptComplex("Введите второй аргумент: ");
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    Complex arg = promptComplex("Введите второй аргумент: \n");
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("/")) {
                    Complex arg = promptComplex("Введите второй аргумент: \n");
                    calculator.div(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    System.out.printf("Результат %s\n", calculator.getResult());
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y") || cmd.equals("y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }

    private double promptDouble(String msg){
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg);
        return Double.parseDouble(scanner.nextLine());
    }
    private Complex promptComplex(String message) {
        System.out.print(message);
        double inputRe = promptDouble("Введите вещественную часть: ");
        double inputIm = promptDouble("Введите мнимую часть: ");
        return new Complex(inputRe, inputIm);
    }
}
