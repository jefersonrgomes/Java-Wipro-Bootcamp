package aula02.curso;

import java.util.Locale;

public class Variaveis {

	/*** VARIAVEIS
	As variáveis são posições na memória do computador que podem armazenar dados.
	As variáveis são formadas por quatro elementos: nome, tipo, tamanho e valor.

	Ex:
		tipoDaVariavel nomeDaVariavel = valorDaVariavel
	***/
	public static void main(String[] args) {
	/*** TIPOS DE DADOS PRIMITIVOS EM JAVA
	Dados primitivos são tipos de variavies mais simples e comumente utilizadas em Java
	tipo nome (nao pode comecar com numeros, especiais ou palavras reservadas) = conteudo (mesmo tipo declarado);

	O Java possui dois tipos de dados que são divididos por valor (tipos primitivos)
	e por referência (tipos por referência).

	Os tipos primitivos são boolean, byte, char, short, int, long, float e double.

	Os tipos por referência, são classes que especificam os tipos de objeto Strings, Arrays Primitivos e Objetos.
	Uma variável do tipo primitivo pode armazenar exatamente um valor de seu tipo declarado por vez,
	quando outro valor for atribuído a essa variável, seu valor inicial será substituído.

	Abaixo exemplos de tipos primitivos recebendo valores logo após a declaração da variavel.
	***/
		boolean estudante = true;
		byte tipoByte = 127;
		char tipochar = 'a';// Apenas 1 caractere entra aspas simples.
		char letra = tipochar;
		short tipoShort = 32767;
		int tipoInt = 28;
		int idade = tipoInt;
		long tipoLong = 9223372036854775807L;
		float tipoFloat = 2.6f;
		double altura = 1.66;
		double tipoDouble = 45.654;

		/*** VARIAVEIS IMUTAVEIS E CONSTANTES EM JAVA
		 Para declarar uma variavel do tipo constante que não mude após sua declaração
		 Em JAVA utilizamos a palavra reservada 'final' antes do tipo da variavel
		 Este recurso é utilizado quando queremos que uma variavel não tenha seu valor de memoria alterado.
		***/
		final String nome2 = "Jonathan"; //constante

		/*** TAMANHO OCUPADO EM MEMORIA PELOS TIPOS PRIMITIVOS
		 Ao criar uma variavel em java, cada tipo reserva um determinado valor em memoria
		 para armazenar o valor que sera recebido pela variavel

		 Abaixo vemos a execução do métodoo println que escreve no console o tamanho minimo e maximo que cada tipo
		 primitivo reserva em memoria
		 ***/
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
		
		System.out.printf("%n '%100s'", nome2);
		System.out.printf("%n '%1.3S' %n", nome2);
		
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
