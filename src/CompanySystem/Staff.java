package CompanySystem;
import CompanySystem.*;

public class Staff {

  private String firstName;
  private String lastName;
  private int salary;
  private int workHours; 
  private String title;
  
  //Constructor for staff
  public Staff(String fName, String lName, int sala, int Whour, String titl){
    firstName = fName;
    lastName = lName;
    salary = sala;
    workHours = Whour;
    title = titl;
  }
  // Getter methods for staff
  public String getFirstName(){
    return firstName;
  }
  public String getLastName(){
    return lastName;
  }
  public int getSalary(){
    return salary;
  }
  public int getWorkHours(){
    return workHours;
  }
  public String getTitle(){
    return title;
  }
}