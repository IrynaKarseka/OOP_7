// Для комплексного числа a + bi действительное число a называется его действительной частью,
// а действительное число b является его мнимой частью, мнимая часть является действительной координатой b,
// а не комплексным числом bi.
// Действительная часть комплексного числа z обозначается Re(z), мнимая часть - Im(z)

public class Complex {
    private double Re;
    private double Im;
    public Complex(double Re, double Im) {
        this.Re = Re;
        this.Im = Im;
    }

    public double getRe() {
        return Re;
    }

    public void setRe(double re) {
        Re = re;
    }

    public double getIm() {
        return Im;
    }

    public void setIm(double im) {
        Im = im;
    }

    public Complex plus(Complex b) {
//        z1=a+bi      z2=c+di
//        z1+ z2=(a+bi)+( c+di)=(a+c)+(bi+di)=(a+c)+(b+d)i
//        Пример 1.  z1=2+5i      z2=4-3i
//        Ответ:      z1+ z2=(2+5i)+(4-3i)=(2+4)+(5i-3i)= 6+ 2i
// run    Введите первый аргумент
//        Введите вещественную часть: 2
//        Введите мнимую часть: 5
//        Введите команду (*, +, /, =): +
//        Введите второй аргумент:
//        Введите вещественную часть: 4
//        Введите мнимую часть: -3
//        Введите команду (*, +, /, =): =
//        Результат Complex{Re=6.0, Im=2.0}
//        Еще посчитать (Y/N)?
        double plusRe = this.Re + b.Re;
        double plusIm = this.Im + b.Im;
        return new Complex(plusRe, plusIm);
    }

    public Complex multiply(Complex b) {
        double multiplyRe = this.Re * b.Re - this.Im * b.Im;
        double multiplyIm = this.Re * b.Im + this.Im * b.Re;
        return new Complex(multiplyRe, multiplyIm);
    }

    public Complex divide(Complex b) {
        double denominator = b.Re * b.Re + b.Im * b.Im;
        double divideRe = (this.Re * b.Re + this.Im * b.Im)/denominator;
        double divideIm =(this.Im * b.Re - this.Re * b.Im)/denominator;
        return new Complex(divideRe,divideIm);
    }


    @Override
    public String toString() {
        return "Complex{" +
                "Re=" + Re +
                ", Im=" + Im +
                '}';
    }
}
