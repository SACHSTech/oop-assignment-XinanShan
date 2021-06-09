package CompanySystem;
import CompanySystem.*;

public class Security extends Staff {
  private String uniformColour;
  private int workoutDaysPerWeek;
  private Boolean carryGun;

  public Security(String fName, String lName, int sala, int Whour, String titl, String UniCol, int WorOutDay, boolean CarGun){
    super(fName, lName, sala, Whour, titl);
    uniformColour = UniCol;
    workoutDaysPerWeek = WorOutDay;
    carryGun = CarGun;
  }
  
}
