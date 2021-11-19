# Hello, World!

Java is an object oriented language (OOP). Java objects are part of so-called "Java classes".In Java, every line of code that can actually run needs to be inside a class. This line declares a class named Main, which is public, that means that any other class can access it.

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Konnichiwa~");
    }
}
```

When we declare a public class, we must declare it inside a file with the same name (Main.java), otherwise we'll get an error when compiling.
```java
public static void main(String[] args) {
```
- **public** again means that anyone can access it.
- **static** means that you can run this method without creating an instance of Main.
- **void** means that this method doesn't return any value.
- **main** is the name of the method.

The arguments we get inside the method are the arguments that we will get when running the program with parameters. It's an array of strings.
```java
System.out.println("Nihao~");
```
- **System** is a pre-defined class that Java provides us and it holds some useful methods and variables.
- **out** is a static variable within System that represents the output of the program (stdout).
- **println** is a method of out that can be used to print a line.