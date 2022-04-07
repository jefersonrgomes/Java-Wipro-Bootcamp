package aula04.atividades.historia03;

public class Maintest {


    public static void main(String[] args) {

        Quadrado meuQuadrado = new Quadrado("azul", 4);

        TrianguloRetangulo meuTriangulo = new TrianguloRetangulo("amarelo", 3);

        meuQuadrado.calculoDeArea();
        meuTriangulo.calculoDeArea();

        meuQuadrado.area(12,3,4);
    }

}
