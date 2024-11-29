package rev5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in );
        System.out.print("Introduzca un número: ");
                int ni = s.nextInt();
        //int c = ni;

        int afo = 0;
        int noAfo = 0;

        while (ni > 0) {
            int digito = ni % 10;
            if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
                afo++;
            } else {
                noAfo++;
            }
            ni /= 10;
        } if (afo > noAfo) {
            System.out.println("El " + afo + " es un número afortunado.");
        } else {
            System.out.println("El " + noAfo + " no es un número afortunado.");
        }
    }
}