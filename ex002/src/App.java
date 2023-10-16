import java.util.Scanner;
public class App {
    //Escreva um algoritmo que solicite ao usuário a entrada do 
    //peso de 30 bois e mostre no fim o peso do boi mais pesado 
    //e o peso do boi mais leve.
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        double peso=0, maiorpe=0, menorpe=9999;
		for (int i=1; i <= 3; i++) {
		    System.out.println("Digite o peso:");
		    peso = leia.nextDouble();
		    if (peso > maiorpe) {
		    	maiorpe=peso;		    
		    }
		    if (peso < menorpe) {
		    	menorpe= peso;
		    }
		}
		System.out.println("O maior peso foi: "+ maiorpe);
		System.out.println("O menor peso foi: "+ menorpe);
    }
}
