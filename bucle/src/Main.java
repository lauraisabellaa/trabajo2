import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            System.out.print("\n");
            System.out.println("1. While");
            System.out.println("2. DoWhile");
            System.out.println("3. For");
            System.out.println("4. salir");
            System.out.println("Ingrese unicamente el numero del ejercicio");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("ciclo While \n");
                    ejercicioWhile();
                    break;
                case 2 :
                    System.out.print("ciclo Dowhile \n");
                    ejercicioDoWhile();
                    break;
                case 3 :
                    System.out.print("ciclo For \n");
                    ejercicioFor();
                    break;
                default:
                    System.out.println("escribir opcion correcta");
            }
        } while (opcion != 4);
    }

    static void ejercicioWhile() {
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile = numeroWhile + 1;
            System.out.println(numeroWhile);
        }
    }
    static void ejercicioDoWhile() {
        int numeroDoWhile = 0;
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile = numeroDoWhile + 1;
        } while (numeroDoWhile < 3);
    }
    static void ejercicioFor() {
            int numeroFor;
            for (numeroFor = 0; numeroFor < 3; ) {
                numeroFor = numeroFor + 1;
                System.out.println(numeroFor);
            }
        }
    }
