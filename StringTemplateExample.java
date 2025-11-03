public class StringTemplateExample {

    //String Templates – Java 21 (Preview Feature)
    // Before Java 21
    public static void beforeJava21(String name, int marks1, int marks2) {
        int total = marks1 + marks2;
        String report = "Student: " + name + "\nTotal Marks: " + total +
                        "\nAverage: " + (total / 2.0);
        System.out.println(report);
    }

    // Java 21 
    public static void java21Version(String name, int marks1, int marks2) {
        int total = marks1 + marks2;
        String report = STR."""
                Student: \{name}
                Total Marks: \{total}
                Average: \{total / 2.0}
                """;
        System.out.println(report);
    }

    public static void main(String[] args) {
        beforeJava21("Kavi", 85, 90);
        System.out.println("-----");
        java21Version("Kavi", 85, 90);
    }
}
