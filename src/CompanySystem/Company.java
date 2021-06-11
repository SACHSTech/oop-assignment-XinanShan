package CompanySystem;
import java.io.*;
import CompanySystem.*;
import java.util.ArrayList;
// Creates a class, Company, to show the hierarchy of staff at a company.
public class Company {

  private ArrayList<Manager> managers;
  private ArrayList<Programmer> programmers;
  private ArrayList<Security> securities;
  /**
    * Constructor - creates a new company instance
    * @author: Andy Shan
    */
    
  public Company(){
    // initialize all the lists for the objects
    managers = new ArrayList<Manager>();
    programmers = new ArrayList<Programmer>();
    securities = new ArrayList<Security>();
  }

  /**
  * This method addes managers to the list 
  * @return void
  */
  public void addManager(Manager newManager){
    managers.add(newManager);
  }

  /**
  * This method addes programmers to the list 
  * @return void
  */
  public void addProgrammers(Programmer newProgrammer){
    programmers.add(newProgrammer);
  }

  /**
  * This method addes securities to the list 
  * @return void
  */
  public void addSecurity (Security newSecurity){
    securities.add(newSecurity);
  }

  /**
  * Getter method for the size of the managers in list
  * @return the number of managers in the list
  */
  public int getManagerSize(){
    return managers.size();
  }

  /**
  * Getter method for the size of the programmers in the list
  * @return the number of programmers in the list
  */
  public int getProgrammerSize(){
    return programmers.size();
  }

  /**
  * Getter method for the size of the securities in the list
  * @return the number of securities in the list
  */
  public int getSecuritySize(){
    return securities.size();
  }

  /**
  * Getter method prints out all the managers
  * @return void
  */
  public void printManagerList(){
    for(int i = 0; i < getManagerSize(); i++){
      System.out.println(managers.get(i));
    }
  }

  /**
  * Getter method prints out all the programmers
  * @return void
  */
  public void printProgrammerList(){
    for(int i = 0; i < getProgrammerSize(); i++){
      System.out.println(programmers.get(i));
    }
  }

  /**
  * Getter method prints out all the sucurites
  * @return void
  */
  public void printSecurityList(){
    for(int i = 0; i < getSecuritySize(); i++){
      System.out.println(securities.get(i));
    }
  }
}
