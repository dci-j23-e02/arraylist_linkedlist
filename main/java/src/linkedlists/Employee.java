package linkedlists;

 import arraylists.Person;

import arraylists.Person;

public class Employee extends Person {

  public Employee(String firstName, String lastName, int age, double salary) {
    super(firstName, lastName, age, salary);
  }

  public static void main(String[] args) {
    // Person person = new Person();
   // person.salary = 6000; // not allowed
  Employee x = new Employee("Harris", "Rise", 12, 270);
  x.salary = 4000;
 }

public double getSalary(){
  return this.salary; // allowed because this is an instance of Employee
}

public void setSalary(double salary){
  this.salary = salary;  // allowed because this is an instance of Employee
}
}
