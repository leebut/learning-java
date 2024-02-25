# Classes

Classes are fundamental to Java. Everything is coded inside a class.
The filename must match the class name, so a class of `Reptiles` must be saved as `Reptile.java`.

### Syntax
_access modifier_ class _className_ {}

```java
public class Servers {
// attributes go here

// Construcotrs and other classes go here.

public static void main(String[] args) {
// All files must have a main method.
// Other code goes here
}
}
```

## Public and default classes

Many classes are prefixed with `public`, which means that the class is accessible by all other classes.
`default` restricts access to classes in the same package.

A class receives attributes, which are essentially variables of the [[data_types]] we saw earlier. They can be thought of as placeholders for values.

When the attributes are established, the class can be instantiated with a constructor class that sets values to the attributes, which are then accessed by an object of the class. An example is at [[class-constructors]].

## Class methods

See [[class-methods]].

## Class constructors
See [[class-constructors]].

## Class security
See [[class_security]].

## Class inheritance
[[class_inheritance]]


