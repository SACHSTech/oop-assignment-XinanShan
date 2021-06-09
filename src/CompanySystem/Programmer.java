package CompanySystem;
import CompanySystem.*;

public class Programmer extends Staff {
  private String programmingLanguage;
  private int programmerID;
  private int timeInCompany;

  public Programmer(String fName, String lName, int sala, int Whour, String titl, String programLan, int IDNum, int time){
    super(fName, lName, sala, Whour, titl);
    programmingLanguage = programLan;
    programmerID = IDNum;
    timeInCompany = time;
  }
  public String getProgrammingLanguage(){
    return programmingLanguage;
  }
  public String getProgrammerID(){
    return programmerID;
  }
  public String getTimeInCompany(){
    return timeInCompany;
  }

}