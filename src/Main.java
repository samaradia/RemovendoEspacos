import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = leitura.nextLine();

        String nomeFormatado = nome.trim();
        System.out.println("Nome sem espaços: " + nomeFormatado);
        leitura.close();

    }
}