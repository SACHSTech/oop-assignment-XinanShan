package CompanySystem;
import java.io.*;
import CompanySystem.*;
import java.util.ArrayList;

public class Company {

  private ArrayList<Manager> managers;
  private ArrayList<Programmer> programmers;
  private ArrayList<Security> securities;

  public Company(){
    managers = new ArrayList<Manager>();
    programmers = new ArrayList<Programmers>();
    securities = new ArrayList<Security>();
  }
  public void addManager(Manager newManager){
    managers.add(newManager);
  }
  public void addProgrammers(Programmer newProgrammers){
    programmers.add(newProgrammers);
  }
  public void addSecurity (Security newSecurity){
    securities.add(newSecurity);
  }
  
}
