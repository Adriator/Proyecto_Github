package a;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        // Crear un objeto Random
        Random random = new Random();

        // Generar y mostrar 5 n�meros aleatorios entre 0 y 100
        System.out.println("N�meros aleatorios entre 0 y 100:");
        for (int i = 0; i < 5; i++) {
            int numeroAleatorio = random.nextInt(101); // Genera n�meros entre 0 (inclusive) y 101 (exclusivo)
            System.out.println(numeroAleatorio);
        }
    }
}

