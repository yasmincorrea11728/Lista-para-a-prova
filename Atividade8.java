import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Diga a idade do nadador: ");
        int idade = entrada.nextInt();

        if(idade >= 4 && idade <= 7){
            System.out.println("Esse nadador é da classificação Infantil A");
        }else if(idade >= 8 && idade<= 10){
            System.out.println("Esse nadador é da classificação Infantil B");
        }else if(idade >= 11 && idade <= 13){
            System.out.println("Esse nadador é da classificação Juvenil A");
        }else if(idade >= 14 && idade <=17 ){
            System.out.println("Esse nadador é da classificação Juvenil B");
        }else{
            System.out.println("Esse nadador é da classificação Sênior");
        }

        entrada.close();
    }
}
