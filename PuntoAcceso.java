public class PuntoAcceso {
    private String codigo;
    private String nombre;
    private String ubicacion;
    private int capacidadMaximaPorHora;
    private String estado;

    public PuntoAcceso(String codigo, String nombre, String ubicacion, int capacidad, String estado) {
        if (codigo == null || codigo.isEmpty()) {
            throw new IllegalArgumentException("El codigo no puede estar vacio.");
        }
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacio.");
        }
        if (ubicacion == null || ubicacion.isEmpty()) {
            throw new IllegalArgumentException("La ubicacion no puede estar vacia.");
        }
        if (capacidad <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser mayor que cero.");
        }
        if (estado == null || estado.isEmpty()) {
            throw new IllegalArgumentException("El estado no puede estar vacio.");
        }

        this.codigo = codigo;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.capacidadMaximaPorHora = capacidad;
        this.estado = estado;
    }

    public int getCapacidadMaximaPorHora() {
        return capacidadMaximaPorHora;
    }

    public void modificarDatos(int capacidad, String estado) {
        if (capacidad <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser mayor que cero.");
        }
        if (estado == null || estado.isEmpty()) {
            throw new IllegalArgumentException("El estado no puede estar vacio.");
        }

        this.capacidadMaximaPorHora = capacidad;
        this.estado = estado;
    }

    public String toString() {
        return "Codigo: " + codigo +
               "\nNombre: " + nombre +
               "\nUbicacion: " + ubicacion +
               "\nCapacidad por hora: " + capacidadMaximaPorHora +
               "\nEstado: " + estado;
    }
}
