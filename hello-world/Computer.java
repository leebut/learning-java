public class Computer {
    String type;
    String cpu;
    double cpuSpeed;
    String memoryType;
    int memorySpeed;

    // Constructor class
    public Computer() {
	type = "Tower";
	cpu = "Ryzen 7";
	cpuSpeed = 2.7;
	memoryType = "DDR4";
	memorySpeed = 3600;
    }

    public static void main(String[] args) {
    	Computer myComputer = new Computer();
	System.out.println(myComputer.type);
    }

}
