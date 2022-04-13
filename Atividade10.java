import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Me fale um número: ");
        int x = entrada.nextInt();

        System.out.print("Me fale outro número: ");
        int y = entrada.nextInt();

        System.out.print("Me fale mais um número: ");
        int z = entrada.nextInt();

        System.out.print("Me fale um número para a media (1/2/3):");
        int media = entrada.nextInt();

        switch (media) {
            case 1:
                System.out.println("Geométrica:\n"+x*y*z);
                break;
            case 2:
                System.out.println("Ponderada:\n"+x+3*y+2*z*6);
                break;
            case 3:
                System.out.println("Aritimetica:\n"+x+y+z*3);
                break;
            default:
                System.out.println("Somente os números 1,2,3.");
                break;
        }
        entrada.close();

    }
}
