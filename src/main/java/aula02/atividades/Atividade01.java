package aula02.atividades;

import java.util.Random;
import java.util.Scanner;
//https://github.com/jefersonrgomes/Java-Wipro-Bootcamp/tree/master/src/main/java/aula02/atividades

public class Atividade01 {
/***
 Atividade 1
    Grupo 06
        Benivaldo Honorio
        Wesley Fernandes
        Viviane Viana
        Natalie Bozzon
        Jeferson Gomes


 Escreva um programa Java que
 [x] Gera um número aleatório (randômico) entre 0 e 10 (incluindo estes dois valores)
 [x] Peça ao usuário para adivinhá-lo.
 [x] Use um laço while para registrar as tentativas feitas
 [x] E a cada tentativa, dê dicas informando se o número gerado é maior ou menor que a tentativa feita.
 [x] Finalmente mostre a quantidade de tentativas feitas até que o número fosse acertado.

 HELPERS:
 Recebendo valores em java com método Scanner(): https://www.devmedia.com.br/como-funciona-a-classe-scanner-do-java/28448
 Usando numeros randomicos em java com método Random(): https://www.devmedia.com.br/numeros-aleatorios-em-java-a-classe-java-util-random/26355
 ***/
public static void main(String[] args) {

    Random random = new Random();
    int numero = random.nextInt(0,10);
    int count = 0;
    boolean acertou = false;

    while(!acertou){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um palpite");
        int numeroTentativa = sc.nextInt();

        if(numero == numeroTentativa) {
            System.out.println("Aha voce Acertou !");

            acertou = true;
        }
        else if(numero < numeroTentativa) {
            System.out.println(" Beeem o numero digitado é menor do que o que você informou");
        }
        else if(numero > numeroTentativa) {
            System.out.println(" Beeem o numero digitado é maior do que o que você informou");
        }
    }
    }
}
