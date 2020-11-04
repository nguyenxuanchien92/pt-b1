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

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return this.numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public String calculator(double numberA, double numberB) {
        String result = "";

        boolean valA = isZero(numberA);
        boolean valB = isZero(numberB);

        if (valA) {
            if (valB) {
                result = String.format("result: %f", -numberB / numberA);
            } else {
                result = "Result : all value of X";
            }
        } else {
            if (valB) {
                result = "not value X";
            }else {
                result = "Result : all value of X";
            }
        }

        return result;
    }

    private boolean isZero(double number) {
        if (number != 0) {
            return true;
        }
        return false;
    }
}
