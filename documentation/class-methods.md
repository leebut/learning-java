## Class Methods

### Static and public methods

`static` methods can be called without having to create an object. That means that they are independent.

`public` methods are connected to an object that must exist.

```java
public class Main {

    static void staticMethod() {
        System.out.println("This can be called wothout an object");
    }

    public void publicMethod() {
        System.out.println("Must be called in an object.");
    }

    // Main method
    public static void main(String[] args) {

    // Call the static method
    staticMethod();
    }

    // Call the public method.
    Main myObject = new Main(); // Create an object of the Main class.
    myObject.publicMethod(); // Call the public method.
}
```

