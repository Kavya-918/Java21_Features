// A record (data class)
record Person(String name, int age) {}

public class RecordPatternExample {

    //RecordPatternExample
    //  Before Java 21
    static void beforeJava21(Object obj) {
        if (obj instanceof Person) {          // check
            Person p = (Person) obj;          // manual cast
            System.out.println("Name: " + p.name() + ", Age: " + p.age());
        }
    }

    // Java 21 – Using Record Pattern
    static void java21(Object obj) {
        if (obj instanceof Person(String name, int age)) { // directly unpack fields
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }

    public static void main(String[] args) {
        Person person = new Person("Krish", 25);

        beforeJava21(person);
        java21(person);
    }
}
