package aula02.atividades;
import java.util.Scanner;

public class Atividade02 {
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

     HELPERS:
     Recebendo valores em java com método Scanner(): https://www.devmedia.com.br/como-funciona-a-classe-scanner-do-java/28448
    ***/
    public static void main(String[] args) {

        System.out.printf("Bem vindo a Calculadora de Médias%n1 - Informe o nome do Aluno:%n");
        Scanner sc = new Scanner(System.in);
        String nomeAluno = sc.next();

        System.out.printf("2 - Informe a primeira Nota%n");
        float nota1 = Float.parseFloat(sc.next());

        System.out.printf("3 - Informe a segunda Nota%n");
        float nota2 = Float.parseFloat(sc.next());

        float media = (nota1 + nota2) / 2;

        if(media >= 6)
        {
            System.out.printf("Parabens você foi Aprovado %n" +
                    "| Historico Escolar %n" +
                    "| Nome do Aluno | %s %n" +
                    "| Primeira Nota | %s %n" +
                    "| Segunda Nota  | %s %n" +
                    "| Média Final   | %s %n" +
                    "|--- --- --- --- --- --- %n" +
                    "| Status        | Aprovado %n" +
                    "|--- --- --- --- --- --- %n", nomeAluno , nota1 , nota2 , media);
        }
        else{ System.out.printf("Não foi desta vez, mas voce pode se preparar e tentar novamente!%n" +
                "%n" +
                "| Historico Escolar %n" +
                "| Nome do Aluno | %s %n" +
                "| Primeira Nota | %s %n" +
                "| Segunda Nota  | %s %n" +
                "| Média Final   | %s %n" +
                "|--- --- --- --- --- --- %n" +
                "| Status        | Reprovado %n" +
                "|--- --- --- --- --- --- %n", nomeAluno , nota1 , nota2 , media);
        }
    }
}
