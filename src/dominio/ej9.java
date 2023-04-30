package dominio;

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
public class ej9 {
    public static int suma(int n) {
        try {
            if (n < 0) {
                throw new IOException("El número debe ser mayor que 0");
            } else if (n == 0) {
                return 0;
            } else {
                return n + suma(n - 1);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return 0;
        }
    }

    public static int fac(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número debe ser mayor o igual a 0");
        } else if (n == 0) {
            return 1;
        } else {
            return n * fac(n - 1);
        }
    }



    public static double media(int[] lista, int i) {
        try {
            if (i < 0) {
                throw new IOException("El indice debe ser mayor o igual que 0");
            } else if (i == 0) {
                return lista[i];
            } else {

                return lista[i] + media(lista, i - 1);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return 0;
        }

    }

    public static int sumapares(int n) {

        try {
            if (n < 0) {
                throw new Exception("El número debe ser mayor que 0");
            } else if (n == 1) {
                return n;
            } else if (n % 2 != 0) {
                return sumapares(n - 1);

            } else {
                return sumapares(n - 2) + n;
            }


        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return 0;
        }
    }

        public static ArrayList suma1 (int[]lista, ArrayList lista2, int n) {
           try {
                if (lista.length == 0) {
                    throw new Exception("No hay elementos en la lista");

                }else if (n == 0) {
                   if (lista[0] % 2 == 0) {
                       lista2.add(lista[n]);
                       return lista2;
                   } else
                       return lista2;
               } else {

                   if (lista[n] % 2 != 0)
                       return suma1(lista, lista2, n - 1);
                   else
                       lista2.add(lista[n]);
                   return suma1(lista, lista2, n - 1);
               }
           }catch (Exception e) {
               System.out.println("Error: " + e.getMessage());
                return null;
           }
        }


    }


