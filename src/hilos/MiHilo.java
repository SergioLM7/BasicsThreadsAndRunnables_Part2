package hilos;

public class MiHilo extends Thread{

    //Devolvemos el nombre del hilo en cuestión
    @Override
    public void run() {
        System.out.println("El nombre de mi hilo: " + Thread.currentThread().getName());
    }
}
