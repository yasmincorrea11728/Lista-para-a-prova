import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.print("Diga um número: ");
        double n1 = entrada.nextFloat();

        System.out.print("Diga um operador: ");
        char op = entrada.next().charAt(0);

        System.out.print("Diga um número: ");
        double n2 = entrada.nextFloat();

        switch (op) {
            case '+':
                System.out.println(n1+n2);
                break;

            case '*':
                System.out.println(n1*n2);
                break;
            case '-':
                System.out.println(n1-n2);
                break;
            default:
                System.out.println(n1/n2);
                break;
        }
        entrada.close();

    }
} 