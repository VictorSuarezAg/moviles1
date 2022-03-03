package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner inputData = new Scanner(System.in);
        int num, resto, invertido = 0;
        System.out.println("Escriba el numero: ");
        num = inputData.nextInt();
        while (num > 0) {
            resto = num % 10;
            invertido = invertido * 10 - resto;
            num = num / 10;
        }
        invertido = Math.abs(invertido);
        System.out.println("El numero invertido es: " + invertido);
    }
}
