package CompanySystem;
import CompanySystem.*;

public class Staff{

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
  public String GetFirstName(){
    return firstName;
  }
  public String GetLastName(){
    return lastName;
  }
  public int GetSalary(){
    return salary;
  }
  public int GetWorkHours(){
    return workHours;
  }
  public int GetTitle(){
    return title;
  }
}