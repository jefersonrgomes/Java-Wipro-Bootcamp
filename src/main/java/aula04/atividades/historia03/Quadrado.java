package aula04.atividades.historia03;

public class Quadrado extends FormaBase implements FormaGeometrica{


    public Quadrado(String cor, int quantidadeDeLados) {
        super(cor, quantidadeDeLados);
    }

    @Override
    double area(double a,double b, double c) {
        return c;
    }
    @Override
    public void calculoDeArea() {
        System.out.println("Teste de Retorno método Quadrado - Ok chamando polimorfismo corretamente");
       }


}
