package aula02.atividades;

public class Candidata {
    //Atributes
    private int Id;
    private String nome;
    private int votos;

    //Constructor
    public Candidata(int numero, String nome, int votos) {
        this.Id = numero;
        this.nome = nome;
        this.votos = votos;
    }

    //Getters and Setters
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }
}
