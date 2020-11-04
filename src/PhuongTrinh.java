public class PhuongTrinh {

    private double numberA;
    private double numberB;

    public PhuongTrinh(double numberA, double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    public double getNumberA() {
        return this.numberA;
    }

    public void setNumberA(int numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return this.numberB;
    }

    public void setNumberB(int numberB) {
        this.numberB = numberB;
    }

    public int calculator(int numberA, int numberB) {
        int result = 0;

        isNumber(numberA, numberB);

        return result;
    }

    private boolean isNumber(int numberA, int numberB) {
        if (numberA != 0){

            return true;
        }
        return true;
    }
}
