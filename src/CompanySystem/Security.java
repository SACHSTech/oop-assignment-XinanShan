 package CompanySystem;
import CompanySystem.*;

// Creating inhertance class for seucrity guards
public class Security extends Staff {
  private String uniformColour;
  private int workoutDaysPerWeek;
  private boolean carryGun;
  private String gun = ""; 
  /**
    * Constructor - creates a new Security Guard instance
    * @param fname - the Security Guard's first name
    * @param lname - the Security Guard's last name
    * @param sala - the Security Guard's salary
    * @param Whour - the Security Guard's work hours per day
    * @param titl - the Security Guard's title(position)
    * @param UniCol - the Security Guard's uniform colour
    * @param WorOutDay - the Security Guard's exercise days in a week
    * @param CarGun - Check if Security Guard carries a gun or not
    * @author: Andy Shan
    */

  public Security(String fName, String lName, int sala, int Whour, String titl, String UniCol, int WorOutDay, boolean CarGun){
    super(fName, lName, sala, Whour, titl);
    uniformColour = UniCol;
    workoutDaysPerWeek = WorOutDay;
    carryGun = CarGun;
  }

  /**
  * Getter method for Security Guard's uniform colour
  * @return Security Guard's uniform colour
  */
  public String getUniformColour(){
    return uniformColour;
  }

  /**
  * Getter method for Security Guard's exercise days in a week
  * @return Security Guard's exercise days in a week
  */
  public int getWorkoutDaysPerWeek(){
    return workoutDaysPerWeek;
  }

  /**
  * Getter method to see if the security is carrying a gun or not
  * @return a boolean for carrying gun. 
  */
  public boolean getCarryGun(){
    return carryGun;
  }

  /**
  * Convert the boolean into string
  * @return a yes or no as in string
  */
  public String getGun(){
    if (carryGun = true){
      gun = "Yes";
    }else {
      gun = "No";
    }
    return gun;
  }
  
  /**
  * String representation for a Security Guard
  * @return all the information of a Security Guard
  */
  public String toString(){
    System.out.println("##################################");
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
