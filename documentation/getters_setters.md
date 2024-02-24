# Getters and setters

Getters and setters are used with a `private` class to protect the variables so that they cannot be accessed directly.

Set the class with private instance variables.
Save it as the class name.

```java
public class Birthday {
	// Instance vars
	private String cake ;
	private String balloons;
	private int age;

	​ public String getParty(){
		return cake, balloons, age;
	}
	​ public void setParty(String newCake, String newBalloons)
		this.cake = newCake;
		this.balloons = newBalloons;
	}
	​ public void setParty(int newAge){
		this.age = newAge;
	}
}

public static void(String[] args) {
	Birthday myObj = new Birthday();
	myObj.cake = "Chocolate";
	myObj.balloons = "Helium";
	myObj.age = "53";
	System.out.println(myobj.cake);
	System.out.println(myobj.balloons);
	System.out.println(myobj.age);
}
```

Create a class to send the values to the setters and call from the getters.

```java
Birthday myObj = new Birthday();
	myObj.cake("Chocolate");
	myObj.balloons("Helium");
	myObj.age(53);
	System.out.println(myobj.cake());
	System.out.println(myobj.balloons());
	System.out.println(myObj.age());
	}
}
```

