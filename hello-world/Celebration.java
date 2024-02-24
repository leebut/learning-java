public class Celebration {
    public static void main(String[] args) {
        Birthday myObj = new Birthday();
        myObj.setCake("Chocolate");
        myObj.setBalloons("Helium");
        myObj.setAge(53);
        System.out.println(myObj.getCake());
        System.out.println(myObj.getBalloons());
        System.out.println(myObj.getAge());
    }
}
