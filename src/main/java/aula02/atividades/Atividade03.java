package aula02.atividades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade03 {
    /***
     Atividade 3.
        Grupo 06
            Benivaldo Honorio
            Wesley Fernandes
            Viviane Viana
            Natalie Bozzon
            Jeferson Gomes

     [x] Faça um programa para receber os nomes de 4 candidatos a líder de uma turma
     [x] Em seguida receber os votos dos alunos existentes na sala,
     [x] e ao final mostrar o total de votos de cada candidato e ainda o candidato vencedor da eleição.

     ***/
    public static void main(String[] args) {
        int idVendedor = 0;
        Candidata candidata1 = new Candidata(1, "Ana", 0);
        Candidata candidata2 = new Candidata(2, "julia", 0);
        Candidata candidata3 = new Candidata(3, "maria", 0);
        Candidata candidata4 = new Candidata(4, "camila", 0);

        List<Candidata> candidatos = new ArrayList<>();

        candidatos.add(candidata1);
        candidatos.add(candidata2);
        candidatos.add(candidata3);
        candidatos.add(candidata4);

        boolean votosFinalizados = false;

        while(!votosFinalizados) {
            System.out.println("digite 1 -- candidata Ana. \n"
                    + "digite 2 -- candidata julia. \n"
                    + "digite 3 -- candidata maria. \n"
                    + "digite 4 -- candidata camila. \n"
                    + "digite 0 -- finalizar votação");

            Scanner scan = new Scanner(System.in);
            int voto = Integer.parseInt(scan.next());

            if(voto > 0) {
                candidatos.forEach(candidato -> {
                    if(candidato.getId() == voto) {
                        candidato.setVotos(candidato.getVotos() + 1);
                    }
                });
            }
            else{
                votosFinalizados = true;
            }
        }

        int qtdVotos = 0;
        for(Candidata candidataComp : candidatos) {
            if(candidataComp.getVotos() > qtdVotos) {
                idVendedor = candidataComp.getId();
                qtdVotos = candidataComp.getVotos();
            }
        }
        for(Candidata candidataVencedor : candidatos) {
            if(candidataVencedor.getId() == idVendedor) {
                System.out.println("Candidato Vencedor: "+candidataVencedor.getNome() +
                        "\nQuantidade de votos: "+candidataVencedor.getVotos());
            }
        }
    }
}