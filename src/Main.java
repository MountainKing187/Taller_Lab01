import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static int[][] matrizGuardada = null;

    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        Scanner sc = scanner;
        int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();
            ejecutarOpcion(opcion, sc);
        } while (opcion != 4);
    }
    public static void mostrarMenu() {
        System.out.println("\n ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        System.out.println("                Creador                   ");
        System.out.println("                   de                     ");
        System.out.println("                Matrices                  ");
        System.out.println("\n ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        System.out.println("1) Crear Matriz con numeros aleatorios");
        System.out.println("2) Mostrar fila de la matriz");
        System.out.println("3) Ver si es matriz cero");
        System.out.println("4) Salir");
        System.out.println("\n ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }

    public static void ejecutarOpcion(int opcion, Scanner sc) {
        switch (opcion){
            case 1:
                ejecutarHacerMatriz(scanner);
                break;
            case 2:
                ejecutarMostrarFila(scanner);
                break;
            case 3:
                ejecutarMatrizCero(scanner);
                break;
            case 4:
                System.out.println("Adios");
                break;
        }
    }

    public static void ejecutarHacerMatriz(Scanner sc) {
        int[][] matriz = null;

        do {
            System.out.println("Ingrese las dimensiones de su matriz.");
            System.out.println("Numero de filas: ");
            int filas = sc.nextInt();
            System.out.println("Numero de columnas: ");
            int cols = sc.nextInt();

            if (validarDimensiones(filas, cols)) {
                matriz = crearMatriz(filas, cols);
                matriz = llenarMatriz(matriz);
            }
            if (matriz == null) {
                System.out.println("Ingrese unas dimensiones validas.");

            }
        }while (matriz == null) ;

        matrizGuardada = matriz;
    }

    public static void ejecutarMostrarFila(Scanner sc){
        int[][] matriz = matrizGuardada;
        if (matriz != null){
            System.out.println("Ingrese el indice de la fila que quiera ver: ");
            int fila = sc.nextInt() - 1;

            if (fila <= matriz.length && fila >= 0){
                mostrarFila(matriz,fila);
            } else {
                System.out.println("Ingreso un dato no valido.");
            }
        } else {
            System.out.println("Debe tener una matriz antes de usar esta opcion.");
        }
    }

    public static void ejecutarMatrizCero(Scanner sc){
        int [][] matriz = matrizGuardada;
        if (matriz != null){
            boolean is_cero = matrizCero(matriz);

            if (is_cero) {
                System.out.println("Su matriz es una matriz CERO.");
            } else {
                System.out.println("Su matriz no es una matriz CERO.");
            }
        } else {
            System.out.println("Debe tener una matriz antes de usar esta opcion.");
        }
    }

    public static boolean validarDimensiones(int filas,int cols){
        if (filas > 0 && cols >0){
            System.out.println("La matriz es valida.");
            return true;
        } else {
            System.out.println("La matriz es invalida.");
            return false;
        }
    }

    public static int[][] crearMatriz(int filas, int cols){
        return new int[filas][cols];
    }

    public static int[][] llenarMatriz(int[][] matriz) {
        int[][] matriz_llena = new int[matriz.length][matriz[0].length];
        int num_ran;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length ; j++) {
                num_ran = (int) Math.rint(Math.random() * 10);
                if (num_ran == 10){
                    num_ran --;
                }
                matriz_llena[i][j] = num_ran;
            }
        }
        return matriz_llena;
    }

    public static void mostrarFila(int[][] matriz, int fila){
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[fila][i]);
            System.out.print(" ");
        }
    }

    public static boolean matrizCero(int[][] matriz) {
        int cant_ceros = 0;
        int cant_total = matriz.length * matriz[0].length;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] == 0){
                    cant_ceros ++;
                }
            }
        }

        return (double) cant_ceros / cant_total > 0.5;
    }
}