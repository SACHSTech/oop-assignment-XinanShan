package CompanySystem;
import CompanySystem.*;
// Creating inhertance class for the managers
public class Manager extends Staff {
  private int numOfPeopleUnder;
  private String project;
  /**
    * Constructor - creates a new Manager instance
    * @param fname - the Manager's first name
    * @param lname - the Manager's last name
    * @param sala - the Manager's salary
    * @param Whour - the Manager's work hours per day
    * @param titl - the Manager's title(position)
    * @param numberPeoUnder - the number of people under this manager
    * @param proj - the project the manager is working on
    * @author: Andy Shan
    */

  public Manager(String fName, String lName, int sala, int Whour, String titl, int numberPeoUnder, String proj){
    super(fName, lName, sala, Whour, titl);
    numOfPeopleUnder = numberPeoUnder;
    project = proj;
  } 

  /**
  * Getter method for the number of people under this manager
  * @return the number of people under this manager
  */
  public int getNumOfPeopleUnder(){
    return numOfPeopleUnder;
  }

  /**
  * Getter method for the project the manager is working on
  * @return the project the manager is working on
  */
  public String getProject(){
    return project;
  }
  
  /**
  * String representation for a manager
  * @return all the information of a manager
  */
  public String toString(){
    System.out.println("##################################");
    System.out.println("Position: " + getTitle());
    System.out.println("Name: " + getFirstName() + " "+getLastName());
    System.out.println("Salary: $" + getSalary());
    System.out.println("Work Hours Each Day: " + getWorkHours());
    System.out.println(+ getNumOfPeopleUnder() + "people under this manager");
    System.out.println("The current project: " + getProject());
    return "--------------------------------------";
  }
}