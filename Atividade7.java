import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Me fale o valor do produto: ");
        float produto = entrada.nextInt();

        System.out.print("Me fale o estado para qual vai o produto (MG,RJ,SP,MS): ");
        String estado = entrada.next(); 

        switch (estado){
            case "MG":
                double produtoFinal_MG = produto+7/100;
                System.out.println("Preço do produto no estado de MG:" + produtoFinal_MG);
                break;

            case "RJ":
                double produtoFinal_RJ = produto+15/100;  
                System.out.println("Preço do produto no estado de RJ:"+ produtoFinal_RJ);
                break;

            case "SP":
                double produtoFinal_SP = produto+12/100;
                System.out.println("Preço do produto no estado de SP:"+produtoFinal_SP);
                break;

            case "MS":
                double produtoFinal_MS = produto+8/100;
                System.out.println("Preço do produto no estado de MS:"+produtoFinal_MS);
                break;
            }
        entrada.close();
    }
}
