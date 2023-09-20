package a;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        // Crear un objeto Random
        Random random = new Random();

        // Generar y mostrar 5 números aleatorios entre 0 y 100
        System.out.println("Números aleatorios entre 0 y 100:");

        for (int i = 0; i < 5; i++) {
            int numeroAleatorio = random.nextInt(102); // Genera números entre 0 (inclusive) y 102 (exclusivo)

            System.out.println(numeroAleatorio);
        }
    }
}

