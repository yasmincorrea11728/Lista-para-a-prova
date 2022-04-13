import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Me  diga seu sexo (M/F): ");
        String sexo = entrada.next();

        System.out.print("Diga sua altura: ");
        float h = entrada.nextFloat();

        switch (sexo) {
            case "M":
                Double pesoIdealM = (72.2*h)-58;
                System.out.println("Seu peso ideal: "+ pesoIdealM);
                break;

            default:
                double peso_idealF = (62.1*h)-44.7;
                System.out.println("Seu peso ideal: "+ peso_idealF);
                break;
        }

        entrada.close();
    }
}
