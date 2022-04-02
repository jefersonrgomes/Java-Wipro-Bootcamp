package aula02.atividades.refactor;

import java.util.Scanner;
/***
 HELPERS
 Alura Validação de Strings em Java: https://bit.ly/3iVjQLB
 DevMedia Conceitos básicos sobre Expressões Regulares em Java: https://bit.ly/3K0DGAZ
 DevMedia Try Cath em Java: https://bit.ly/3qWR95A
  ***/
public class TestRefactorAtividade02 {
    public static void main(String[] args) {
        //INSTANCIANDO CLASSE ALUNO
        Aluno aluno1 = new Aluno();

        System.out.printf("Bem vindo a Calculadora de Médias%n1 - Informe o nome do Aluno:%n");
        Scanner sc = new Scanner(System.in);
        aluno1.setNome(sc.next());

        System.out.printf("Informe a Primeira Nota%n");
        aluno1.setNota1(StringValidation());

        System.out.printf("Informe a Segunda Nota%n");
        aluno1.setNota2(StringValidation());

        //CALCULANDO MEDIA
        aluno1.setMedia((aluno1.getNota1() + aluno1.getNota2()) /2);

        //VALIDANDO APROVAÇÃO
        if(aluno1.getMedia() >= 6) aluno1.setStatus("Aprovado");
        else aluno1.setStatus("Reprovado");

        aluno1.boletimEscolar();
    }

    //METHODS
    /*** StringValidation recebe um valor booleano para controle da iteração do laço While.
     * Ao entrar no método, é instanciado a classe Scanner para receber um valor em tela
     * O valor recebido passa por uma validação afim de confirmar se o valor é numerico ou não
     * Caso seja, o valor é convertido para o tipo float e passado para a variavel nt a qual é retornada, e o laço While é interrompido
     * Caso não, é devolvido uma mensagem de Erro e volta para a repetição do Laço While ***/
    public static float StringValidation(){
        boolean checker = false;
        float nt = 0;
        Scanner nc = new Scanner(System.in);
        while (!checker){
            String value = nc.next();
            if (value.matches("[0-9]\\.[0-9]") || value.matches("[0-9]*")){
                nt = Float.parseFloat(value);
                if(nt < 1 || nt > 10){
                    System.out.printf("\uD83D\uDEA8 Atenção%%n\tO valor minimo para uma nota é 1%%nE o valor maximo para uma nota é 10%%n\uD83D\uDCA1 Dica%%n\tTambem são aceitos valores de ponto flutuante entre 1.0 e 9.9%%n--- --- ---%%n".formatted());
                    System.out.printf("⌨ Tente novamente%n\tPara prosseguir digite um valor numerico de 1 a 10 para atribuir a Nota%%n".formatted());
                    continue;
                }
                checker = true;
            }
            else{
                System.out.printf("📌 Atenção%n\tO valor informado não corresponde a um valor numerico%nOu é um valor não aceito para os calculos de média!%nPara prosseguir digite um valor numerico de 1 a 10 para atribuir a Nota%%n".formatted());
            }
        }
        return nt;
    }
}