package arraylists;

public class Person {
 private String firstName;
 private String lastName;

  public void printFullName(){
    System.out.println(firstName +" "+ lastName);

  }


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
}
