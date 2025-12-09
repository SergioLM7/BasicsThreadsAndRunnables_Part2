package ej3_tresHilosOrden;

public class Main {
    public static void main(String[] args) {
        MiHilo mh1 = new MiHilo("Hilo1");
        MiHilo mh2 = new MiHilo("Hilo2");
        MiHilo mh3 = new MiHilo("Hilo3");

        Thread h1 = new Thread(mh1);
        Thread h2 = new Thread(mh2);
        Thread h3 = new Thread(mh3);

        try {
            h1.start();
            h1.join();
            h2.start();
            h2.join();
            h3.start();
            h3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
