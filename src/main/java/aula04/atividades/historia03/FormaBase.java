package aula04.atividades.historia03;

public abstract class FormaBase {

    //Atributos
    private String cor;
    private int quantidadeDeLados;

    //Construtor
    public FormaBase(String cor, int quantidadeDeLados) {
        this.cor = cor;
        this.quantidadeDeLados = quantidadeDeLados;
    }

    //Getters and Setters
    public String getCor() {
        return cor;
    }

    public String setCor() {
        this.cor = cor;
        return null;
    }

    public int getQuantidadeDeLados() {
        return quantidadeDeLados;
    }

    public void setQuantidadeDeLados(int quantidadeDeLados) {
        this.quantidadeDeLados = quantidadeDeLados;
    }

    //Metodo de classe Abstrata
    double area(double a, double b) {
        return 0;
    }

    /*

    print ("Digite o valor do raio: "); raio = a;
    System. out. printf ("O diamentro e: %d\n", (
    2 * raio.
    * */

}
