package arraylists;


import java.util.Scanner;
import linkedlists.Employee;

public class Main {

  public static void main(String[] args) {
   /* Person p1 = new Person("John", "Doe", 23, 5000.0);
    p1.setFirstName("");
    p1.setLastName("Doe");
   // p1.printFullName();
    p1.age = 23;
   // System.out.println(p1.age);

    Employee e1 = new Employee("Karol", "Fischer", 32, 3500);
    e1.setFirstName("Karol");
    e1.setLastName("Fischer");
  //  e1.printFullName();


   // Person.TYPE = "new thing"; // final variables cannot be assigned new values
  // System.out.println(Person.TYPE );

    p1.salary = 5600;

   Person x =  Person.makePerson("Melanie", "Limberg");

   // Person.printFullName(); // instance method

  // x.printFullName();

   Person y = new Person();
   y.setFirstName("Julia");
   y.setLastName("Stern");
   y.printFullName();*/


    // Arrays vs ArrayLists

    int n = 10;
    int index = 0;
    int[] numbers = new int[n];
    int num;
    Scanner input = new Scanner(System.in);

    // out of bounds Exception is expected : Arrays are fixed in size
    do{
      System.out.println("Please enter the number to be added, and -1 to exit: ");
      num = input.nextInt();
      numbers[index] = num;
      index++;
    }while(num != -1);

    for (int number : numbers) {
      System.out.println(number);
    }

    input.close();


  }
}
