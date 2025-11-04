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

/* Output

PS D:\Practise_Folder\Java21>  & 'C:\Program Files\Java\jdk-21\bin\java.exe' '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'C:\Users\user\AppData\Roaming\Code\User\workspaceStorage\260bc748cddf781c4872e43f205a55e8\redhat.java\jdt_ws\Java21_4ef8e867\bin' 'RecordPatternExample' 
Name: Kavi, Age: 25
Name: Kavi, Age: 25
PS D:\Practise_Folder\Java21> 

*/
