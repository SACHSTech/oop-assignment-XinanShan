 package CompanySystem;
import CompanySystem.*;

public class Security extends Staff {
  private String uniformColour;
  private int workoutDaysPerWeek;
  private boolean carryGun;

  public Security(String fName, String lName, int sala, int Whour, String titl, String UniCol, int WorOutDay, boolean CarGun){
    super(fName, lName, sala, Whour, titl);
    uniformColour = UniCol;
    workoutDaysPerWeek = WorOutDay;
    carryGun = CarGun;
  }
  public String getUniformColour(){
    return uniformColour;
  }
  public int getWorkoutDaysPerWeek(){
    return workoutDaysPerWeek;
  }
  public boolean getCarryGun(){
    return carryGun;
  }
  
}
