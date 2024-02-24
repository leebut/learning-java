# Methods

Methods are just another term for functions. Methods are declared with the data type that they return. A method can only return one data type (see)
Method params have to be type-cased:

> `static myMethod void(String param1, Int param2){}`
> `void` = no value returned.

To return a value, replace `void` with the data type that is returned:

 ```java
static String myMethod(params){
return output of logic;
}
```

### Static and public methods

`static` methods are called without an existing object.
`public` methods have to be called from an existing object.


**Note:** A method can only handle one data type to return, so the method must be _overloaded_ if mixed data is to be returned. Overloading is declaring two or more of the same method, each accepting params for each different data type.

```java
public class Classes {                                                  
    int x = 5;

    // Static method
    static void staticMethod(){
        System.out.println("This is the static method, no object.");
    }

    // Public method.
    public void publicMethod() {
    System.out.println("This is a public method. Call with an object.");
    }

    public static void main(String[] args){
        Classes myObj = new Classes();
        System.out.println(myObj.x);

        // Mutating an object attribute
        Classes myObj2 = new Classes();
        myObj2.x = 52;
        System.out.println("Mutated object attribute (was 5).");
        System.out.println(myObj2.x);

    // Call the static method.
    staticMethod();

    // Call the public method.
    Classes myPubObj = new Classes();
    myPubObj.publicMethod();
    }
}
```

[[class-methods]]


