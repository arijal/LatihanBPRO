import java.util.*;

public class Login {
 public static void main (String[]args){
  Scanner sc = new Scanner (System.in);
  System.out.print("Masukkan nama depan dan nama belakang : ");
  String fName = sc.next();
  String lName = sc.next();
  
  String uName = fName.charAt(2)+lName.substring(2);
  System.out.println ("password = " +uName);
 }
}
