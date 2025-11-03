
//Unnamed classes & instance main method
//No need for public class or static main  methods --beginner friendly 
//Preview feature in JDK21 & JDK 25 it became standard
void main(){
    System.out.println("Hello");
}


//VS code enable preview steps & code execution
// PS D:\Java21> javac Demo.java
// Demo.java:4: error: unnamed classes are a preview feature and are disabled by default.
// void main(){
// ^
//   (use --enable-preview to enable unnamed classes)
// 1 error
// PS D:\Java21> javac --enable-preview Demo.java
// error: --enable-preview must be used with either -source or --release
// PS D:\Java21> javac --enable-preview --release 21 Demo.java
// Note: Recompile with -Xlint:preview for details.
// PS D:\Java21> java Demo
// Error: LinkageError occurred while loading main class Demo
//         java.lang.UnsupportedClassVersionError: Preview features are not enabled for Demo (class file version 65.65535). Try running with '--enable-preview'
// PS D:\Java21> java --enable-preview Demo
// Hello











