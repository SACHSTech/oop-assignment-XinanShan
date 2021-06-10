package CompanySystem;
import java.io.*;
import CompanySystem.*;
import java.util.ArrayList;

/**
* A program that allows the user to view the information of the staff for different position
* The program displays a list of information that changes as the user enter different positions
* @author: Andy Shan
*/
public class Main {
  public static void main(String[] args) throws IOException{
    Manager wendy = new Manager("Wendy", "Smith", 14000, 7, "Manager", 2, "Coldheart");
    Manager rick = new Manager("Rick", "Sanchez", 13000, 6, "Manager", 3, "Sweet Business")
    Programmer tammmy = new Programmer("Tammy", "Guetermann", 9000, 7, "Programmer", "C++", 518761757, 7);
    Programmer toby = new Programmer("Toby", "Matthews", 10000, 8, "Programmer", "Python", 518547123, 10);
    Programmer alex = new Programmer("Alex", "Hirsch", 11000, 8, "Programmer", "Python", 518638422, 12);
    Programmer sarah = new Programmer("Sarah", "Chalke", 8000, 7, "Programmer", "Java", 518622487, 6);
    Programmer zeep = new Programmer("Zeep", "Xanflorp", 7600, 6, "Programmer", "Python", 518147963, 5);
    Security chris = new Security("Chris", "Parnell", 7600, 6, "Security Guard", "Blue", 4, true);
    Security dan = new Security("Dan", "Harmon", 8000, 7, "Security Guard", "White", 3, false);
    Security cassie = new Security("Cassie", "Steele", 7600, 6, "Security Guard", "Blue", 4, true);
    
  }
}