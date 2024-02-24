# Arrays

## Defining String arrays

Arrays are defined with the data type. Note the syntax.

 > `String[] anime = {"Gundam Seed", "Final Fantasy", "Ghost in the Shell"}`

> `int[] temps = "23, 32, 15, 28"}`

Arrays are accessed using bracket `[idx]` notation.

## Multidimensional arrays

multidimensional arrays are defined with `[][]`.

### Specifying the indexes to find

 ```java
String[][] anime = {{"Space", "Fantasy", "Dysopian"}, {"Final Fantasy", "Ghost in the Shell", "Gundam Seed"}};
System.out.print(anime[0][2] + " - ");
System.out.println(anime[1][1] + "\n");
```

### Looping multidimensional arrays (for each)

```java
System.out.println("Example iterated multi-dimensional arrag (for each)");
for(String[] category : anime) {
    for(String show : category) {
        System.out.print(show + " ");
    }
    System.out.println();
}
    System.out.println("\n");
    ```

### Looping multidimensional arrays (with indexes)

```java
System.out.println("Example iterated multi-dimensional arrag (with indexes)");
for(byte i = 0; i < anime.length; i++) {
   for(byte j = 0; j < anime[i].length; j++){
       System.out.print("> " + anime[i][j] + "\n");
   }
   System.out.println();
}
   System.out.println("\n");

```