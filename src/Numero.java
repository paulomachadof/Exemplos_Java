import java.util.Scanner;

public class Numero {
	Scanner leitor = new Scanner(System.in);

	public void exibeNumero(){
		int a;
		System.out.println("Digite um numero: ");
		a = leitor.nextInt();
		System.out.println("Você digitou: "+a);
	}
}
