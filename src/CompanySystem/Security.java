 package CompanySystem;
import CompanySystem.*;

public class Security extends Staff {
  private String uniformColour;
  private int workoutDaysPerWeek;
  private boolean carryGun;
  private String gun = ""; 
  private static int totalSecurity = 0;
  // Constructor for security guards 
  public Security(String fName, String lName, int sala, int Whour, String titl, String UniCol, int WorOutDay, boolean CarGun){
    super(fName, lName, sala, Whour, titl);
    uniformColour = UniCol;
    workoutDaysPerWeek = WorOutDay;
    carryGun = CarGun;
    totalSecurity++;
  }
  // Getter method for security guards
  public String getUniformColour(){
    return uniformColour;
  }
  public int getWorkoutDaysPerWeek(){
    return workoutDaysPerWeek;
  }
  public boolean getCarryGun(){
    return carryGun;
  }
  public String getGun(){
    if (carryGun = true){
      gun = "Yes";
    }else {
      gun = "No";
    }
    return gun;
  }
  public static int getTotalSecurity(){
    return totalSecurity;
  }
  //This methods is how the object is going to show
  public String toString(){
    System.out.println("--------------------------------------");
    System.out.println("Position: " + getTitle());
    System.out.println("Name: " + getFirstName() + " "+getLastName());
    System.out.println("Salary: $" + getSalary());
    System.out.println("Work Hours Each Day: " + getWorkHours());
    System.out.println("Uniform Colour: " + getUniformColour());
    System.out.println("Days of exercise each week: " + getWorkoutDaysPerWeek() + "day(s)");
    System.out.println("Is he/she armed with a gun: " + getGun());
    return "--------------------------------------";
  }
}
