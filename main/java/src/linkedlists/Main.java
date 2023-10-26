package linkedlists;

import arraylists.Person;

public class Main {

  public static void main(String[] args) {
    Person p2 = new Person();
   // p2.firstName = "Jenni"; private access
  //  p2.lastName = "Doe"; private access
    p2.setFirstName("Jenni");
    p2.setLastName("Doe");
    p2.printFullName();
    // p2.age = 20; // Default access modifier
    p2.setAge(20);
    System.out.println(p2.getAge());
  }
}
