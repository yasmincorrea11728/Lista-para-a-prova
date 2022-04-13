import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Me diga o termo a: ");
        int a = entrada.nextInt();

        System.out.print("Me  diga o termo b: ");
        int b = entrada.nextInt();

        System.out.print("Me diga o termo c: ");
        int c = entrada.nextInt();

        int delta = b*b - 4*a*c;
        double raiz = Math.sqrt(delta);
        if (delta < 0){
            System.out.println("Essa raiz não existe.");
        }else if (delta == 0){
            System.out.println("Raíz unica"+(-b+raiz)/2*a);
        }else{
            System.out.println("Duas raízes"+ (-b-raiz/2*a)+"\n"+-b+raiz/2*a);
        }
        entrada.close();
    }
}
