import java.util.Scanner;

public class App {
    //Escreva um algoritmo que solicite ao usuário a entrada da idade 
    //de 10 pessoas, e apresente a soma da idade e a média dessa idade.

    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        int alt, soma=0;
        
		for (int i=1; i <= 10; i++) {
		    System.out.println("Digite sua idade:");
		    alt = leia.nextInt();
		    soma = soma + alt;		        
		}
		System.out.println("A soma é: "+ soma);
		System.out.println("A média é: " + soma/10);
    }
}
