package extra;


import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    ListOfBooks myList  = new ListOfBooks();

    Book newAddedBook ;

    int option = 0;
    int id = 0;
    String title = null;
    String author = null;
    double price = 0;

    System.out.println("Hello , Welcome to library !!!");

    do{
      System.out.println("You have the below options: ");
      System.out.println("Press 1 to add book ");
      System.out.println("Press 2 to remove book ");
      System.out.println("Press 3 to find book by id ");
      System.out.println("Press 4 to exit ");
      option = input.nextInt();

      switch (option) {
        case 1:

          System.out.println("Please give the book details: \n Please enter the book title:");

          title = input.next();
          System.out.println("Please enter the book author:");
          author = input.next();
          System.out.println("Please enter the book price:");
          price = input.nextDouble();

          newAddedBook = new Book(title, author, price);
          myList.addBook(newAddedBook);
          System.out.println("Great !! you've added the book successfully , here is your list ");
          System.out.println( myList.getBooksList());
          break;
        case 2:
          System.out.println("Please give the book id:");
          id = input.nextInt();
          myList.removeBookByID(id);
          System.out.println(myList.getBooksList());
          break;
        case 3:
          System.out.println("Please give the book id:");
          id = input.nextInt();
          Book book = myList.findBookByID(id);
          System.out.println(book.toString());
          break;

      }

    }while(option !=4);

    System.out.println("Good bye !!!");


  }
}
