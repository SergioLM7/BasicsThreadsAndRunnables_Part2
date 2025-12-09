package sleep;

public class Main {
    public static void main(String[] args) {
        //METODO SLEEP
        MiHilo miHilo = new MiHilo();
        Thread hilo = new Thread(miHilo);

        hilo.start();
        System.out.println("Hilo Main sigue ejecutándose.");
    }
}
