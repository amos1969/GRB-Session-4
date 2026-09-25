package salary;

public class Main {
    static void main() {
        Person person1 = new Person(
                "Person1",
                20000,
                1000,
                3.0
        );
        System.out.println(person1.getTotalSalary());

        Person person2 = new Person(
                "Person2",
                25000,
                300,
                2.0
        );
        System.out.println(person2.getTotalSalary());
    }
}
