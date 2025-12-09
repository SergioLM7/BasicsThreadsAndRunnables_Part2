package isAlive;

public class Main {
    public static void main(String[] args) {
        MiHiloIsAlive mh = new MiHiloIsAlive();
        Thread th =  new Thread(mh);

        System.out.println("Antes de start(), isAlive() = " + th.isAlive());
        th.start();
        System.out.println("Después de start(), isAlive() = " + th.isAlive());

        try {
            th.join();
        } catch (InterruptedException e) {
            System.out.println("Main: interrumpido");
        }

        System.out.println("Después de join(), isAlive() = " + th.isAlive());
    }
}
