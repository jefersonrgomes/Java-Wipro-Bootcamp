package aula04.atividades.historia03;

public class TrianguloRetangulo extends FormaBase implements FormaGeometrica{

    public TrianguloRetangulo(String cor, int quantidadeDeLados) {
        super(cor, quantidadeDeLados);
    }

    @Override
    public void calculoDeArea(){
        System.out.println("Teste de Retorno método Triangulo");
    }
}
