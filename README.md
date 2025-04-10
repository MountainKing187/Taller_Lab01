Repositorio del codigo fuente del Taller Lab 1

>Descrpicion

Se desea crear una aplicación basada en una serie de métodos para trabajar ciertas funcionalidades para administrar y visualizar el contenido de la matriz.

1. Las dimensiones de la matriz son definidas por el usuario (m: filas, n: columnas) y se debe considerar que estos datos ingresados sean válidos, es decir, debe considerar además un método que valide dichas dimensiones, considere:

boolean validarDimensiones(int filas, int cols) {

...

}

¿Cuándo m y n son dimensiones válidas?

2. Una vez estén capturadas y validadas las dimensiones de la matriz, se debe crear la matriz, por lo que recibe como parámetros las dimensiones y devuelve una matriz de enteros, considere:

int [ ][ ] crearMatriz(int filas, in cols) {

...

}

3. La matriz debe ser llenada con datos de tipo entero, de forma aleatoria, entre 0 y 9, considere:

<tipo> llenarMatriz(int matriz [ ][ ] ) {

...

}

¿Qué tipo de dato se retorna?

4. Muestre por pantalla toda la fila que desee el usuario, considere:

void mostrarFila(int matriz[ ][ ], int fila) {

...

}

5. Verifique si la matriz es de TIPO CERO, esto sucede cuando más del 50% de los valores de la matriz son CERO, considere:

boolean matrizCero(int matriz[ ][ ] ) {

...

}
6. Considere un menú que es llamado desde el método main(), para hacer de los métodos anteriores, considere:

void menu(???) {

...

}

¿Necesita algo más para usar el MENÚ? Por ej. ? leerOpcion( ? ){...}

 