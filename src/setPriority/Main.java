package setPriority;

public class Main {
    public static void main(String[] args) {
        //Creamos una tarea
        MiHilo mh = new MiHilo();

        //Creamos dos hilos diferentes que usan la misma tarea
        Thread hiloBajo = new Thread(mh, "HiloBajo");
        Thread hiloAlto =  new Thread(mh, "HiloAlto");

        //Establecemos las prioridades de cada uno
        hiloBajo.setPriority(Thread.MIN_PRIORITY);
        hiloAlto.setPriority(Thread.MAX_PRIORITY);

        //Arrancamos los hilos
        hiloBajo.start();
        hiloAlto.start();
    }
}
