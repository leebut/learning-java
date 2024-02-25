# Class Inheritance

A class can inherit the attributes of a parent class to create a new class.
A parent class is the **superclass**, while child classes are the **subclass**.

`protected` instance vars are available to a parent's subclass.
To prevent sub-classes, use the `final` keyword:
> `final class Films {...}`

## Inheritance Example

### Super-class

```java
public class Films {                           
    protected String filmGenre = "sci-fi";     
    protected String flimClassification = "PG";
    protected String price = "£6.50";          
}                                              
```

### Sub-class
```java
class NewFilm extends Films {  
    private String newFilmTitle = "The Thing Again";  
  
    public static void main(String[] args) {  
        NewFilm filmObj = new NewFilm();
        filmObj.price = "5.99";                                             
           
        System.out.println("Title: " + filmObj.newFilmTitle);               
        System.out.println("Genre: " + filmObj.filmGenre);                  
        System.out.println("Classification: " + filmObj.flimClassification);
        System.out.println("Price: " + filmObj.price);                      
        
    }                                                                       
}                                                                           
```
