package aula04.atividades.historia03;

public class Quadrado extends FormaBase implements FormaGeometrica{
    public Quadrado(String cor, int quantidadeDeLados) {
        super(cor, quantidadeDeLados);
    }

    //Metodo para calcular area do Quadrado
    double area(int base) {
        return Math.pow(base, 2);
      //  A = (b*h)/2 sendo b = base e h = altura
    }


    void imprimeArea(int vb){
        System.out.printf("O valor e calculo da area do Quadrado%nTendo base %s é de %s", vb, area( vb));
    }

    @Override
    public void calculoDeArea() {
        System.out.println("Teste de Retorno método Quadrado - Ok chamando polimorfismo corretamente");
       }


}
