import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu salario: ");
        float salario = entrada.nextFloat();

        System.out.print("Me fale o valor do empréstimo: ");
        float emprestimo = entrada.nextFloat();

        if (emprestimo>salario*20/100) {
            System.out.println("Emprestimo não concedido.");
        }else{
            System.out.println("Emprestimo concedido.");
        }
        entrada.close();
    }
}
