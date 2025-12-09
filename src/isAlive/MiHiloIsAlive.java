package isAlive;

public class MiHiloIsAlive implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Hilo: empiezo");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Hilo: interrumpido");
        }
        System.out.println("Hilo: termino");
    }
}
