package aula1;

public class ControleDeFluxo {

	public static void main(String[] args) {
		
		//operadores aritm�ticos
//		+
//		-
//		*
//		/
//		% operador de m�dulo (ou resto da divis�o)
		
		
		// Operadores relacionais
//		>  maior 
//		>= maior ou igual 
		
//		< menor
//		<= menor ou igual
		
//		operadores de igualdade
//		== igual
//		!= diferente
		
		
		

//		if (express�o booleana) {
		
//		    // bloco de c�digo 1
		
//		} else if (express�o bolena) {
//		    // bloco de c�digo 2
//		} else {
//			
//		}
		
		// if ternario         true       false  
//		(express�o booleana) ? c�digo 1 : c�digo 2;

		int a, b, c;
		a = 10;
		b = 30;
		c = 7;
		
		
		if (a > b) {
			System.out.println("A � maior do que B");
		} else if (a > c) {
			System.out.println("A � maior do que C");
		}else {
			System.out.println("A � menor do que B ou C");
		}	
		

		int numero = 31;
		String parOUimpar = (numero % 2 == 0) ? "Par" : "Impar";
		
		if(numero % 2 == 0) {
			parOUimpar = "par";
//			c = numero;
		} else {
			parOUimpar = "impar";
		}
		
		System.out.println(parOUimpar);
		
		
//		operadores de l�gicos
//		
//		&&  - Utilizado quando desejamos que as duas express�es sejam verdadeiras.
//		|| - Utilizado quando precisamos que pelo meno um das express�es seja verdadeira.
		System.out.println("teste ternario");

		if((a > b) || (a > c)) {
			System.out.println("a");
		}
		
		
		System.out.println("false && true = " + (primCondicao(false) && segCondicao(true)) + " - sem teste da segunda condi��o.");

        System.out.println();

        System.out.println("false & true = " +
                (primCondicao(false) & segCondicao(true)) +
                " - com teste da segunda condi��o.");

        System.out.println();

        System.out.println("true || false = " +
            (primCondicao(true) || segCondicao(false)) +
            " - sem teste da segunda condi��o.");
        System.out.println();

        System.out.println("true | false = " +
                (primCondicao(true) | segCondicao(false)) +
                " - com teste da segunda condi��o.");
    }
	
//	modificadorDeAcesso tipo_retorno identificador/nome ([argumentos]) {
//
//		//Corpo do m�todo
//
//		}

    private static boolean primCondicao(boolean retorno){
        System.out.println("Executou o teste da primeira condi��o");
        return retorno;
    }

    private static boolean segCondicao(boolean retorno){
        System.out.println("Executou o teste da segunda condi��o");
        return retorno;
    }
}
