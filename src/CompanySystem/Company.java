package CompanySystem;
import java.io.*;
import CompanySystem.*;
import java.util.ArrayList;

public class Company {

  private ArrayList<Manager> managers;
  private ArrayList<Programmer> programmers;
  private ArrayList<Security> securities;

  public Company(){
    // initialize all the lists for the objects
    managers = new ArrayList<Manager>();
    programmers = new ArrayList<Programmers>();
    securities = new ArrayList<Security>();
  }
  // methods to add objects into the list
  public void addManager(Manager newManager){
    managers.add(newManager);
  }
  public void addProgrammers(Programmer newProgrammers){
    programmers.add(newProgrammers);
  }
  public void addSecurity (Security newSecurity){
    securities.add(newSecurity);
  }
  // Getter method for the size of the list
  public int getManagerSize(){
    return managers.size();
  }
  public int getProgrammerSize(){
    return programmers.size();
  }
  public int getSecuritySize(){
    return securities.size();
  }
  // print the list out with information
  public void printManagerList(){
    for(int i = 0; i < getManagerSize(); i++){
      System.out.println(managers.get(i));
    }
  }
  public void printProgrammerList(){
    for(int i = 0; i < getProgrammerSize(); i++){
      System.out.println(programmers.get(i));
    }
  }
  public void printSecurityList(){
    for(int i = 0; i < getSecuritySize(); i++){
      System.out.println(securities.get(i));
    }
  }
}
