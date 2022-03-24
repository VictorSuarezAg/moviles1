package co.edu.cesde;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Product monitorHp = new Product();

        monitorHp.setName("Monitor Hp FHD 1080p 24'");
        monitorHp.setPrice();
        monitorHp.setCode("SKU1020");

        Product cpuHp = new Product();

        cpuHp.setName("CPU Hp core i 5");
        cpuHp.setPrice();
        cpuHp.setCode("SKU1021");

        System.out.println("Nombre monitor: " + monitorHp.getName());
        System.out.println("Precio monitor: " + monitorHp.getPrice());
        System.out.println("Precio CPU: " + cpuHp.getPrice());
    }
}
