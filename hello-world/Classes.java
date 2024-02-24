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

