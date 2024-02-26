public class Main {
    public static void main(String[] args){
        Nesting myNest = new Nesting();
        Nesting.NestedClass myNested = myNest.new NestedClass();
        System.out.println(myNest.nestMessage + " " + myNested.nestedMessage);
    }
}
