public class Visitante {
    private String codigoEntrada;
    private String nombre;
    private int edad;
    private int cantidadAtraccionesVisitadas;
    private int puntosAcumulados;

    public Visitante(String codigo, String nombre, int edad, int atracciones, int puntos) {
        if (codigo == null || codigo.isEmpty()) {
            throw new IllegalArgumentException("El codigo no puede estar vacio.");
        }
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacio.");
        }
        if (edad <= 0) {
            throw new IllegalArgumentException("La edad debe ser mayor que cero.");
        }
        if (atracciones < 0) {
            throw new IllegalArgumentException("Las atracciones no pueden ser negativas.");
        }
        if (puntos < 0) {
            throw new IllegalArgumentException("Los puntos no pueden ser negativos.");
        }

        this.codigoEntrada = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.cantidadAtraccionesVisitadas = atracciones;
        this.puntosAcumulados = puntos;
    }

    public String getCodigoEntrada() {
        return codigoEntrada;
    }

    public int getEdad() {
        return edad;
    }

    public int getCantidadAtraccionesVisitadas() {
        return cantidadAtraccionesVisitadas;
    }

    public int getPuntosAcumulados() {
        return puntosAcumulados;
    }

    public void modificarDatos(String nombre, int edad, int atracciones, int puntos) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacio.");
        }
        if (edad <= 0) {
            throw new IllegalArgumentException("La edad debe ser mayor que cero.");
        }
        if (atracciones < 0) {
            throw new IllegalArgumentException("Las atracciones no pueden ser negativas.");
        }
        if (puntos < 0) {
            throw new IllegalArgumentException("Los puntos no pueden ser negativos.");
        }

        this.nombre = nombre;
        this.edad = edad;
        this.cantidadAtraccionesVisitadas = atracciones;
        this.puntosAcumulados = puntos;
    }

    public String toString() {
        return "Codigo: " + codigoEntrada +
               "\nNombre: " + nombre +
               "\nEdad: " + edad +
               "\nAtracciones visitadas: " + cantidadAtraccionesVisitadas +
               "\nPuntos acumulados: " + puntosAcumulados;
    }
}
