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

/** 
With all Templates
public class StringTemplateDemo {

    // String Templates – Java 21 (Preview Feature)
    // Before Java 21
    public static void beforeJava21(String name, int marks1, int marks2) {
        int total = marks1 + marks2;
        String report = "Student: " + name + "\nTotal Marks: " + total +
                        "\nAverage: " + (total / 2.0);
        System.out.println(report);
    }

    // Java 21 (String Templates - Preview)
    public static void java21Version(String name, int marks1, int marks2) {
        int total = marks1 + marks2;

        // STR – Simple interpolation (evaluates expressions directly)
        String strReport = STR."""
                Student: \{name}
                Total Marks: \{total}
                Average: \{total / 2.0}
                """;

        // FMT – Formatted output (uses format specifiers)
        String fmtReport = FMT."""
                Student: %s
                Total Marks: %d
                Average: %.2f
                """.formatted(name, total, (total / 2.0));

        // RAW – Raw template (keeps placeholders unevaluated)
        String rawReport = RAW."""
                Student: \{name}
                Total Marks: \{total}
                Average: \{total / 2.0}
                """;

        System.out.println("STR Output:");
        System.out.println(strReport);
        System.out.println("FMT Output:");
        System.out.println(fmtReport);
        System.out.println("RAW Output:");
        System.out.println(rawReport);
    }

    public static void main(String[] args) {
        beforeJava21("Kavyadeveloper", 85, 90);
        System.out.println("-----");
        java21Version("Kavyadeveloper", 85, 90);
    }
}



Student: Kavyadeveloper
Total Marks: 175
Average: 87.5
-----
STR Output:
Student: Kavyadeveloper
Total Marks: 175
Average: 87.5
FMT Output:
Student: Kavyadeveloper
Total Marks: 175
Average: 87.50
RAW Output:
Student: \{name}
Total Marks: \{total}
Average: \{total / 2.0}










**/

