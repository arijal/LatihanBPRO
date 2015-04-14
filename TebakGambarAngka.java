import java.util.*;
public class TebakGambarAngka{
  public static void main (String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("PROGRAM TEBAK GAMBAR ANGKA");
    System.out.print("Masukkan tebakan anda (1: gambar 0:Angka)=>");
    int tebakanUser= sc.nextInt();
    System.out.println("Anda menebak= "+ (tebakanUser==1?"GAMBAR":"ANGKA"));
    
    
    int pcOut = (int)(Math.random()+0.5);
    System.out.println("komputer menghasilkan "+(pcOut==1?"GAMBAR":"ANGKA"));
    if (tebakanUser==pcOut)
      System.out.println("kya kya");
      else
      System.out.println("ooooopps kuyuk");
  }
}
