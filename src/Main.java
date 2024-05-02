public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new LogCalculableFactory(new FileLog());
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();
    }
}
// Введите первый аргумент: 6
// Введите команду (*, +, /, =) : /
// Введите второй аргумент: 3
// Введите команду (*, +, /, =) : =
// Результат 2
// Еще посчитать (Y/N)?