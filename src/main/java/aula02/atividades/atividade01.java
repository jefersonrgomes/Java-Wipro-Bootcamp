package aula02.atividades;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class atividade01 {
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
 Recebendo valores em java: https://www.devmedia.com.br/como-funciona-a-classe-scanner-do-java/28448
 Usando numeros randomicos em java: https://www.devmedia.com.br/numeros-aleatorios-em-java-a-classe-java-util-random/26355
 ***/

public static void main(String[] args) {

    Random random = new Random();

    int numero = random.nextInt(9);
    System.out.println(numero);
    boolean acertou = false;
    while(!acertou){
        int numeroTentativa = Integer.parseInt(JOptionPane.showInputDialog("Digite um palpite"));
        //System.out.println(numeroTentativa);
        if(numero == numeroTentativa) {
            JOptionPane.showMessageDialog(null, "Voce Acertou!");
            acertou = true;
        }
        if(numero > numeroTentativa) {
            JOptionPane.showMessageDialog(null, "o numero digitado é menor.");
        }

        if(numero < numeroTentativa) {
            JOptionPane.showMessageDialog(null, "o numero digitado é maior.");
        }
    }
}
}
