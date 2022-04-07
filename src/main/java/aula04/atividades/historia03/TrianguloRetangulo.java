package aula04.atividades.historia03;

public class TrianguloRetangulo extends FormaBase implements FormaGeometrica{

    public TrianguloRetangulo(String cor, int quantidadeDeLados) {
        super(cor, quantidadeDeLados);
    }

    //Metodos

    //Calculando area do triangulo: Formula -> A = (b*h)/2
    // sendo b = base e h = altura
    double area(int base, int altura) {
        return (base*altura)/2;
    }

    void imprimeArea(int vb, int va){
        System.out.printf("O valor e calculo da area do triangulo retangulo %ntendo base %s e altura %s é de %s", vb, va, area( vb, va));
    }

    @Override
    public void calculoDeArea(){
        System.out.println("Teste de Retorno método Triangulo");
    }
}
