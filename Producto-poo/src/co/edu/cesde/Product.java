package co.edu.cesde;
import java.util.Scanner;
public class Product {
    private double price;
    private String name;
    private String reference;
    private String kindOfMeasure;
    private double size;
    private String code;

    void setPrice () {
        Scanner inputData = new Scanner(System.in);
        System.out.println("Ingrese el precio");
        double price = inputData.nextDouble();

        if (price <= 10000000) {
            this.price = price;
        } else {
            System.out.println("No se puede un precio mayor a 10 millones");
        }
    }

    void setName (String name) {
        this.name = name;
    }

    void setReference (String reference) {
        this.reference = reference;
    }

    void setKindOfMeasure (String kindOfMeasure) {
        this.kindOfMeasure = kindOfMeasure;
    }

    void setSize (double size) {
        this.size = size;
    }

    void setCode (String code) {
        this.code = code;
    }

    double getPrice () {
        return this.price;
    }

    String getName () {
        return this.name;
    }

    String getReference () {
        return this.reference;
    }

    String getKindOfMeasure () {
        return this.kindOfMeasure;
    }

    double getSize () {
        return this.size;
    }

    String getCode () {
        return this.code;
    }
}
