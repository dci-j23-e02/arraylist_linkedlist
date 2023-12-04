package extra;

import java.util.ArrayList;


public class ListOfBooks {

  private ArrayList<Book> booksList;
  private String category;
  private  String location;

  public ListOfBooks() {
    this.booksList = new ArrayList<>();
  }

  public ArrayList<Book> getBooksList() {
    return booksList;
  }

  public Book findBookByID(int i) { // 3
    // [ {"java", "adam", 1}, {"java", "adam", 2} , {"java", "adam",3} ]
    for (Book b:  this.booksList) {
      if (b.getId() == i){
        System.out.println("Book with id:" + i + "  is found !!");
        return b;
      }

    }

    System.out.println("Book with id:" + i + " couldn't be found !!");
    return null;
  }




  public void addBook(Book b) {
    this.booksList.add(b);
  }



  public void removeBookByID(int i) { // 3
    // [ {"java", "adam", 1}, {"java", "adam", 2} , {"java", "adam",3} ]
    int index = -1;
    for (Book b:  this.booksList) {
      if (b.getId() == i){
        index = this.booksList.indexOf(b);
      }

    }

    if(index < 0 ){
      System.out.println("Book with id:" + i + " couldn't be found !!");
    }else{
      this.booksList.remove(index);
      System.out.println("Book with id:" + i + " is removed !!");
    }



  }


  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  @Override
  public String toString() {
    return "ListOfBooks{" +
        "booksList=" + booksList +
        ", category='" + category + '\'' +
        ", location='" + location + '\'' +
        '}';
  }
}
