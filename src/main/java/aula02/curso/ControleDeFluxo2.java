package aula02.curso;

public class ControleDeFluxo2 {

	public static void main(String[] args) {

		/*** LAÇO DE REPETIÇÃO FOR

		for ( VariavelDeIterador; ValidaContinuidade; controleDeIteração) {
			bloco de instruções;
		}
		 ***/

		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		/*** *** *** *** ***/


		/*** LAÇO DE REPETIÇÃO FOREACH

		for ( TipoDeObjetoArmazenadoNoArray nomeDaVariavel : Array_A_ser_Iterado )
		{ bloco de instruçoes }

		***/
		String[] nomes = {"Ana", "Joana", "Jenifer", "Maria"};

		for (String i : nomes) {
		  System.out.println(i);
		}
		/*** *** *** *** ***/


		/*** LAÇO DE REPETIÇÃO WHILE

		 variavelDeControle

		 while (condição)
		 	{
				bloco de instruções;
			}
		 ***/

		int i = 0;

		while (i < 5) {
		  System.out.println(i);
		  i++;
		}
		/*** *** *** *** ***/


		/*** LAÇO DE REPETIÇÃO DO WHILE

		 variavelDeControle
			do
			 {
				bloco de instruções;
			 }
			while (condição);

		 ***/

		int j = 1;

		do{
			System.out.println(j);
		}while(j !=0 );
		/*** *** *** *** ***/
	}
}
