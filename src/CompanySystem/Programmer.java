package CompanySystem;
import CompanySystem.*;

public class Programmer extends Staff{
  private String programmingLanguage;
  private int programmerID;
  private int timeInCompany;

  public Programmer(String fName, String lName, int sala, int Whour, String titl, String programLan, int IDNum, int time){
    super(fName, lName, sala, Whour, titl);
    programmingLanguage = programLan;
    programmerID = IDNum;
    timeInCompany = time;
  }
  public String GetProgrammingLanguage(){
    return programmingLanguage;
  }
  public String GetProgrammerID(){
    return programmerID;
  }
  public String GetTimeInCompany(){
    return timeInCompany;
  }
  
}