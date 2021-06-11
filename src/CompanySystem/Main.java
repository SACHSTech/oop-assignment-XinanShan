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
    //Initialize and create all the objects 
    Manager wendy = new Manager("Wendy", "Smith", 14000, 7, "Manager", 2, "Coldheart");
    Manager rick = new Manager("Rick", "Sanchez", 13000, 6, "Manager", 3, "Sweet Business");
    Programmer tammmy = new Programmer("Tammy", "Guetermann", 9000, 7, "Programmer", "C++", 518761757, 7);
    Programmer toby = new Programmer("Toby", "Matthews", 10000, 8, "Programmer", "Python", 518547123, 10);
    Programmer alex = new Programmer("Alex", "Hirsch", 11000, 8, "Programmer", "Python", 518638422, 12);
    Programmer sarah = new Programmer("Sarah", "Chalke", 8000, 7, "Programmer", "Java", 518622487, 6);
    Programmer zeep = new Programmer("Zeep", "Xanflorp", 7600, 6, "Programmer", "Python", 518147963, 5);
    Security chris = new Security("Chris", "Parnell", 7600, 6, "Security Guard", "Blue", 4, true);
    Security dan = new Security("Dan", "Harmon", 8000, 7, "Security Guard", "White", 3, false);
    Security cassie = new Security("Cassie", "Steele", 7600, 6, "Security Guard", "Blue", 4, true);
    Company theFort = new Company(); 
    
    //Adding all the objects in the list
    theFort.addManager(wendy);
    theFort.addManager(rick);
    theFort.addProgrammers(tammmy);
    theFort.addProgrammers(toby);
    theFort.addProgrammers(alex);
    theFort.addProgrammers(sarah);
    theFort.addProgrammers(zeep);
    theFort.addSecurity(chris);
    theFort.addSecurity(dan);
    theFort.addSecurity(cassie); 
    
   // Print the information of the staff at the position the user enetered
    System.out.println(" ");
    System.out.println("Welcome to the Fort System");
    System.out.println("People in the company: ");
    System.out.println(theFort.getManagerSize() + " Managers ");
    System.out.println(theFort.getProgrammerSize() + " Programmers ");
    System.out.println(theFort.getSecuritySize() + " Security Guards");
    System.out.println("Please enter the number for the position of the staff you want to see");
    
    // Showing the number of people at each position and ask the user for the input
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    while (true){
      System.out.println("1. Manager");
      System.out.println("2. Programmer");
      System.out.println("3. Security Guard");
      System.out.println("Enter any other key to exit");
      String choice = "";
      choice = keyboard.readLine();
      if (choice.equals("1")){
        theFort.printManagerList();
      } else if (choice.equals("2")){
        theFort.printProgrammerList();
      } else if (choice.equals(3)){
        theFort.printSecurityList();
      } else{
        System.out.println("Thank you for using the Fort System!");
        break;
      }
    }
  }
}