package CompanySystem;
import CompanySystem.*;

public class Manager extends Staff {
  private int numOfPeopleUnder;
  private String project;
  //Constructor for managers
  public Manager(String fName, String lName, int sala, int Whour, String titl, int numberPeoUnder, String proj){
    super(fName, lName, sala, Whour, titl);
    numOfPeopleUnder = numberPeoUnder;
    project = proj;
  } 
  //Getter method for managers
  public int getNumOfPeopleUnder(){
    return numOfPeopleUnder;
  }
  public String getProject(){
    return project;
  }
  //This methods is how the object is going to show
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