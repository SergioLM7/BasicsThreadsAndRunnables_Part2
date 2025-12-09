package ej3_tresHilosOrden;

public class MiHilo implements Runnable {
    private String mensaje;

    public MiHilo(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public void run() {
        System.out.println(mensaje);
    }
}
