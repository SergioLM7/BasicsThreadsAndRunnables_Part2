package hilos;

public class Main {
    public static void main(String[] args) {
//        MiHilo hilo = new MiHilo();
//        hilo.start();

//        EjemploRunnable er = new EjemploRunnable();
//        Thread hilo = new Thread(er);
//        hilo.start();

        EjemploRunnable er = new EjemploRunnable();
        System.out.println("Llamando a run() directamente...");
        er.run();

        System.out.println("Llamando a start()...");
        Thread hilo = new Thread(er);
        hilo.start();
        System.out.println("Fin del main, hilo = " + Thread.currentThread().getName());
    }
}
