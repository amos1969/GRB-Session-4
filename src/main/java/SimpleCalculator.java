public class SimpleCalculator {

    public String ownersName;

    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    private int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    protected int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int takeAway(int first, int second) {
        return subtract(first, second);
    }
}
