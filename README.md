# U1Recuperacion1

## Datos generales
- **Autor:**  José Alejandro Olvera Lugo
- **Fecha de elaboración:** 22 de octubre de 2026
- **Materia:** Estructura de Datos
- **Unidad:** Unidad 1 - Recuperación 1

## Descripción del repositorio
En este repositorio se encuentran tres ejercicios de programacion realizados en Java para practicar los temas de recursividad, arreglos y clases genéricas.
Cada ejercicio cuenta con su código fuente, comentarios para explicar su funcionamiento y casos de prueba para comprobar que trabaje correctamente.

## Ejercicios realizados

|Núm.| Tema         | Ejercicio              | Archivo                        |

| 1  | Recursividad | Palíndromo             | Recursividad/Palindromo.java |
| 2  | Arreglos     | Invirtiendo el arreglo | Arreglos/InvertirArreglo.java |
| 3  | Genéricos    | Caja genérica          | Genericos/CajaGenerica.java |

## 1. Recursividad: Palíndromo
**Archivo:** Recursividad/Palindromo.java

### Descripción
Este programa permite comprobar si una palabra es un palíndromo, es decir, si se lee igual de izquierda a derecha que de derecha a izquierda.
Para hacerlo, se comparan los caracteres de los extremos de la palabra. Si coinciden, el método vuelve a llamarse para comparar los siguientes caracteres hasta llegar al centro.

### a) Caso base
El caso base se encuentra en la condición inicio >= fin.
Cuando los índices se encuentran o se cruzan, significa que los caracteres comparados coincidieron y que ya no es necesario continuar. Por eso, el método devuelve true.
Si los caracteres de los extremos son diferentes, devuelve false, porque la palabra no es un palíndromo.

### b) ¿Por qué elegí esta solución?
Elegí este ejercicio porque permite comprender cómo funciona la recursividad de una manera sencilla. También me ayuda a entender cómo un método puede llamarse a sí mismo hasta cumplir una condición que detenga las llamadas.

### c) Casos de prueba
| Caso      | Entrada | Resultado esperado           |
| 1. Normal | oso     | La palabra es un palíndromo. |
| 2. Normal | casa    | La palabra no es un palíndromo. |
| 3. Límite | a       | La palabra es un palíndromo. |


## 2. Arreglos: Invirtiendo el arreglo
**Archivo:** Arreglos/InvertirArreglo.java

### Descripción
Este programa solicita al usuario una cantidad de números enteros, los guarda en un arreglo y después invierte el orden de sus elementos.
Para realizarlo, se intercambia el primer elemento con el último, el segundo con el penúltimo y así sucesivamente hasta llegar al centro del arreglo.

### a) Estructura del arreglo
Se utiliza un arreglo de tipo int para almacenar los números ingresados.
También se utilizan las variables inicio y fin para identificar las posiciones que se van a intercambiar, y una variable llamada temporal para guardar momentáneamente uno de los números y evitar que se pierda durante el intercambio.

El ciclo while continúa mientras inicio sea menor que fin.

### b) ¿Por qué elegí esta solución?
Elegí esta solución porque permite invertir el arreglo sin tener que crear otro. Me parece una manera práctica de entender cómo se accede a los elementos mediante sus índices y cómo se pueden intercambiar sus valores.

### c) Casos de prueba
| Caso | Entrada | Resultado esperado |
| 1. Normal | [1, 2, 3, 4] | [4, 3, 2, 1] |
| 2. Normal | [7, 9, 2] | [2, 9, 7] |
| 3. Límite | [5] | [5] |


## 3. Clases parametrizadas / genéricos: Caja genérica
**Archivo:** Genericos/CajaGenerica.java

### Descripción
Este programa utiliza una clase llamada CajaGenerica que permite guardar diferentes tipos de datos, como números enteros, números decimales y cadenas de texto.
Además, cuenta con métodos para consultar el contenido de la caja y modificarlo cuando sea necesario.

### a) Parámetro de tipo
Se utiliza la letra T como parámetro de tipo en la declaración CajaGenerica<T>.
Esto permite indicar qué tipo de dato almacenará cada objeto al momento de crearlo. Por ejemplo, se utiliza Integer para guardar números enteros, String para guardar texto y Double para guardar números decimales.

La propiedad contenido almacena el dato, mientras que los métodos obtenerContenido() y establecerContenido() permiten consultarlo y modificarlo.

### b) ¿Por qué elegí esta solución?
Elegí este ejercicio porque permite comprender cómo funcionan los genéricos en Java y cómo se puede reutilizar una misma clase con diferentes tipos de datos, sin tener que crear una clase distinta para cada uno.

### c) Casos de prueba
| Caso      | Entrada               | Resultado esperado |
| 1. Normal | 25 de tipo Integer    | Se muestra 25. |
| 2. Normal | "Hola" de tipo String | Se muestra Hola. |
| 3. Límite | "" de tipo String     | Se muestra el contenido vacío entre corchetes: []. |

El tercer caso comprueba que la caja también puede almacenar una cadena vacía. Esto no significa que la caja no tenga un valor, sino que su contenido es un texto sin caracteres.


## Conclusión
Al realizar estos ejercicios pude practicar tres temas importantes de Estructura de Datos.
Con el palíndromo comprendí cómo utilizar la recursividad y establecer una condición para detener las llamadas. Con el arreglo practiqué el uso de índices y el intercambio de elementos. Finalmente, con la caja genérica aprendí cómo utilizar una clase con diferentes tipos de datos.

Estos ejercicios me ayudaron a reforzar la lógica de programación y a comprender mejor cómo funcionan estas herramientas en Java.

**Autor:** José Alejandro Olvera Lugo

**Fecha de elaboración:** 22 de octubre de 2026
