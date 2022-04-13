import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Diga sua altura: ");
        double h = entrada.nextFloat();

        System.out.print("Diga seu peso: ");
        double peso = entrada.nextFloat();

        if (peso < 60 && h < 1.2){
            System.out.println("Sua classificação é A");
        }else if (peso < 60 && h>=1.2 && h < 1.7){
            System.out.println("Sua classificação é B");
        }else if(peso < 60 && h < 1.7){
            System.out.println("Sua classificação é C");
        }else if(peso >= 60 && peso<=90 && h<1.2){
            System.out.println("Sua classificação é D");
        }else if (peso >= 60 && peso<=90 && h>=1.2 && h <=1.7){
            System.out.println("Sua classificação é E");
        }else if(peso >= 60 && peso<=90 && h>1.7){
            System.out.println("Sua classificação é F");
        }else if(peso>90 && h<1.2){
            System.out.println("Sua classificação é G");
        }else if(peso>90 && h>=1.2 && h<=1.7){
            System.out.println("Sua classificação é H");
        }else{
            System.out.println("Sua classificação é I");
        }

        entrada.close();
    } 
}
