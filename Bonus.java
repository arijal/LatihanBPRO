import java.io.*;

public class Bonus{
	public static void main(String[] argx) throws Exception{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int Barang =0;
		int Bonus =0;
		int Jumlah =0;
		int Harga =0;
		int totalBayar =0;
			System.out.println("====================");
			System.out.println("Toko Kita ");
			System.out.println("====================");
			System.out.print("Masukkan Jumlah barang yang dibeli = ");
			Barang = Integer.parseInt(br.readLine());
			System.out.print("Masukkan Harga barang yang dibeli  = Rp. ");
			Harga = Integer.parseInt(br.readLine());
				Bonus =Barang/2;
				Jumlah = Barang + Bonus;
				totalBayar = (Harga*Barang);
				System.out.println();
				System.out.println("====================");
				System.out.println("	Total	");
				System.out.println("====================");
				System.out.println("Barang yang dibeli = " + Barang);
				System.out.println("Jumlah Bonus = " + Bonus);
				System.out.println("Total Barang + Bonus = "+ Jumlah);
				System.out.println("Anda harus membayar  = Rp. "+ totalBayar);
		}
}
