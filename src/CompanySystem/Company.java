package CompanySystem;
import java.io.*;
import CompanySystem.*;
import java.util.ArrayList;

public class Company {

  private ArrayList<Manager> manager;
  private ArrayList<Programmers> programmers;
  private ArrayList<Security> security;

  public Company(){
    manager = new ArrayList<Manager>();
    programmers = new ArrayList<Programmers>();
    security = new ArrayList<Security>();
  }
  
}
