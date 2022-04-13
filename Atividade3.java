import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escolha um número: ");
        float n1 = entrada.nextFloat();

        System.out.print("Escolha outro número: ");
        float n2 = entrada.nextFloat();

        if(n1>n2){
            System.out.println("Esse é o maior valor: "+n1);
        }else if(n2>n1){
            System.out.println("Esse é o maior valor: "+n2);
        }else{
            System.out.println("Números iguais.");
        }
        entrada.close();
    }
}
