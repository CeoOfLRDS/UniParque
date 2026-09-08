import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private Parque parqueActual;
    private Scanner teclado;

    public Main() {
        parqueActual = null;
        teclado = new Scanner(System.in);
    }

    private void ejecutarOpcion(int opcion) {

        try {
            if (opcion == 1) {
                System.out.print("Nombre del parque: ");
                String nombre = teclado.nextLine();
                System.out.print("Codigo de identificacion: ");
                String codigo = teclado.nextLine();
                System.out.print("Nombre del encargado: ");
                String encargado = teclado.nextLine();
                parqueActual = new Parque(nombre, codigo, encargado);
                System.out.println("Parque creado.");
            } else if (parqueActual == null) {
                System.out.println("Primero debe inicializar el parque.");
            } else if (opcion == 2) {
                System.out.print("Posicion (0-4): ");
                int posicion = teclado.nextInt();
                teclado.nextLine();
                System.out.print("Codigo: ");
                String codigo = teclado.nextLine();
                System.out.print("Nombre: ");
                String nombre = teclado.nextLine();
                System.out.print("Ubicacion: ");
                String ubicacion = teclado.nextLine();
                System.out.print("Capacidad por hora: ");
                int capacidad = teclado.nextInt();
                teclado.nextLine();
                System.out.print("Estado: ");
                String estado = teclado.nextLine();

                PuntoAcceso punto = new PuntoAcceso(codigo, nombre, ubicacion, capacidad, estado);
                if (parqueActual.habilitarPuntoAcceso(posicion, punto)) {
                    System.out.println("Punto de acceso habilitado.");
                } else {
                    System.out.println("No se pudo habilitar.");
                }
            } else if (opcion == 3) {
                System.out.println(parqueActual.consultarPuntosAcceso());
            } else if (opcion == 4) {
                System.out.print("Posicion: ");
                int posicion = teclado.nextInt();
                teclado.nextLine();
                PuntoAcceso punto = parqueActual.consultarPuntoAcceso(posicion);
                if (punto == null) {
                    System.out.println("No existe un punto en esa posicion.");
                } else {
                    System.out.println(punto);
                }
            } else if (opcion == 5) {
                System.out.print("Posicion: ");
                int posicion = teclado.nextInt();
                System.out.print("Nueva capacidad: ");
                int capacidad = teclado.nextInt();
                teclado.nextLine();
                System.out.print("Nuevo estado: ");
                String estado = teclado.nextLine();
                if (parqueActual.modificarPuntoAcceso(posicion, capacidad, estado)) {
                    System.out.println("Punto modificado.");
                } else {
                    System.out.println("No se pudo modificar.");
                }
            } else if (opcion == 6) {
                System.out.print("Posicion: ");
                int posicion = teclado.nextInt();
                teclado.nextLine();
                if (parqueActual.cerrarPuntoAcceso(posicion)) {
                    System.out.println("Punto cerrado.");
                } else {
                    System.out.println("No se pudo cerrar.");
                }
            } else if (opcion == 7) {
                System.out.print("Codigo de entrada: ");
                String codigo = teclado.nextLine();
                System.out.print("Nombre: ");
                String nombre = teclado.nextLine();
                System.out.print("Edad: ");
                int edad = teclado.nextInt();
                System.out.print("Atracciones visitadas: ");
                int atracciones = teclado.nextInt();
                System.out.print("Puntos acumulados: ");
                int puntos = teclado.nextInt();
                teclado.nextLine();

                Visitante visitante = new Visitante(codigo, nombre, edad, atracciones, puntos);
                if (parqueActual.registrarVisitante(visitante)) {
                    System.out.println("Visitante registrado.");
                } else {
                    System.out.println("El codigo ya existe.");
                }
            } else if (opcion == 8) {
                System.out.println(parqueActual.consultarVisitantes());
            } else if (opcion == 9) {
                System.out.print("Codigo de entrada: ");
                String codigo = teclado.nextLine();
                Visitante visitante = parqueActual.buscarVisitante(codigo);
                if (visitante == null) {
                    System.out.println("Visitante no encontrado.");
                } else {
                    System.out.println(visitante);
                }
            } else if (opcion == 10) {
                System.out.print("Codigo de entrada: ");
                String codigo = teclado.nextLine();
                System.out.print("Nuevo nombre: ");
                String nombre = teclado.nextLine();
                System.out.print("Nueva edad: ");
                int edad = teclado.nextInt();
                System.out.print("Nuevas atracciones: ");
                int atracciones = teclado.nextInt();
                System.out.print("Nuevos puntos: ");
                int puntos = teclado.nextInt();
                teclado.nextLine();

                if (parqueActual.modificarVisitante(codigo, nombre, edad, atracciones, puntos)) {
                    System.out.println("Visitante modificado.");
                } else {
                    System.out.println("Visitante no encontrado.");
                }
            } else if (opcion == 11) {
                System.out.print("Codigo de entrada: ");
                String codigo = teclado.nextLine();
                if (parqueActual.eliminarVisitante(codigo)) {
                    System.out.println("Visitante eliminado.");
                } else {
                    System.out.println("Visitante no encontrado.");
                }
            } else if (opcion == 12) {
                System.out.println(parqueActual.generarReporte());
            } else if (opcion != 0) {
                System.out.println("Opcion no valida.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: debe ingresar un dato del tipo correcto.");
            teclado.nextLine();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Main programa = new Main();
        int opcion = -1;

        try {
            do {
                System.out.println("\n===== UNIPARK =====");
                System.out.println("1. Inicializar parque");
                System.out.println("2. Habilitar punto de acceso");
                System.out.println("3. Consultar puntos de acceso");
                System.out.println("4. Consultar punto de acceso");
                System.out.println("5. Modificar punto de acceso");
                System.out.println("6. Cerrar punto de acceso");
                System.out.println("7. Registrar visitante");
                System.out.println("8. Consultar visitantes");
                System.out.println("9. Buscar visitante");
                System.out.println("10. Modificar visitante");
                System.out.println("11. Eliminar visitante");
                System.out.println("12. Generar reporte");
                System.out.println("0. Salir");
                System.out.print("Seleccione una opcion: ");

                try {
                    opcion = programa.teclado.nextInt();
                    programa.teclado.nextLine();
                    programa.ejecutarOpcion(opcion);
                } catch (InputMismatchException e) {
                    System.out.println("Error: debe ingresar un numero.");
                    programa.teclado.nextLine();
                }
            } while (opcion != 0);
        } finally {
            programa.teclado.close();
            System.out.println("Scanner cerrado.");
        }
    }
}
