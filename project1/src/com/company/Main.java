package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner inputData = new Scanner(System.in);
        int number1, number2, result;
        System.out.println("Input number 1");
        number1 = inputData.nextInt();
        System.out.println("Input number 2");
        number2 = inputData.nextInt();
        result = number1 + number2;
        System.out.println("The result is:" + result);
    }
}
