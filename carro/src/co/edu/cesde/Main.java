package co.edu.cesde;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Carro mercedez = new Carro();

        mercedez.color = "Rojo";
        mercedez.placa = "ABC123";
        mercedez.marca = "Mercedez";
        mercedez.arrancar();

        Carro chevrolet = new Carro();
        chevrolet.color = "Gris";
        chevrolet.placa = "KHG268";
        chevrolet.marca = "Chevrolet";
        chevrolet.arrancar();
    }
}
