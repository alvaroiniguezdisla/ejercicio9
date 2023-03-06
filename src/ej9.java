import java.io.IOException;
import java.util.Scanner;

public class ej9 {
    public static int suma(int n) {
        try{
            if (n < 0) {
                throw new IOException("El número debe ser mayor que 0");
            } else if (n == 0) {
                return 0;
            } else {
                return n + suma(n - 1);
            }
        }catch ( Exception e ){
            System.out.println("Error: " + e);
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();
        System.out.println(suma(n));
    }

}
