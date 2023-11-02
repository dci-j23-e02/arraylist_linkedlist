package arraylists;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

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
    /*
    // Arrays
    int n = 10;
    int index = 0;
    int[] numbers = new int[n];
    int[] backUp;
    int num;
    Scanner input = new Scanner(System.in);

    // out of bounds Exception is expected : Arrays are fixed in size
    do{
      System.out.println("Please enter the number to be added, and -1 to exit: ");
      num = input.nextInt();
      if(index < numbers.length -1 ){
        numbers[index] = num;
        index++;
      }else{
        backUp = new int[numbers.length + n];
        for (int i = 0; i < numbers.length; i++) {
          backUp[i] = numbers[i];
        }
        numbers = backUp;
        numbers[index] = num;
        index++;
      }


    }while(num != -1);

    for (int number : numbers) {
      System.out.println(number);
    }

    input.close(); */

    // ArrayLists
   ArrayList<String> animals = new ArrayList<>();
    // System.out.println(animals.size());
   animals.add("Lion");
  //  System.out.println(animals.size());
    animals.add("Tiger");
 //   System.out.println(animals.size());
    animals.add("Cat");
  //  System.out.println(animals.size());
    // animals.remove(2);
    animals.remove("Tiger");
  //  System.out.println(animals);
  //  System.out.println(animals.size());


    animals.add(1, "Dog");
   // System.out.println(animals);
   // System.out.println(animals.size());

    //
    Integer[] numbers = {1,2,3};
    List<Integer> myListOfNumbers = List.of(numbers);
    ArrayList<Integer> newNumbers = new ArrayList<>(myListOfNumbers);

    // ArrayList<Integer> newNumbers = new ArrayList<>(List.of(numbers));
   // System.out.println(newNumbers);



    ArrayList<Person> students = new ArrayList<>();
    Person std1 = new Person("Max", "Doe");
    Person std2 = new Person("John", "Doe");
    Person std3 = new Person("Yasmin", "Doe");

    students.add(std1);
    students.add(std2);
    students.add(std3);
/*
    for (Person x: students) {
      x.printFullName();
    }*/

    LinkedList<String> friends = new LinkedList<>();
    friends.add("John");
    friends.add("Chris");

    friends.add("David");
    friends.add("Chris");
    friends.add("David");

    friends.add("Chris");

    System.out.println(friends);
    System.out.println(friends.getFirst());
    System.out.println(friends.get(1));

    friends.removeFirst();
    System.out.println(friends);
    System.out.println(friends.indexOf("Safwan")); // -1 if not found
    System.out.println(friends.lastIndexOf("Chris")); // 4














  }
}
