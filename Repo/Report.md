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
# Variables and Types
Although Java is object oriented, not all types are objects. It is built on top of basic variable types called primitives.Here is a list of all primitives in Java:
- **byte** (number, 1 byte)
- **short** (number, 2 bytes)
- **int** (number, 4 bytes)
- **long** (number, 8 bytes)
- **float** (float number, 4 bytes)
- **double** (float number, 8 bytes)
- **char** (a character, 2 bytes)
- **boolean** (true or false, 1 byte)

Java is a strong typed language, which means variables need to be defined before we use them.

# Conditionals
Java uses boolean variables to evaluate conditions. The boolean values *true* and *false* are returned when an expression is compared or evaluated. For example:
```java
int a = 1;

if (a == 1) {
    System.out.println("a is 1");
}
```
## Boolean operators
There aren't that many operators to use in conditional statements and most of them are pretty straight forward:
```java
int a = 4;
int b = 5;
boolean result;
result = a < b; // true
result = a > b; // false
result = a <= 4; // a smaller or equal to 4 - true
result = b >= 6; // b bigger or equal to 6 - false
result = a == b; // a equal to b - false
result = a != b; // a is not equal to b - true
result = a > b || a < b; // Logical or - true
result = 3 < a && a < 6; // Logical and - true
result = !result; // Logical not - false
```
## if - else and between
The if, else statement in Java is pretty straight forward as well.
```java
if (a == b)
    System.out.println("Yesh");
else
    System.out.println("Nope");
```
## == and equals

The operator == works a bit different on objects than on primitives. When we are using objects and want to check if they are equal, the operator == will say if they are the same, if you want to check if they are logically equal, you should use the equals method on the object. For example:
```java
String a = new String("Pikachu");
String b = new String("Pikachu");
String sameA = a;

boolean r1 = a == b;      // This is false, since a and b are not the same object
boolean r2 = a.equals(b); // This is true, since a and b are logically equals
boolean r3 = a == sameA;  // This is true, since a and sameA are really the same object
```
## Arrays
Arrays in Java are also objects. They need to be declared and then created. In order to declare a variable that will hold an array of integers, we use the following syntax:

```java
arr = new int[10];
```
This will create a new array with the size of 10. We can check the size by printing the array's length:

```java
System.out.println(arr.length);
```
We can also access the elements of the array by using the index. For example:
```java
arr[0] = 4;
arr[1] = arr[0] + 5;
```
Java arrays are 0 based, which means the first element in an array is accessed at index 0 (e.g: arr[0], which accesses the first element). Also, as an example, an array of size 5 will only go up to index 4 due to it being 0 based.
```
int[] arr = new int[5];
//accesses and sets the first element
arr[0] = 4;
```
We can also create an array with values in the same line:

```jave
int[] arr = {1, 2, 3, 4, 5};
```
# Loops
There are two types of loops in Java: *for* and *while* .
## For
The for loop has three sections:

```java
for (int i = 0; i < 3; i++) {}
```