import java.util.Scanner;

public class App {
    //Crie um programa que receba o nome de uma pessoa e devolva 
    //as iniciais desse nome. Lembrando que “do”, “de”, “da”, “das” 
    //e “dos” não devem ser consideradas nomes. Use a função substring 
    //do objeto String.
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome completo: ");
        String nomeCompleto = scanner.nextLine();
        scanner.close();

        String[] partesNome = nomeCompleto.split(" ");
        StringBuilder iniciais = new StringBuilder();

        for (String parte : partesNome) {
            parte = parte.toLowerCase(); // Converta para minúsculas para ser insensível a maiúsculas
            if (!parte.equals("do") && !parte.equals("de") && !parte.equals("da") && !parte.equals("das") && !parte.equals("dos")) {
                iniciais.append(parte.substring(0, 1).toUpperCase()); // Obtém a primeira letra e converte para maiúsculas
            }
        }

        System.out.println("Iniciais do nome: " + iniciais.toString());
    }
}
