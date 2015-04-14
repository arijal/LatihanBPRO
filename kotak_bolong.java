
import java.util.*;
public class kotak_bolong
 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print ("Banyaknya : ");
        int n = input.nextInt();
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++){
                if (i==0 || i==n-1 || j==0 || j==n-1)
                    System.out.print("#");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
