package arraylists;



public class Main {

  public static void main(String[] args) {
    Person p1 = new Person();
    p1.setFirstName("");
    p1.setLastName("Doe");
    p1.printFullName();
    p1.age = 23;
    System.out.println(p1.age);

    Employee e1 = new Employee();
    e1.setFirstName("Karol");
    e1.setLastName("Fischer");
  //  e1.printFullName();
  }
}
