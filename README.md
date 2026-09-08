//Nota: ni voy a fingir que formateé esto yo mismo, ambos sabemos que no.

# Análisis

## 1. ¿Qué propiedades y métodos tendrá cada clase?

### Clase `PuntoAcceso`

Representa uno de los puntos de acceso habilitados dentro del parque.

#### Propiedades

* **`codigo`**: identifica el punto de acceso.
* **`nombre`**: almacena su nombre.
* **`ubicacion`**: indica dónde se encuentra.
* **`capacidadMaximaPorHora`**: indica cuántas personas puede atender por hora.
* **`estado`**: indica su condición actual.

#### Métodos

* **Constructor**: crea el punto de acceso y valida la capacidad.
* **`getCapacidadMaximaPorHora()`**: devuelve su capacidad.
* **`modificarDatos()`**: modifica la capacidad y el estado.
* **`toString()`**: devuelve toda su información.

---

### Clase `Visitante`

Representa a una persona registrada durante su estadía en el Parque Universitario de Atracciones.

#### Propiedades

* **`codigoEntrada`**: identifica de forma única al visitante.
* **`nombre`**: almacena su nombre.
* **`edad`**: almacena su edad.
* **`cantidadAtraccionesVisitadas`**: lleva el conteo de atracciones visitadas.
* **`puntosAcumulados`**: almacena sus puntos.

#### Métodos

* **Constructor**: crea al visitante y valida sus datos.
* **`getCodigoEntrada()`**: permite buscar al visitante.
* **`getEdad()`**: se utiliza para calcular el promedio de edad.
* **`getCantidadAtraccionesVisitadas()`**: se utiliza para encontrar al visitante con más atracciones.
* **`getPuntosAcumulados()`**: se utiliza para encontrar al visitante con más puntos.
* **`modificarDatos()`**: modifica su información.
* **`toString()`**: devuelve toda su información.

---

### Clase `Parque`

Representa el parque y administra sus puntos de acceso y visitantes.

#### Propiedades

* **`nombre`**: nombre del parque.
* **`codigoIdentificacion`**: código que identifica al parque.
* **`nombreEncargado`**: nombre de la persona encargada.
* **`puntosAcceso`**: arreglo básico de cinco objetos `PuntoAcceso`.
* **`visitantes`**: colección dinámica de objetos `Visitante`.

#### Métodos

* **Constructor**: crea el parque e inicializa el arreglo y el `ArrayList`.
* **`habilitarPuntoAcceso()`**: coloca un punto de acceso en una posición disponible.
* **`consultarPuntosAcceso()`**: devuelve los puntos de acceso habilitados.
* **`consultarPuntoAcceso()`**: busca un punto mediante su posición.
* **`modificarPuntoAcceso()`**: modifica la capacidad y el estado de un punto.
* **`cerrarPuntoAcceso()`**: coloca `null` en una posición.
* **`registrarVisitante()`**: agrega un visitante si su código no está repetido.
* **`consultarVisitantes()`**: devuelve todos los visitantes registrados.
* **`buscarVisitante()`**: busca un visitante por su código.
* **`modificarVisitante()`**: modifica un visitante encontrado mediante su código.
* **`eliminarVisitante()`**: elimina un visitante del `ArrayList` mediante su código.
* **`generarReporte()`**: realiza todos los cálculos solicitados y muestra un ranking.

---

### Clase `Main`

Se encargará de inicializar y administrar el parque mediante la interacción con el usuario.

#### Propiedades

* **`parqueActual`**: guarda el parque que está siendo administrado.

#### Métodos

* **`ejecutarOpcion()`**: ejecuta la opción seleccionada por el usuario.

---

## 2. ¿Qué tipo deben tener las propiedades y métodos de cada clase?

### `PuntoAcceso`

#### Atributos

| Visibilidad | Atributo                 | Tipo     |
| ----------- | ------------------------ | -------- |
| `private`   | `codigo`                 | `String` |
| `private`   | `nombre`                 | `String` |
| `private`   | `ubicacion`              | `String` |
| `private`   | `capacidadMaximaPorHora` | `int`    |
| `private`   | `estado`                 | `String` |

#### Métodos

```text
+ PuntoAcceso(codigo: String, nombre: String, ubicacion: String,
              capacidad: int, estado: String)

+ getCapacidadMaximaPorHora(): int

+ modificarDatos(capacidad: int, estado: String): void

+ toString(): String
```

---

### `Visitante`

#### Atributos

| Visibilidad | Atributo                       | Tipo     |
| ----------- | ------------------------------ | -------- |
| `private`   | `codigoEntrada`                | `String` |
| `private`   | `nombre`                       | `String` |
| `private`   | `edad`                         | `int`    |
| `private`   | `cantidadAtraccionesVisitadas` | `int`    |
| `private`   | `puntosAcumulados`             | `int`    |

#### Métodos

```text
+ Visitante(codigo: String, nombre: String, edad: int,
            atracciones: int, puntos: int)

+ getCodigoEntrada(): String

+ getEdad(): int

+ getCantidadAtraccionesVisitadas(): int

+ getPuntosAcumulados(): int

+ modificarDatos(nombre: String, edad: int,
                 atracciones: int, puntos: int): void

+ toString(): String
```

---

### `Parque`

#### Atributos

| Visibilidad | Atributo               | Tipo                   |
| ----------- | ---------------------- | ---------------------- |
| `private`   | `nombre`               | `String`               |
| `private`   | `codigoIdentificacion` | `String`               |
| `private`   | `nombreEncargado`      | `String`               |
| `private`   | `puntosAcceso`         | `PuntoAcceso[]`        |
| `private`   | `visitantes`           | `ArrayList<Visitante>` |

#### Métodos

```text
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
```

---

### `Main`

#### Atributos

| Visibilidad | Atributo       | Tipo     |
| ----------- | -------------- | -------- |
| `private`   | `parqueActual` | `Parque` |

#### Métodos

```text
- ejecutarOpcion(opcion: int): void
```

---

## 3. ¿Cuál de las propiedades identificadas debe implementarse utilizando un arreglo básico?

Se implementará un arreglo básico para almacenar los puntos de acceso:

```java
private PuntoAcceso[] puntosAcceso;
```

### ¿Qué tipo de objetos almacenará y cuál será su tamaño?

El arreglo almacenará objetos de tipo `PuntoAcceso` y tendrá un tamaño fijo de cinco posiciones:

```java
puntosAcceso = new PuntoAcceso[5];
```

Cada posición podrá contener un objeto `PuntoAcceso` o `null` si el punto de acceso se encuentra cerrado o la posición está disponible.

---

## 4. ¿Cuál de las propiedades identificadas debe implementarse utilizando un `ArrayList`? ¿Qué tipo de objetos almacenará?

La propiedad será:

```java
private ArrayList<Visitante> visitantes;
```

Almacenará objetos de tipo `Visitante` y se inicializará de la siguiente manera:

```java
visitantes = new ArrayList<Visitante>();
```

A diferencia del arreglo de puntos de acceso, el `ArrayList` permitirá agregar y eliminar visitantes dinámicamente.

---

## 5. ¿Cuáles deben ser los modificadores de visibilidad de los miembros en cada clase?

Los atributos de las clases deberán tener visibilidad `private` para aplicar encapsulamiento.

Por ejemplo:

```java
private String nombre;
```

Los constructores y métodos que sean utilizados desde otras clases deberán ser `public`.

Por ejemplo:

```java
public Parque(...)
public boolean registrarVisitante(...)
```

Los métodos auxiliares que solamente sean utilizados internamente dentro de una clase podrán ser `private`.

Por ejemplo:

```java
private void mostrarMenu()
```

En la clase `Main`, el método `main()` será `public` y `static`:

```java
public static void main(String[] args)
```

---

## 6. ¿Qué parámetros serán requeridos por los métodos en sus clases?

Los parámetros requeridos por cada método serán los siguientes:

* El constructor de `PuntoAcceso` recibe:

  * código
  * nombre
  * ubicación
  * capacidad
  * estado

* `modificarDatos()` de `PuntoAcceso` recibe:

  * nueva capacidad
  * nuevo estado

* El constructor de `Visitante` recibe:

  * código
  * nombre
  * edad
  * cantidad de atracciones
  * puntos acumulados

* `modificarDatos()` de `Visitante` recibe:

  * nombre
  * edad
  * cantidad de atracciones
  * puntos acumulados

* `habilitarPuntoAcceso()` recibe:

  * posición
  * objeto `PuntoAcceso`

* `consultarPuntoAcceso()` recibe:

  * posición que se desea consultar

* `modificarPuntoAcceso()` recibe:

  * posición
  * nueva capacidad
  * nuevo estado

* `cerrarPuntoAcceso()` recibe:

  * posición que se desea cerrar

* `registrarVisitante()` recibe:

  * objeto `Visitante`

* `buscarVisitante()` recibe:

  * código de entrada

* `modificarVisitante()` recibe:

  * código del visitante
  * nuevos datos del visitante

* `eliminarVisitante()` recibe:

  * código de entrada

* `ejecutarOpcion()` recibe:

  * opción seleccionada por el usuario

---

## 7. ¿Cómo proveerá de valores iniciales a sus objetos?

Los valores iniciales serán proporcionados mediante los constructores de cada clase.

En el caso de `Parque`, el arreglo de puntos de acceso se inicializará con cinco posiciones:

```java
this.puntosAcceso = new PuntoAcceso[5];
```

Inicialmente, todas las posiciones del arreglo contendrán `null`.

La colección de visitantes se inicializará de la siguiente manera:

```java
this.visitantes = new ArrayList<Visitante>();
```

### ¿Qué valores deberán validarse antes de modificar el estado de los objetos?

Se deberán validar las siguientes condiciones:

* Los textos obligatorios no pueden estar vacíos.
* La capacidad máxima debe ser mayor que cero.
* La edad debe ser mayor que cero.
* La cantidad de atracciones visitadas no puede ser negativa.
* Los puntos acumulados no pueden ser negativos.
* La posición del arreglo debe encontrarse entre `0` y `4`.
* La posición debe contener `null` antes de habilitar un punto de acceso.
* La posición no debe contener `null` antes de consultar, modificar o cerrar un punto de acceso.
* No se permitirán visitantes con códigos repetidos.
* Los nuevos valores también deberán validarse antes de modificar los objetos.

---

## 8. ¿Cómo determinará si una posición del arreglo contiene un punto de acceso o contiene `null`?

Primero se validarán los límites del arreglo:

```java
if (posicion >= 0 && posicion < puntosAcceso.length) {
    // La posición es válida
}
```

Después se comprobará el contenido de la posición:

```java
if (puntosAcceso[posicion] == null) {
    System.out.println("La posición está disponible.");
} else {
    System.out.println("La posición contiene un punto de acceso.");
}
```

De esta manera se evita acceder a posiciones inexistentes y se puede determinar si una posición está disponible o contiene un objeto `PuntoAcceso`.

---

## 9. ¿Cómo realizará las operaciones de búsqueda, modificación y eliminación dentro del `ArrayList`?

Las operaciones sobre el `ArrayList` se realizarán recorriendo la colección y comparando el código de entrada de cada visitante.

Por ejemplo:

```java
for (int i = 0; i < visitantes.size(); i++) {
    Visitante visitante = visitantes.get(i);

    if (visitante.getCodigoEntrada().equals(codigoBuscado)) {
        // Visitante encontrado
    }
}
```

### Registrar

Para registrar un visitante, primero se deberá comprobar que su código no exista.

Si el código no está registrado, se agregará el nuevo visitante:

```java
visitantes.add(nuevoVisitante);
```

Si el código ya existe, el registro deberá rechazarse.

### Modificar

Para modificar un visitante, primero se buscará mediante su código.

Una vez encontrado, se llamará al método:

```java
visitante.modificarDatos(nombre, edad, atracciones, puntos);
```

### Eliminar

Para eliminar un visitante, primero se buscará su índice dentro del `ArrayList`.

Una vez encontrado, se utilizará:

```java
visitantes.remove(indice);
```

---

## 10. ¿Qué situaciones del programa pueden producir excepciones? Identifique qué excepciones deberán manejarse y en qué partes del programa utilizará `try-catch` y `finally`.

### Ingreso de datos numéricos incorrectos

Si el usuario escribe letras o símbolos cuando se solicita un número mediante `Scanner`, se puede producir una `InputMismatchException`.

Esta excepción se manejará en la clase `Main` mediante un bloque `try-catch`.

Después del error, se deberá descartar la entrada inválida para permitir que el usuario intente nuevamente.

### Valores que incumplen las validaciones

Si se intenta crear o modificar un objeto con valores inválidos, se puede lanzar una `IllegalArgumentException`.

Por ejemplo:

* Capacidad de un punto de acceso menor o igual que cero.
* Edad de un visitante menor o igual que cero.
* Cantidad de atracciones negativa.
* Cantidad de puntos negativa.
* Textos obligatorios vacíos.

### Posiciones inválidas en el arreglo

Acceder a un índice menor que cero o mayor que el último índice disponible puede producir una `ArrayIndexOutOfBoundsException`.

Para evitar esta situación, se comprobarán los límites antes de acceder al arreglo:

```java
if (posicion >= 0 && posicion < puntosAcceso.length) {
    // Acceso seguro al arreglo
}
```

### Posiciones que contienen `null`

Si una posición del arreglo contiene `null` y se intenta utilizar directamente un método sobre ella, podría producirse una `NullPointerException`.

Por ejemplo, sería incorrecto realizar:

```java
puntosAcceso[posicion].toString();
```

sin comprobar previamente que la posición contenga un objeto.

Por esta razón, se verificará:

```java
if (puntosAcceso[posicion] != null) {
    // Se puede utilizar el objeto
}
```

### Operaciones sobre un `ArrayList` vacío

Antes de realizar operaciones como calcular el promedio de edad o determinar cuál visitante tiene más puntos o más atracciones, se comprobará que existan visitantes registrados.

Por ejemplo:

```java
if (visitantes.isEmpty()) {
    System.out.println("No hay visitantes registrados.");
}
```

De esta manera se evita realizar cálculos que requieran elementos inexistentes.

### Uso de `try-catch` y `finally`

Los bloques `try-catch` se colocarán principalmente en la clase `Main`, especialmente en las secciones encargadas de:

* Leer datos ingresados por el usuario.
* Crear objetos.
* Modificar información.
* Ejecutar las diferentes opciones del menú.

El bloque `finally` podrá utilizarse para cerrar el objeto `Scanner` y mostrar un mensaje final, independientemente de si el programa terminó normalmente o se produjo una excepción controlada.

Por ejemplo:

```java
Scanner scanner = new Scanner(System.in);

try {
    // Ejecución del programa
} catch (InputMismatchException e) {
    System.out.println("Debe ingresar un valor válido.");
} finally {
    scanner.close();
}
```
