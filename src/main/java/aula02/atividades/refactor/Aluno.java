package aula02.atividades.refactor;

import java.util.Arrays;

public class Aluno {
    //Atributes
    private String nome;
    private float nota1 = 0, nota2 = 0, media = 0;
    private String status = "Cursando";

    //Constructors
    public Aluno() {    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    //Methods
    public void boletimEscolar() {
        if(status.matches("Aprovado")) System.out.println("Parabens você foi Aprovado 🎉 🎊");
        else System.out.println("Infelizmente você reprovou, nos vemos na recuperação 📚 😥");

        System.out.printf(
                " Boletim Escolar %n" +
                " Nome do Aluno\t:\t %s %n" +
                " Primeira Nota\t:\t %s %n" +
                " Segunda Nota\t:\t %s %n" +
                " Média Final\t:\t %s %n" +
                " --- --- --- %n" +
                " Status\t:\t %s %n" +
                " --- --- --- %n", nome, nota1, nota2, media, status);
        if(status.matches("Aprovado")) System.out.printf("Aluno Liberado para Ferias 🎉 🎊%n%n");
        else System.out.printf("Aluno em Recuperação 📚 📚%n%n");
    }
}
