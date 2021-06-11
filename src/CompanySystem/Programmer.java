package CompanySystem;
import CompanySystem.*;

public class Programmer extends Staff {
  private String programmingLanguage;
  private int programmerID;
  private int timeInCompany;
  private static int totalProgrammer = 0;
  // Constructor for programmers
  public Programmer(String fName, String lName, int sala, int Whour, String titl, String programLan, int IDNum, int time){
    super(fName, lName, sala, Whour, titl);
    programmingLanguage = programLan;
    programmerID = IDNum;
    timeInCompany = time;
    totalProgrammer++;
  }
  // Getter method for programmers
  public String getProgrammingLanguage(){
    return programmingLanguage;
  }
  public int getProgrammerID(){
    return programmerID;
  }
  public int getTimeInCompany(){
    return timeInCompany;
  }
  public static int getTotalProgrammer(){
    return totalProgrammer;
  }
  //This methods is how the object is going to show
  public String toString(){
    System.out.println("--------------------------------------");
    System.out.println("Position: " + getTitle());
    System.out.println("Name: " + getFirstName() + " "+getLastName());
    System.out.println("ProgrammerID: " + getProgrammerID());
    System.out.println("Salary: $" + getSalary());
    System.out.println("Work Hours Each Day: " + getWorkHours());
    System.out.println("Programming language using: " + getProgrammingLanguage());
    System.out.println("He/She has worked in the company for: " + getTimeInCompany() + "year(s)");
    return "--------------------------------------";
  }
}