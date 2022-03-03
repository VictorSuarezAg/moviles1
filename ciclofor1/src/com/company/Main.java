package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner inputData = new Scanner(System.in);
        int num, cant = 0;
        System.out.println("Ingrese el numero: ");
        num = inputData.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println("" + i);
                cant = cant + 1;
            }
        }
        System.out.println("La cantidad de pares fue: " + cant);
    }
}
