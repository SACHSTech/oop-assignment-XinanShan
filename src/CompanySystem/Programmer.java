package CompanySystem;
import CompanySystem.*;
// Creating inhertance class for the programmers
public class Programmer extends Staff {
  private String programmingLanguage;
  private int programmerID;
  private int timeInCompany;
  /**
   * Constructor - creates a new programmer instance
   * @param fname - the programmer's first name
   * @param lname - the programmer's last name
   * @param sala - the programmer's salary
   * @param Whour - the programmer's work hours per day
   * @param titl - the programmer's title(position)
   * @param programLan - the programming language
   * @param IDNum - the programmer's ID number
   * @param time - the programmer's time spent in the company 
   * @author: Andy Shan
   */

  public Programmer(String fName, String lName, int sala, int Whour, String titl, String programLan, int IDNum, int time){
    super(fName, lName, sala, Whour, titl);
    programmingLanguage = programLan;
    programmerID = IDNum;
    timeInCompany = time;
  }

  /**
  * Getter method for the programming language
  * @return the programming language
  */
  public String getProgrammingLanguage(){
    return programmingLanguage;
  }

  /**
  * Getter method for the programmer's ID number
  * @return the programmer's ID number
  */
  public int getProgrammerID(){
    return programmerID;
  }

  /**
  * Getter method for the programmer's time spent in the company 
  * @return the programmer's time spent in the company 
  */
  public int getTimeInCompany(){
    return timeInCompany;
  }
  
  /**
  * String representation for a programmer
  * @return all the information of a programmer
  */
  public String toString(){
    System.out.println("##################################");
    System.out.println("Position: " + getTitle());
    System.out.println("Name: " + getFirstName() + " "+getLastName());
    System.out.println("ProgrammerID: " + getProgrammerID());
    System.out.println("Salary: $" + getSalary());
    System.out.println("Work Hours Each Day: " + getWorkHours());
    System.out.println("Programming language using: " + getProgrammingLanguage());
    System.out.println("He/She has worked in the company for: " + getTimeInCompany() + " year(s)");
    return "--------------------------------------";
  }
}