import java.util.*;
public class DoWhileDemo07{
  public static void main (String []param){
   Scanner sc=new Scanner (System.in);
   int angka = 0;
   int total = 0;
   do
   {
     System.out.print("Masukkan angka [999=exit]: ");
     angka = sc.nextInt();
     total +=angka;
   } while (angka!=999);
   System.out.println("TOTAL = " + total);
  }
}