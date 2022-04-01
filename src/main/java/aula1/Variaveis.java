package aula1;

import java.util.Locale;

public class Variaveis {
	
	public static void main(String[] args) {
		System.out.println("Aqui não pula linha com %n mas pula linha com \n");
		System.out.println(String.format("Aqui como é String.format pula linha com %n e tambem com \n"));

		//tipo nome (nao pode comecar com numeros, especiais ou palavras reservadas) = conteudo (mesmo tipo declarado);
		int idade = 28;
		idade = 30;

		//final é utilizado quando queremos que uma variavel não tenha seu de memoria alterado.
		final String nome = "Jonathan"; //constante
		char letra = 'a'; // apenas 1 caractere entra aspas simples
		double altura = 1.66;
		boolean estudante = true;

		// Tipos de dados primitivos
		byte tipoByte = 127;
		short tipoShort = 32767;
		float tipoFloat = 2.6f;
		double tipoDouble = 3.59;
		int tipoInt = 2147483647;
		long tipoLong = 9223372036854775807L;
		
		System.out.println (
				"Tipos de dados numericos em Java: \n" +
	            "\nMenor Short Int: " + Short.MIN_VALUE +
	            "\nMaior Short Int: " + Short.MAX_VALUE +
	            "\nMenor Int: " + Integer.MIN_VALUE +
	            "\nMaior Int: " + Integer.MAX_VALUE +
	            "\nMenor Long: " + Long.MIN_VALUE +
	            "\nMaior Long: " + Long.MAX_VALUE +
	            "\nMenor Float: " + Float.MIN_VALUE +
	            "\nMaior Float: " + Float.MAX_VALUE +
	            "\nMenor Double: " + Double.MIN_VALUE +
	            "\nMaior Double: " + Double.MAX_VALUE
	            ); 
		System.out.println("Imprimir conteudo no console");
		
		//System.out.print() - contem caractere de escape 
		//System.out.println() - cria uma nova linha e posicionando o cursor na linha abaixo
		//System.out.printf(); - Especifica o formato da entrada
		
		System.out.print("Linha 1\nLinha 2\n"); // posiciona cursor na nova linha
		System.out.print("Linha 3 \t Linha 4 \n"); // Tabula��o	horizontal. 
		System.out.print("Linha 5 \r Linha 6 \n"); // Posiciona o cursor da tela no in�cio da linha atual - n�o avan�a para a pr�xima linha. . 
		System.out.print("Linha 7 \\ \\ \n"); // Barras invertidas. 
		System.out.print("\"Linha 8\" \n"); // Aspas duplas.

		//Formatando Strings
		System.out.printf("Inteiro = %d %d", idade, idade);
		System.out.printf("Float = %f", tipoFloat);
		System.out.printf("Double = %2f", tipoDouble);
		System.out.printf("Beleano = %b", estudante);
		System.out.printf("Char = %c", letra);
		
		System.out.printf("%n '%100s'", nome);
		System.out.printf("%n '%1.3S' %n", nome);
		
		System.out.printf(Locale.US, "%,2f %n", 1000.0);
		System.out.printf(Locale.ITALY, "%,2f %n", 10000.0);
		
		System.out.printf("'%1.2f'%n", 40000.321); // largura do nosso n�mero como 1 e comprimento da parte decimal � 2;

		System.out.println("teste pula linha %n");

		// Tipos de dados por referencia
		
		Integer idade2 = 40;

		String idade3 = idade2.toString();

		Integer idade4 = idade2; 
		idade4 = 20; 		
		
		System.out.println(idade4); //20
		System.out.println(idade2); //40
		
		System.out.println();
		System.out.println(idade2.getClass().getSimpleName());

	}
}
