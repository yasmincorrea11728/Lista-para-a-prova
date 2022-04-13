import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Me diga o nome do produto: ");
        String nome = entrada.nextLine();

        System.out.print("Me diga o modelo do produto: ");
        String modelo = entrada.nextLine();

        System.out.print("Me diga o tamanho do produto: ");
        Float tamanho = entrada.nextFloat();

        System.out.print("Me diga o preço do produto: ");
        Double preco = entrada.nextDouble();

        System.out.print("Me diga a quantidade desse produto: ");
        int quantidade = entrada.nextInt();

        System.out.println("Os dados do seu produto:"+
        "\n nome:" +nome+
        "\n modelo:"+modelo+
        "\n tamanho:"+tamanho+
        "\n preço:"+preco+
        "\n quantidade:"+quantidade);

        entrada.close();
    }
}
    