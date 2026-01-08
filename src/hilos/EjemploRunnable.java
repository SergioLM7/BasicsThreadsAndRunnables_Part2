package hilos;

public class EjemploRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("El nombre de mi hilo: " + Thread.currentThread().getName());
    }
}
