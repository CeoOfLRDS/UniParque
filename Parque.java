import java.util.ArrayList;

public class Parque {
    private String nombre;
    private String codigoIdentificacion;
    private String nombreEncargado;
    private PuntoAcceso[] puntosAcceso;
    private ArrayList<Visitante> visitantes;

    public Parque(String nombre, String codigo, String encargado) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacio.");
        }
        if (codigo == null || codigo.isEmpty()) {
            throw new IllegalArgumentException("El codigo no puede estar vacio.");
        }
        if (encargado == null || encargado.isEmpty()) {
            throw new IllegalArgumentException("El encargado no puede estar vacio.");
        }

        this.nombre = nombre;
        this.codigoIdentificacion = codigo;
        this.nombreEncargado = encargado;
        this.puntosAcceso = new PuntoAcceso[5];
        this.visitantes = new ArrayList<Visitante>();
    }

    public boolean habilitarPuntoAcceso(int posicion, PuntoAcceso punto) {
        if (posicion < 0 || posicion >= 5) {
            return false;
        }
        if (puntosAcceso[posicion] != null) {
            return false;
        }
        puntosAcceso[posicion] = punto;
        return true;
    }

    public String consultarPuntosAcceso() {
        String resultado = "";

        for (int i = 0; i < puntosAcceso.length; i++) {
            if (puntosAcceso[i] != null) {
                resultado = resultado + "Posicion " + i + ":\n";
                resultado = resultado + puntosAcceso[i].toString() + "\n\n";
            }
        }

        if (resultado.isEmpty()) {
            return "No hay puntos de acceso habilitados.";
        }
        return resultado;
    }

    public PuntoAcceso consultarPuntoAcceso(int posicion) {
        if (posicion < 0 || posicion >= 5) {
            return null;
        }
        return puntosAcceso[posicion];
    }

    public boolean modificarPuntoAcceso(int posicion, int capacidad, String estado) {
        if (posicion < 0 || posicion >= 5) {
            return false;
        }
        if (puntosAcceso[posicion] == null) {
            return false;
        }

        puntosAcceso[posicion].modificarDatos(capacidad, estado);
        return true;
    }

    public boolean cerrarPuntoAcceso(int posicion) {
        if (posicion < 0 || posicion >= 5) {
            return false;
        }
        if (puntosAcceso[posicion] == null) {
            return false;
        }

        puntosAcceso[posicion] = null;
        return true;
    }

    public boolean registrarVisitante(Visitante visitante) {
        if (visitante == null) {
            return false;
        }
        if (buscarVisitante(visitante.getCodigoEntrada()) != null) {
            return false;
        }

        visitantes.add(visitante);
        return true;
    }

    public String consultarVisitantes() {
        if (visitantes.size() == 0) {
            return "No hay visitantes registrados.";
        }

        String resultado = "";
        for (int i = 0; i < visitantes.size(); i++) {
            resultado = resultado + "Visitante " + (i + 1) + ":\n";
            resultado = resultado + visitantes.get(i).toString() + "\n\n";
        }
        return resultado;
    }

    public Visitante buscarVisitante(String codigo) {
        for (int i = 0; i < visitantes.size(); i++) {
            if (visitantes.get(i).getCodigoEntrada().equals(codigo)) {
                return visitantes.get(i);
            }
        }
        return null;
    }

    public boolean modificarVisitante(String codigo, String nombre, int edad, int atracciones, int puntos) {
        Visitante visitante = buscarVisitante(codigo);

        if (visitante == null) {
            return false;
        }

        visitante.modificarDatos(nombre, edad, atracciones, puntos);
        return true;
    }

    public boolean eliminarVisitante(String codigo) {
        for (int i = 0; i < visitantes.size(); i++) {
            if (visitantes.get(i).getCodigoEntrada().equals(codigo)) {
                visitantes.remove(i);
                return true;
            }
        }
        return false;
    }

    public String generarReporte() {
        if (visitantes.size() == 0) {
            return "No hay visitantes registrados.";
        }

        int sumaEdades = 0;
        Visitante masAtracciones = visitantes.get(0);
        Visitante masPuntos = visitantes.get(0);

        for (int i = 0; i < visitantes.size(); i++) {
            Visitante visitante = visitantes.get(i);
            sumaEdades = sumaEdades + visitante.getEdad();

            if (visitante.getCantidadAtraccionesVisitadas() > masAtracciones.getCantidadAtraccionesVisitadas()) {
                masAtracciones = visitante;
            }

            if (visitante.getPuntosAcumulados() > masPuntos.getPuntosAcumulados()) {
                masPuntos = visitante;
            }
        }

        double promedio = (double) sumaEdades / visitantes.size();

        String reporte = "REPORTE DEL PARQUE\n";
        reporte = reporte + "Nombre: " + nombre + "\n";
        reporte = reporte + "Codigo: " + codigoIdentificacion + "\n";
        reporte = reporte + "Encargado: " + nombreEncargado + "\n";
        reporte = reporte + "Cantidad de visitantes: " + visitantes.size() + "\n";
        reporte = reporte + "Promedio de edad: " + promedio + "\n";
        reporte = reporte + "Visitante con mas atracciones:\n" + masAtracciones + "\n";
        reporte = reporte + "Visitante con mas puntos:\n" + masPuntos;

        return reporte;
    }
}
