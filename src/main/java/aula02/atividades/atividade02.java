package aula02.atividades;

import java.util.Scanner;

public class atividade02 {

    /***
     Atividade 2.
        Grupo 06
            Benivaldo Honorio
            Wesley Fernandes
            Viviane Viana
            Natalie Bozzon
            Jeferson Gomes

     [x] Faça um programa para receber o nome de um aluno e informar 2 notas,
     [x] Calcular a média do aluno
     [x] Apresentar ao final a média calculada e a situação de Aprovação do aluno.
     [x] (aprovado com média >= 6).

     * ***/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo a Calculadora de Médias");
        System.out.println("1 - Informe o nome do Aluno:");
        String nomeAluno = sc.next();

        Scanner nt1 = new Scanner(System.in);
        System.out.println("2 - Informe a primeira Nota");
        int nota1 = Integer.parseInt(nt1.next());

        Scanner nt2 = new Scanner(System.in);
        System.out.println("3 - Informe a segunda Nota ");
        int nota2 = Integer.parseInt(nt2.next());

        float media = (nota1 + nota2) / 2;

        if(media >= 6)
        {
            System.out.printf("Parabens você foi aprovado com média %s ! %n", media);
            System.out.printf("Aluno: %s %nNota primeira avaliação: %s%nNota segunda avaliação: 5%nStatus: Aprovado com média final %s%n", nomeAluno, nota1, nota2, media);
        }
        else{
            System.out.println("Não foi desta vez, mas voce pode se preparar e tentar novamente!");
            System.out.printf("Aluno: %s %nNota primeira avaliação: %s%nNota segunda avaliação: 5%nStatus: Reprovado com média final %s%n", nomeAluno, nota1, nota2, media);

        }
    }
}
