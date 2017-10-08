
public class NumeroDecrescente{
	
	
	//Crie uma classe java NumeroDecrescente que contenha um método que receba um número inteiro e imprima, em ordem decrescente, o valor do número até 0.
	public void numeroDecrescente(int a){
		System.out.println(a);
		while(a != 0){
			a = a - 1;
			System.out.println(a);
		}
	}
	
	//Escreva um programa que imprima na tela a soma dos números ímpares entre 0 e 30 e a multiplicação dos números pares entre 0 e 30.
		public void somaImpar(){
			int soma = 0;
			for (int i = 0; i < 30; i++){
				if(i%2 != 0){
					soma = soma + i;
					System.out.println(soma);
				}
			}
		}
}
	
	
