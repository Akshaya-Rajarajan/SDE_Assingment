
public class Dog {
String dogName;
int age;

public Dog(String name) {
	dogName = name;
}
public void setName(String name) {
	dogName = name;
}
public static void foo (Dog somedog) {
	somedog.setName("Max");
	System.out.println("The dog name is:" + somedog.dogName);
	}
public static void main(String[] args) {
	Dog myDog = new Dog("Rover");
	foo(myDog);
	
}
}

