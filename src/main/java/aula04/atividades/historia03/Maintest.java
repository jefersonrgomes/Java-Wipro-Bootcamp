package aula04.atividades.historia03;

public class Maintest {


    public static void main(String[] args) {

        Quadrado meuQuadrado = new Quadrado("azul", 4);

        TrianguloRetangulo meuTriangulo = new TrianguloRetangulo("amarelo", 3);

        meuQuadrado.calculoDeArea();
        meuTriangulo.calculoDeArea();

        meuQuadrado.area(12);
        meuQuadrado.area(52);

        meuTriangulo.imprimeArea(4,2);
        meuQuadrado.imprimeArea(5);
    }

}
