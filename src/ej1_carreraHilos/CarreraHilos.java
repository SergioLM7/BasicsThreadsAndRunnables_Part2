package ej1_carreraHilos;

public class CarreraHilos implements Runnable {
    private int distancia = 0;
    private String nombreAnimal;

    public CarreraHilos(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    @Override
    public void run() {
        while (distancia < 100) {
            distancia += (int) (Math.random() * 5) + 1;
            System.out.println(nombreAnimal + " ha avanzado " + distancia);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Se ha interrumpido el hilo.");
            }
        }
        System.out.println(nombreAnimal + " ha llegado!!");
    }
}
