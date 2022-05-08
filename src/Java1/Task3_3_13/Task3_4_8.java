package Java1.Task3_3_13;

public class Task3_4_8 {
    public static void main(String[] args) {

        ComplexNumber complexNumber = new ComplexNumber(5.2424246, -12.45);
        ComplexNumber complexNumber1 = new ComplexNumber(5.2424246, -12.45);

        System.out.println(complexNumber.equals(complexNumber1));
        System.out.println("1: " + complexNumber.hashCode());
        System.out.println("2: " + complexNumber1.hashCode());
        System.out.println(complexNumber.hashCode() == complexNumber1.hashCode());
    }
}

class ComplexNumber {
    private double re;
    private double im;

    public ComplexNumber() {
    }

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }


    public boolean equals(Object object) {

        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        ComplexNumber that = (ComplexNumber) object;

        if (Double.compare(that.re, this.re) == 0) {
            return Double.compare(that.im, this.im) == 0;
        }
        return false;
    }

    public int hashCode() {
        return (int) (re / 57875475 * 75842967 + im / 46563967 * 57493963);
    }

}
