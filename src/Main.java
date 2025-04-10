import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static boolean programRunning = true;
    public static void main(String[] args) {
        hacerMatrizValidada(scanner);
    }
    public static void menu() {
        Scanner sc = scanner;
        int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();
            ejecutarOpcion(opcion,sc);
        }while (programRunning);
    }
    public static void mostrarMenu() {
        System.out.println("\n ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        System.out.println("              Operaciones                 ");
        System.out.println("                  de                      ");
        System.out.println("               Matrices                   ");
        System.out.println("\n ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        System.out.println("1) Sumar");
        System.out.println("2) Restar");
        System.out.println("3) Multiplicar");
        System.out.println("4) Invertir");
        System.out.println("5) Dividir");
        System.out.println("6) Salir");
        System.out.println("\n ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }

    public static void ejecutarOpcion(int opcion, Scanner sc) {
        switch (opcion){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                salir();
                break;
        }
    }

    public static void salir(){
        programRunning = false;
    }

    public static int[][] hacerMatrizValidada(Scanner sc) {
        System.out.println("Ingrese las dimensiones de su matriz.");
        System.out.println("Numero de filas: ");
        int filas = sc.nextInt();
        System.out.println("Numero de columnas: ");
        int cols = sc.nextInt();

        int[][] matriz = null;

        if (validarDimensiones(filas, cols)) {
            matriz = crearMatriz(filas, cols);
            matriz = llenarMatriz(matriz);
        }
        if (matriz== null){
            System.out.println("aaaaa");
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        ejecutarMostrarFila(matriz,sc);

        return matriz;
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

    public static int[][] llenarMatriz(int matriz [][] ) {
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

    public static void ejecutarMostrarFila(int[][] matriz,Scanner sc){
        System.out.println("Ingrese el indice de la fila que quiera ver: ");
        int fila = sc.nextInt();

        if (fila <= matriz.length && fila >= 0){
            mostrarFila(matriz,fila);
        }
    }

    public static void mostrarFila(int[][] matriz, int fila){
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[fila][i]);
            System.out.print(" ");
        }
    }
}