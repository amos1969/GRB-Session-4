import example.Example;
import example.ExampleTwo;

public class Main {
    static void main() {
        SimpleCalculator calc = new SimpleCalculator();

        int numberOne = 11;
        int numberTwo = 15;
        System.out.println("The answer is: " + calc.add(numberOne, numberTwo));

        System.out.println("The answer is: " + calc.takeAway(numberOne, numberTwo));

        System.out.println("The answer is: " + calc.multiply(numberOne, numberTwo));

        ExampleTwo exampleTwo = new ExampleTwo();
        System.out.println(exampleTwo.sayHi());

    }


}
