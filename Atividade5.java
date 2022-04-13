import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Me fale um número(positivo): ");
        double numero1 = entrada.nextFloat();

        double quadrado = numero1*numero1;
        double raiz = Math.sqrt(numero1);

        if(numero1>0){
            System.out.println("Quadrado do número: "+quadrado);
            System.out.println("Raiz do número: "+raiz);
        }else{
            System.out.println("O número não é positivo.");
        }
        entrada.close();
    }
}

