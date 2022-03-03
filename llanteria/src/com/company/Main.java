package com.company;
import java.util.Scanner;
public class Main {
    /*
    * En una llantería se ha establecido una promoción de las
    * llantas marca “Ponchadas”, dicha promoción consiste en lo siguiente:
   Si se compran menos de cinco llantas el precio es de $30000 cada
*    una, de $25000 si se compran de cinco a 10 y de $20000 si se
*   compran más de 10.
   Obtener la cantidad de dinero que una persona
*   tiene que pagar por cada una de las llantas que compra y la que
*   tiene que pagar por el total de la compra.
     */
    public static void main(String[] args) {
        // write your code here
        Scanner inputData = new Scanner(System.in);
        int numWheels, total = 0, unitPrice = 0;
        System.out.println("Enter number of wheels");
        numWheels = inputData.nextInt();
        /*if(numWheels < 5){
            total = numWheels * 30000;
            System.out.println("Total: " + total + " unit price: " + 30000);
        }
        else{
            if(numWheels >=5 && numWheels <=10){
                total = numWheels * 25000;
                System.out.println("Total: " + total + " unit price: " + 25000);
            }
            else{
                total = numWheels * 20000;
                System.out.println("Total: " + total + " unit price: " + 20000);
            }
        }*/
        /*if(numWheels < 5){
            total = numWheels * 30000;
            unitPrice = 30000;
        }
        if(numWheels >=5 && numWheels <=10){
            total = numWheels * 25000;
            unitPrice = 25000;
        }
        if(numWheels > 10){
            total = numWheels * 20000;
            unitPrice = 20000;
        }
        System.out.println("total: " + total + " unit price" + unitPrice);*/
        /*if(numWheels < 5){
            total = numWheels * 30000;
            unitPrice = 30000;
        }
        else if(numWheels >=5 && numWheels <=10){
            total = numWheels * 25000;
            unitPrice = 25000;
        }
        else{
            total = numWheels * 20000;
            unitPrice = 20000;
        }*/
        if(numWheels < 5){
            total = numWheels * 30000;
            unitPrice = 30000;
        }
        else if(numWheels <=10){
            total = numWheels * 25000;
            unitPrice = 25000;
        }
        else{
            total = numWheels * 20000;
            unitPrice = 20000;
        }
    }
}
