# String Methods

There are many string methods. Here are a few examples. Using toLowercase() is useful as part of user input sanitising.

```java
String mySentence = "This is my lovely string."
System.out.println("String length: " + mySentence.length());
```

> - `mySentence.toUpperCase();` // THIS IS MY LOVELY SENTENCE.
> - `mySentence.toLowerCase();` // this is my lovely sentence.
> - `mySentence.indexOf("my");` // 9
> - `mySentence.split(" ");` // This method is used with `String[]` to create an array of the string, which is passed to a `for` loop:
> -  The length of the array is passed after the delimiter in the `split("delimeter", length)` method.

```java
String[] mySentenceArray = mySentnece.split(" ", 4);
for(String word : mySentenceArray)
   System.out.println(word);
```

### Printing the array structure
```java
import java.util.Arrays;

// String[] stringArray = messg.split(" ", 2);
String[] stringArray = messg.split(" ", 4);

System.out.println(Arrays.toString(stringArray)); // Prints the array structure
// The string array is passed into a for loop.
for(String element : stringArray) {
   System.out.println(element);
}```

