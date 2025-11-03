import java.util.*;

public class SequencedCollectionExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("KavyaDeveloper", "KavyaJavaTrainer", "KavyaKrish"));

        //  Before Java 21
        System.out.println("Before Java 21:");
        System.out.println("First: " + names.get(0));               // manually get first
        System.out.println("Last: " + names.get(names.size() - 1)); // manually get last
        names.add(0, "Hello");                                      // manually add first
        names.add("Java");                                          // manually add last
        System.out.println("Updated List: " + names);

        // Java 21 – Using Sequenced Collections
        System.out.println("\nJava 21 (SequencedCollection):");
        names.addFirst("JavaDeveloper");
        names.addLast("SpringBootDeveloper");
        System.out.println("First Element: " + names.getFirst());
        System.out.println("Last Element: " + names.getLast());
        System.out.println("Updated List: " + names);
        names.removeFirst();
        names.removeLast();
        System.out.println("Updated List: " + names);
    }
}
