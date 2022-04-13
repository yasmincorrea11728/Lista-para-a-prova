import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Me fale um número: ");
        int n1 = entrada.nextInt();

        if(n1/3 != n1%3){
            if (n1/5 == n1%5){
                System.out.println("Falso");
            }
            else{
                System.out.println("Verdadeiro");    
            } 
        }else{
            System.out.println("Esse número não é divisivel por 3");
        }
        entrada.close();
    }
}
