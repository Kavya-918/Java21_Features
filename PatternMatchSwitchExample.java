public class PatternMatchSwitchExample {

    //  Before Java 21
    static void beforeJava21(Object obj) {
        if (obj instanceof String) {
            String s = (String) obj; // manual cast
            System.out.println("String value (length): " + s.length());
        } else if (obj instanceof Integer) {
            Integer i = (Integer) obj;
            System.out.println("Integer value (double): " + (i * 2));
        } else {
            System.out.println("Unknown type");
        }
    }

    //  Java 21 - Pattern Matching for Switch
    static void java21(Object obj) {
        switch (obj) {
            case String s -> System.out.println("String value (length): " + s.length());
            case Integer i -> System.out.println("Integer value (double): " + (i * 2));
            case null -> System.out.println("Null value provided");
            default -> System.out.println("Unknown type");
        }
    }

    public static void main(String[] args) {
        System.out.println("Before Java 21:");
        beforeJava21("Kavi");
        beforeJava21(21);

        System.out.println("\nJava 21:");
        java21("Chantuu Boy");
        java21(10);
        java21(null);
    }
}

/**Output
[Running] cd "d:\Practise_Folder\Java21\" && javac PatternMatchSwitchExample.java && java PatternMatchSwitchExample
Before Java 21:
String value (length): 4
Integer value (double): 42

Java 21:
String value (length): 11
Integer value (double): 20
Null value provided

[Done] exited with code=0 in 1.05 seconds


**/


