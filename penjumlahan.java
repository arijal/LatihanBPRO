import java.util.*;
public class penjumlahan {
    public static void main(String [] args){
		int jumlah = 0;
		System.out.println("Program pertambahan 1+2+3+4+5+...+100 ");
		System.out.println("======================================");
		for (int i = 1; i <= 100; i++){
			jumlah += i; }

		System.out.println("Hasil Penjumlahannya adalah     : "+jumlah);
    }
}
