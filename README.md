//Nota: ni voy a fingir que formateé esto yo mismo, ambos sabemos que no.

Análisis

1. ¿Qué propiedades y métodos tendrá cada clase?

Clase PuntoAcceso

Representa uno de los puntos de acceso habilitados dentro del parque.

Propiedades

codigo: identifica el punto de acceso.

nombre: almacena su nombre.

ubicacion: indica dónde se encuentra.

capacidadMaximaPorHora: indica cuántas personas puede atender por hora.

estado: indica su condición actual.

Métodos

Constructor: crea el punto de acceso y valida la capacidad.

getCapacidadMaximaPorHora(): devuelve su capacidad.

modificarDatos(): modifica la capacidad y el estado.

toString(): devuelve toda su información.

Clase Visitante

Representa a una persona registrada durante la estadía al Parque Universitario de atracciones.

Propiedades

codigoEntrada: identifica de forma única al visitante.

nombre: almacena su nombre.

edad: almacena su edad.

cantidadAtraccionesVisitadas: lleva el conteo de atracciones.

puntosAcumulados: almacena sus puntos.

Métodos

Constructor: crea al visitante y valida sus datos.

getCodigoEntrada(): permite buscar al visitante.

getEdad(): se utiliza para calcular el promedio de edad.

getCantidadAtraccionesVisitadas(): se utiliza para encontrar al visitante con más atracciones.

getPuntosAcumulados(): se utiliza para encontrar al visitante con más puntos.

modificarDatos(): modifica su información.

toString(): devuelve toda su información.

Clase Parque

Representa el parque y administra sus puntos de acceso y visitantes.

Propiedades

nombre: nombre del parque.

codigoIdentificacion: código que identifica al parque.

nombreEncargado: nombre de la persona encargada.

puntosAcceso: arreglo básico de cinco objetos PuntoAcceso.

visitantes: colección dinámica de objetos Visitante.

Métodos

Constructor: crea el parque e inicializa el arreglo y el ArrayList.

habilitarPuntoAcceso(): coloca un punto de acceso en una posición disponible.

consultarPuntosAcceso(): devuelve los puntos habilitados.

consultarPuntoAcceso(): busca un punto mediante su posición.

modificarPuntoAcceso(): modifica la capacidad y estado de un punto.

cerrarPuntoAcceso(): coloca null en una posición.

registrarVisitante(): agrega un visitante si su código no está repetido.

consultarVisitantes(): devuelve todos los visitantes registrados.

buscarVisitante(): busca un visitante por su código creado.

modificarVisitante(): modifica un visitante encontrado cuando haya creado su código.

eliminarVisitante(): elimina un visitante del ArrayList solo si ya creo su código.

generarReporte(): realiza todos los cálculos solicitados, mostrando un ranking.

Clase Main

Se encargará de inicializar el Parque.

Propiedades

parqueActual: guarda el parque que está siendo administrado.

Métodos

ejecutarOpcion(): ejecuta la opción seleccionada.

2. ¿Qué tipo deben tener las propiedades y métodos de cada clase?

PuntoAcceso

Atributos

Visibilidad

Atributo

Tipo

private

codigo

String

private

nombre

String

private

ubicacion

String

private

capacidadMaximaPorHora

int

private

estado

String

Métodos

+ PuntoAcceso(codigo: String, nombre: String, ubicacion: String,
              capacidad: int, estado: String)

+ getCapacidadMaximaPorHora(): int

+ modificarDatos(capacidad: int, estado: String): void

+ toString(): String

Visitante

Atributos

Visibilidad

Atributo

Tipo

private

codigoEntrada

String

private

nombre

String

private

edad

int

private

cantidadAtraccionesVisitadas

int

private

puntosAcumulados

int

Métodos

+ Visitante(codigo: String, nombre: String, edad: int,
            atracciones: int, puntos: int)

+ getCodigoEntrada(): String

+ getEdad(): int

+ getCantidadAtraccionesVisitadas(): int

+ getPuntosAcumulados(): int

+ modificarDatos(nombre: String, edad: int,
                 atracciones: int, puntos: int): void

+ toString(): String

Parque

Atributos

Visibilidad

Atributo

Tipo

private

nombre

String

private

codigoIdentificacion

String

private

nombreEncargado

String

private

puntosAcceso

PuntoAcceso[]

private

visitantes

ArrayList<Visitante>

Métodos

+ Parque(nombre: String, codigo: String, encargado: String)

+ habilitarPuntoAcceso(posicion: int, punto: PuntoAcceso): boolean

+ consultarPuntosAcceso(): String

+ consultarPuntoAcceso(posicion: int): PuntoAcceso

+ modificarPuntoAcceso(posicion: int, capacidad: int,
                       estado: String): boolean

+ cerrarPuntoAcceso(posicion: int): boolean

+ registrarVisitante(visitante: Visitante): boolean

+ consultarVisitantes(): String

+ buscarVisitante(codigo: String): Visitante

+ modificarVisitante(codigo: String, nombre: String, edad: int,
                     atracciones: int, puntos: int): boolean

+ eliminarVisitante(codigo: String): boolean

+ generarReporte(): String

Main

Atributos

Visibilidad

Atributo

Tipo

private

parqueActual

Parque

Métodos

- ejecutarOpcion(opcion: int): void

3. ¿Cuál de las propiedades identificadas debe implementarse utilizando un arreglo básico?

Se implementarán arreglos básicos en:

private PuntoAcceso[] puntosAcceso;

¿Qué tipo de objetos almacenará y cuál será su tamaño?

El arreglo almacenará objetos de tipo PuntoAcceso y tendrá un tamaño fijo de cinco posiciones:

puntosAcceso = new PuntoAcceso[5];

4. ¿Cuál de las propiedades identificadas debe implementarse utilizando un ArrayList? ¿Qué tipo de objetos almacenará?

La propiedad será:

private ArrayList<Visitante> visitantes;

Almacenará objetos de tipo Visitante y se inicializará así:

visitantes = new ArrayList<Visitante>();

5. ¿Cuáles deben ser los modificadores de visibilidad de los miembros en cada clase?

Los modificadores de visibilidad en los miembros son:

private String nombre;

Mientras que los constructores y métodos usados en otras clases van a ser públicas:

public Parque
public boolean registrarVisitante

Los métodos auxiliares que solamente se utilicen dentro de una clase serán privados.

private void mostrarMenu()

Los métodos del main() serán públicos y estáticos.

6. ¿Qué parámetros serán requeridos por los métodos en sus clases?

El constructor de PuntoAcceso recibe código, nombre, ubicación, capacidad y estado.

modificarDatos() de PuntoAcceso recibe la nueva capacidad y el nuevo estado.

El constructor de Visitante recibe código, nombre, edad, atracciones y puntos.

modificarDatos() de Visitante recibe nombre, edad, atracciones y puntos.

habilitarPuntoAcceso() recibe una posición y un objeto PuntoAcceso.

consultarPuntoAcceso() recibe la posición que se desea consultar.

modificarPuntoAcceso() recibe posición, nueva capacidad y nuevo estado.

cerrarPuntoAcceso() recibe la posición que se cerrará.

registrarVisitante() recibe un objeto Visitante.

buscarVisitante() y eliminarVisitante() reciben un código de entrada.

modificarVisitante() recibe el código que se buscará y los nuevos datos.

ejecutarOpcion() recibe la opción seleccionada por el usuario.

7. ¿Cómo proveerá de valores iniciales a sus objetos?

Los valores iniciales serán proporcionados mediante constructores.

this.puntosAcceso = new PuntoAcceso[5];

Al crear un parque se inicializarán las estructuras:

this.visitantes = new ArrayList<Visitante>();

¿Qué valores deberán validarse antes de modificar el estado de los objetos?

Los textos obligatorios no pueden estar vacíos.

La capacidad máxima debe ser mayor que cero.

La edad debe ser mayor que cero.

Las atracciones visitadas no pueden ser negativas.

Los puntos acumulados no pueden ser negativos.

La posición del arreglo debe encontrarse entre 0 y 4.

La posición debe contener null antes de habilitar un punto.

La posición no debe contener null antes de consultar, modificar o cerrar.

No se permitirán visitantes con códigos repetidos.

Los nuevos valores también serán validados antes de modificar los objetos.

8. ¿Cómo determinará si una posición del arreglo contiene un punto de acceso o contiene null?

Se validarán los límites.

if (posicion >= 0 && posicion < puntosAcceso.length) {
    // La posición es válida
}

Después se comprobará su contenido:

if (puntosAcceso[posicion] == null) {
    System.out.println("La posición está disponible.");
}
else {
    System.out.println("La posición contiene un punto de acceso.");
}

9. ¿Cómo realizará las operaciones de búsqueda, modificación y eliminación dentro del ArrayList?

Primero, se debe recorrer el ArrayList:

for (int i = 0; i < visitantes.size(); i++) {
    Visitante visitante = visitantes.get(i);

    if (visitante.getCodigoEntrada().equals(codigoBuscado)) {
        // Visitante encontrado
    }
}

Registrar

Para registrar, se debe buscar el código del visitante. En caso de que no exista, se debe crear uno:

visitantes.add(nuevoVisitante);

Modificar

Para modificar, se buscará al visitante y se llamará:

visitante.modificarDatos(nombre, edad, atracciones, puntos);

Eliminar

Para eliminar se usará remove:

visitantes.remove(indice);

10. ¿Qué situaciones del programa pueden producir excepciones? Identifique qué excepciones deberán manejarse y en qué partes del programa utilizará try-catch y finally.

Ingreso de datos numéricos incorrectos

Si el usuario escribe letras o símbolos cuando se solicita un número, se producirá una InputMismatchException.

Esta excepción se manejará en la clase Main mediante un bloque try-catch. Después del error, se descartará la entrada inválida para permitir que el usuario intente nuevamente.

Valores que incumplen las validaciones

Se generará una Argumento Inválido cuando la capacidad de un punto de acceso sea menor o igual que cero, la edad de un visitante no sea positiva, o las cantidades de atracciones y puntos sean negativas.

Posiciones inválidas en el arreglo

Acceder a un índice menor que cero o mayor que cuatro podría generar una ArrayIndexOutOfBoundsException.

Para prevenirla, se comprobarán los límites del arreglo antes de consultar, modificar o cerrar un punto de acceso.

Posiciones que contienen null

Utilizar los métodos de una posición vacía podría causar una excepción de valor null.

Antes de usar un punto de acceso, se verificará que la posición contenga un objeto diferente de null.

Operaciones sobre un ArrayList vacío

Antes de buscar valores máximos o calcular el promedio de edad, se comprobará que existan visitantes registrados.

De esta manera se evitan operaciones que necesiten elementos inexistentes.

Uso de try-catch y finally

Los bloques try-catch se colocarán en la clase Main, especialmente en las secciones encargadas de leer datos, crear objetos y modificar su información.

El bloque finally se utilizará al terminar la ejecución para cerrar el objeto Scanner y mostrar un mensaje final, independientemente de si el programa terminó normalmente o se produjo una excepción controlada.