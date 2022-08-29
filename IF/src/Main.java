import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribir numero");
        int numero = teclado.nextInt();
        if (numero < 0 ) {
            System.out.println("es negativo");
            return;
        }
        if (numero > 0 ) {
            System.out.println("es postivo");
            return;
        }
        System.out.println("es neutro");
    }

}
