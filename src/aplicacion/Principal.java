package aplicacion;
import dominio.ej9;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();
        System.out.println(ej9.suma(n));
        System.out.println(ej9.fac(n));
        int[] lista = { 1, 2, 3, 4, 5 };
        System.out.println(ej9.media(lista, lista.length - 1));
        System.out.println(ej9.sumapares(n));

    }
}
