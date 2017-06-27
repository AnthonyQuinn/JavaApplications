
public class Person {
private String name;
private int age;
private boolean status;

public Person (String myName,int myAge,boolean myStatus)
{ name = myName;
age = myAge;
myStatus = true;
}
void changeName(String newName){
	name = newName;
}
void changeAge(int newAge)
{
    age = newAge;	
}
void printStates() {
    System.out.println("Name:" +
        name + " age:" + 
        age + " status:" + status);
}
}

