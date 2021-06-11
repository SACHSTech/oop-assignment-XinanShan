package CompanySystem;
import CompanySystem.*;
// Creates a super class for all other position to inherit.
public class Staff {

  private String firstName;
  private String lastName;
  private int salary;
  private int workHours; 
  private String title;
  
  /**
    * Constructor - creates a new Staff instance
    * @param fname - the Staff's first name
    * @param lname - the Staff's last name
    * @param sala - the Staff's salary
    * @param Whour - the Staff's work hours per day
    * @param titl - the Staff's title(position)
    * @author: Andy Shan
    */

  public Staff(String fName, String lName, int sala, int Whour, String titl){
    firstName = fName;
    lastName = lName;
    salary = sala;
    workHours = Whour;
    title = titl;
  }

  /**
  * Getter method for staff's first name
  * @return staff's first name
  */
  public String getFirstName(){
    return firstName;
  }

  /**
  * Getter method for staff's first name
  * @return staff's last name
  */
  public String getLastName(){
    return lastName;
  }

  /**
  * Getter method for staff's salary
  * @return staff's salary
  */
  public int getSalary(){
    return salary;
  }

  /**
  * Getter method for staff's work hours per day
  * @return staff's work hours per day
  */
  public int getWorkHours(){
    return workHours;
  }
  
  /**
  * Getter method for staff's title
  * @return staff's first title(position)
  */
  public String getTitle(){
    return title;
  }
}