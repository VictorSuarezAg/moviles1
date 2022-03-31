package co.edu.cesde;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        Scanner inputData2 = new Scanner(System.in);
        Scanner inputData3 = new Scanner(System.in);
        //int x;
        int cantNom;
        //String aux = "";
        String auxNom = "";
        System.out.println("Ingrese el tamaño del vector");
        cantNom = inputData3.nextInt();
        //System.out.println("Ingrese el tamaño del vector:");
        //x =  inputData.nextInt();
	    //double[] numbers = new double[x];
        String[] nombres = new String[cantNom];

        //System.out.println(numbers[3]);
        //numbers[2] = 5;
        //System.out.println(numbers[2]);
        for (int n = 0; n < nombres.length; n++) {
            System.out.println("Ingrese los nombres del vector:");
            nombres[n] = inputData3.next();

            auxNom = auxNom + ", " + nombres[n];
        }
        System.out.println(auxNom);

        /*for (int i = 0; i < numbers.length; i++) {
            System.out.println("Ingrese los valores del vector:");
            numbers[i] = inputData2.nextDouble();

            aux = aux + ", " + numbers[i];
        }
        System.out.print(aux);*/
    }
}
