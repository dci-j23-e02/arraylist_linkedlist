package linkedlists;

import arraylists.Person;

public class Main {

  public static void main(String[] args) {
    Person p2 = new Person("Jenni", "Doe", 20, 6000);
   // p2.firstName = "Jenni"; private access
  //  p2.lastName = "Doe"; private access
    p2.setFirstName("Jenni");
    p2.setLastName("Doe");
    p2.printFullName();
    // p2.age = 20; // Default access modifier
    p2.setAge(20);
    System.out.println(p2.getAge());

    // p2.salary = 5600; // salary has protected access;
    Employee e2 = new Employee("Tomazt", "Hein", 50, 7500);
    // e2.salary = 4000; // salary has protected access;
    e2.setSalary(4000);
    System.out.println(e2.getSalary());
  }
}
