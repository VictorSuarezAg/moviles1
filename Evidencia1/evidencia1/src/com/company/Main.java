package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        Scanner tipData = new Scanner(System.in);

        int dish, dishValue = 0, amountPeople, contH = 0, contP = 0, contS = 0, contCH = 0, total = 0, aumTip = 0, desc1 = 0, desc2 = 0;
        int descTotal = 0;
        String tip = "";


        System.out.println("¿Cuantas personas son?");
        amountPeople = inputData.nextInt();

        for (int i = 0; i < amountPeople; i++) {
            System.out.println("¿Que plato desea?\n" +
                    "1. Hamburguesa\n" +
                    "2. Perros\n" +
                    "3. Salchipapas\n" +
                    "4. Chorizos");
            dish = inputData.nextInt();

            switch (dish) {
                case 1:
                    dishValue = 10000;
                    contH = contH + 1;
                    break;
                case 2:
                    dishValue = 8000;
                    contP = + contP + 1;
                    break;
                case 3:
                    dishValue = 6000;
                    contS = contS + 1;
                    break;
                case 4:
                    dishValue = 7000;
                    contCH = contCH + 1;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
            total = total + dishValue;
        }
        System.out.println("¿Desea incluir la propina?");
        tip = tipData.nextLine();

        if (tip.equals("si")) {
            aumTip = total * 10/100;
            total = total + aumTip;
        }

        if (total > 20000) {
            desc1 = total * 10/100;
            total = total - desc1;
        }

        if (contH >= 2 || contP >= 2 || contS >= 2 || contCH >= 2) {
            desc2 = total * 5/100;
            total = total - desc2;
        }

        descTotal = desc1 + desc2;
        System.out.println("El total a pagar es: $" + total + ", con un descuento de $" + descTotal);
    }
}
