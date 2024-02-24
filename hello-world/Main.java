import java.util.Arrays;

public class Main {

    // ------- M E T H O D S ---------------- 
    static void whatTheHell() {
      System.out.println("What the hell is going on?!");
     }

    // Method with params and returns.
    static String methodWithParams(String fName, String lName){
        String sausage = fName + " " + lName;
        return sausage;
//        return fName + " " + lName;
    }
    
    static int methodWithParams(int age){
        return age;
    }

    // ---------------- M A I N -------------
    public static void main (String[] args){
      String messg = "6 x 10 equals: ";
      int numSix = 6, numTen = 10;

      // When mixing data types in output, use parentheses.
      System.out.println(messg + (numSix * numTen));

      // ---------- S P L I T T I N G  A  S T R I N G ----------------
      // String[] stringArray = messg.split(" ", 2);
      String[] stringArray = messg.split(" ", 4);

     System.out.println(Arrays.toString(stringArray));
     // The string array is passed into a for loop.
     for(String element : stringArray) {
         System.out.println(element);
     }

     //------------ M A T H S -------------------------
     System.out.println("Maths Method:");
     int maxNumber = Math.max(23,566);
     System.out.println("Max number: " + maxNumber + "\n");

     //---------- A R R A Y S ---------------
System.out.println("Example multi-dimensional array");
     String[][] anime = {{"Space", "Fantasy", "Dysopian"}, {"Final Fantasy", "Ghost in the Shell", "Gundam Seed"}};
     System.out.print(anime[0][2] + " - ");
     System.out.println(anime[1][1] + "\n");

     System.out.println("Example iterated multi-dimensional arrag (for each)");
     for(String[] category : anime) {
         for(String show : category) {
             System.out.print(show + " ");
         }
         System.out.println();
     }
         System.out.println("\n");

     System.out.println("Example iterated multi-dimensional arrag (with indexes)"); 
     for(byte i = 0; i < anime.length; i++) {
        for(byte j = 0; j < anime[i].length; j++){                                      
            System.out.print("> " + anime[i][j] + "\n");
        }
        System.out.println();
     }
        System.out.println("\n");

        
     // ------- M E T H O D S ----------
     // Methods are functions. 
     System.out.println("This is a method called from above:");
     whatTheHell();
     System.out.println(" ");
    
     // Method called with params.
     System.out.println("Method with params.");
     System.out.print(methodWithParams("Leebut", "Baggins"));
     System.out.println(" is " + methodWithParams(52) + ".");
   
     // ------- End of Main ----------
    }
}
