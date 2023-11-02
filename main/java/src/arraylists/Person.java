package arraylists;

public class Person {

  // Fields

 private String firstName;
 private String lastName;
 int age ; // Default access modifier
 protected double salary;
  // static means the entity belongs to the class
  // final attributes are constants ( cannot be assigned new values )
 public static final String TYPE = "Person";


 // Constructor

  public Person(String firstName, String lastName, int age, double salary) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.salary = salary;
  }


  //Static methods
  // static means the entity belongs to the class
  public static Person makePerson(String firstName, String lastName){
    Person p = new Person(firstName, lastName, 19, 5400) ;
   return p;
  }


  // Methods
  public void printFullName(){
    System.out.println(firstName +" "+ lastName);
  }



 // Getters and Setters

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    // apply your rules
    if(firstName.length() < 1 ) {
      this.firstName = "John";
    }else{
      this.firstName = firstName;

    }

  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
