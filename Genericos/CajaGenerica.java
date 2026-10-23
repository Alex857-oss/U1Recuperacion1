/*
 * Autor:  José Alejandro Olvera Lugo
 * Fecha de creación / última modificación: 22/10/2026
 * Descripción: Clase genérica que permite guardar y
 * mostrar diferentes tipos de datos en una caja.
 */


public class CajaGenerica<T> {

    // Esta propiedad guarda el dato que contiene la caja la T representa el tipo de dato que se elija al crearla.
    private T contenido;

    // El constructor recibe el dato inicial y lo guarda en la propiedad contenido
    public CajaGenerica(T contenido) {
        this.contenido = contenido;
    }

    public T obtenerContenido() {
        return contenido;
    }

    public void establecerContenido(T contenido) {
        this.contenido = contenido;
    }

    // Aqui comienza la ejecución del programa
    public static void main(String[] args) {

        // Creamos una caja que solamente manejara datos de tipo Integer y guardamos el número 25
        CajaGenerica<Integer> cajaNumero =
                new CajaGenerica<>(25);

        // Creamos otra caja para guardar una cadena de texto
        CajaGenerica<String> cajaTexto =
                new CajaGenerica<>("Hola");

        CajaGenerica<Double> cajaDecimal =
                new CajaGenerica<>(3.5);

        System.out.println("Contenido de la caja numerica: "
                + cajaNumero.obtenerContenido());

        System.out.println("Contenido de la caja de texto: "
                + cajaTexto.obtenerContenido());

        System.out.println("Contenido de la caja decimal: "
                + cajaDecimal.obtenerContenido());

        // Cambiamos el contenido de la caja numerica
        cajaNumero.establecerContenido(100);

        // Mostramos el nuevo contenido para comprobar el cambio
        System.out.println("Nuevo contenido de la caja numerica: "
                + cajaNumero.obtenerContenido());
    }
}