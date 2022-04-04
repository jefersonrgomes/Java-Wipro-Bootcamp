package aula03.atividades;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Scanner;

public class ProjetoMercadoDigital {
    public static void main(String... args) {

/*** PROJETO MERCADO DIGITAL COM CARRINHO DE COMPRAS

 Faremos uma Loja virtual com Carrinho de Compras!!!

 Em resumo vamos buscar produtos por código, adicionar quantidades dos itens selecionados, somar os
 preços de diversos itens que queremos comprar e adicionar desconto dependendo da forma do
 pagamento.

 Requisitos:
 [x] - A nossa loja deve conter estoque;
 [x] - Caso produto esteja indisponível deve retornar a mensagem para o cliente “Produto Indisponível”;

 [x] - Deverá ter 3 formas de pagamento;
 [x] - À vista (dinheiro, pix ou cartão MasterdCard) tem 20% de desconto;
 [] - À vista no crédito tem 10% de desconto;
 [] - Parcelado em até 3x não tem desconto;

 [] - Deve retornar a nota fiscal com o valor pago de tributos de 9% sobre a compra
 ATENÇÂO: (Esse valor não deve ser somado ao total do carrinho, somente ser exibido na nota fiscal);

 [x] - Caprichem no README lá vocês podem contar como fizeram e como foi o trabalho em equipe.
 [x] - O Projeto pode ser feito somente em uma classe ou da forma que acharem melhor;
 [x] - O PROGRAMA TEM QUE RODAR NO CONSOLE.

 HELPERS
 Usando Objetos como valor no Map<k,v>
 https://pt.stackoverflow.com/questions/257120/%C3%89-possivel-hashmap-com-varios-valores

 Conhecendo a interface Map<k,v>
 https://www.devmedia.com.br/conhecendo-a-interface-map-do-java/37463
 https://www.alura.com.br/artigos/iterando-por-um-hashmap-em-java?gclid=Cj0KCQjw6J-SBhCrARIsAH0yMZjWlIxQjs5YxdCBoQFQlz1BzMRVEnwH0ab2HRf0mVmGnnBq_DS75ckaAvOfEALw_wcB

 ***/
        //VARIAVEIS DE CONTROLE PARA OS ITENS DO MERCADO
        String[] produtos = {"Leite", "Cereal", "Arroz", "Atum", "Feijão", "Azeite", "Óleo", "Sabão", "Sal", "Açucar"};
        Integer [] estoque = {10,10,10,10,10,10,10,10,10,10};
        Float [] precos = {4.57f, 3.02f,9.43f,3.55f,6.55f,4.55f,7.33f,1.99f,3.82f,4.29f };

        //VARIAVEIS DE CONTROLE PARA CARRINHO DE COMPRA
        ArrayList<Integer> carrinhoCodigoProduto = new ArrayList<>();
        ArrayList<Integer> carrinhoQuantidade = new ArrayList<>();

        presentation();
        pratileiraMercado(produtos, estoque, precos, carrinhoCodigoProduto, carrinhoQuantidade);


    }

    // === === === METODOS === === === ===
    // PRATILEIRA DO MERCADO
    public static void pratileiraMercado(
            String[] produtos,
            Integer [] estoque,
            Float [] precos,
            ArrayList<Integer> carrinhoCodigoProduto,
            ArrayList<Integer> carrinhoQuantidade)
    {
        boolean checker = false;
        do {

            int choice;
            int code = 0, quantidade = 0;

            System.out.printf("%n\t\t\t WIPRO STORE%n");
            System.out.println("--- --- --- --- --- --- --- --- --- --- --- ---");
            System.out.printf("CODIGO\t\tPRODUTO \t QUANTIDADE \t PREÇO %n");
            for (int x = 0; x < produtos.length; x++) {
                System.out.printf("  %s \t\t %s\t\t\t %s \t\t %5.2f%n", x + 1, produtos[x], estoque[x], precos[x]);
            }
            System.out.printf("--- --- --- --- --- --- --- --- --- --- --- ---\n");

            code = validaEntradaDoUsuarioSeInteiro("\nCOD PROD\nDigite o código do produto desejado: ", "\nERROR - Valor Invalido\nO valor digitado não corresponde a nenhum produto da prateleira!\nInforme um valor numerico entre 1 a 10", "[0-9]*");
            code -= 1;
            if (code >= produtos.length || code < 0) {
                System.out.println("O produto informado não esta na lista no momento, selecione outro produto");
                continue;
            }
            else
            {
                carrinhoCodigoProduto.add(code);
            }

            quantidade = validaEntradaDoUsuarioSeInteiro("\nQTN PROD\nDigite a quantidade que deseja colocar no carrinho: ", "\nERROR - Valor Invalido\nInforme um valor numerico entre 1 a 10");

            if (estoque[code] == 0) {
                System.out.println("A quantidade informada é maior do que o numero disponivel em estoque");
                continue;
            } else if (quantidade > estoque[code]) {
                System.out.println("A quantidade informada é maior do que o numero disponivel em estoque");
                continue;
            }
            else
            {
                carrinhoQuantidade.add(quantidade);
                estoque[code] -= quantidade;
            }

            System.out.println("Deseja continuar as compras?");
            System.out.printf("--- --- --- --- --- --- --- --- --- ---%n");
            choice = validaEntradaDoUsuarioSeInteiro(
            "Opção Invalida",
            "[1] - Incluir mais itens no seu carrido.\n[2] - Ir para carrinho de compras e formas de pagamento.\n",
            "--- --- --- --- --- --- --- --- --- ---",
            "[1-2]" );

            if (choice == 1) {
                System.out.println("Voltando a prateleira de produtos");
                continue;
            }
            else if(choice == 2)
            {
                carrinhoDeCompras(carrinhoCodigoProduto,carrinhoQuantidade,produtos,precos);
                checker = true;
            }
        }while(!checker);
    }



    //METODO VALIDA ENTRADA DO USUARIO SE É NUMERO INTEIRO - 1
    public static int validaEntradaDoUsuarioSeInteiro(
            String textIn,
            String textOut)
    {
        Scanner nv = new Scanner(System.in);
        String valorDigitado;
        boolean checker=false;
        int inteiroRetorno=0;

        do {
            System.out.println(textIn);
            valorDigitado=nv.next();
            if(valorDigitado.matches("[0-9]*")) {
                inteiroRetorno = Integer.parseInt(valorDigitado);
                checker = true;
            }
            else{
                System.out.println(textOut);
                continue;
            }
        }while(!checker);
        return inteiroRetorno;
    }

    //METODO VALIDA ENTRADA DO USUARIO SE É NUMERO INTEIRO - 2
    public static int validaEntradaDoUsuarioSeInteiro(
            String txtAlert,
            String textIn,
            String textOut,
            String regex)
    {
        Scanner nv = new Scanner(System.in);
        String valorDigitado;
        boolean checker=false;
        int inteiroRetorno=0;

        do {
            System.out.println(textIn);
            valorDigitado=nv.next();
            if(valorDigitado.matches(regex)) {
                inteiroRetorno = Integer.parseInt(valorDigitado);
                checker = true;
            }
            else{
                System.out.println(textOut);
                System.out.println(txtAlert);
                continue;
            }
        }while(!checker);
        return inteiroRetorno;    }

    // METODO CARRINHO DE COMPRAS
    public static boolean carrinhoDeCompras(@NotNull ArrayList<Integer> carrinhoCodigoProduto, ArrayList<Integer> carrinhoQuantidade, String[] produtos, Float[] precos, Integer[] estoque, Integer[] estoqueCopia) {

        float valorTotalDeCompra = 0;
        float valorImposto=0;
        System.out.printf("\t\t ITENS NO CARRINHO%n"+
                "--- --- --- --- --- --- --- --- --- ---%n"+
                "PRODUTO \tPREÇO \tQUANTIDADE \tTOTAL%n");
        for(int i = 0; i < carrinhoCodigoProduto.size(); i++)
        {
            System.out.printf("%s\t\t%s\t\t%s\t\t%s%n",
                    produtos[carrinhoCodigoProduto.get(i)],
                    precos[carrinhoCodigoProduto.get(i)],
                    carrinhoQuantidade.get(i),
                    precos[carrinhoCodigoProduto.get(i)] * carrinhoQuantidade.get(i)
            );
            valorTotalDeCompra += (precos[carrinhoCodigoProduto.get(i)] * carrinhoQuantidade.get(i));
            valorImposto = (9.0f / 100.0f) *valorTotalDeCompra;

        }
        System.out.println("\t\t TOTAL ");
        System.out.printf("TOTAL - O valor total da compra R$: %s%n", valorTotalDeCompra + valorImposto, valorImposto);
        //System.out.printf("IMPOSTOS - Valor total de imposto correspondente a 9 porcento sobre o valor total R$: %s%n", valorImposto);
        //System.out.printf("TOTAL + IMPOSTOS - O valor total da compra com Imposto de 9 porcento é de R$: %s%n", valorTotalDeCompra + valorImposto);
        System.out.printf("%n%n--- --- --- --- --- --- --- --- --- ---%n" +
                "[1] - Escolher forma de pagamento. %n" +
                "[2] - Cancelar compra e esvaziar carrinho. %n" +
                "--- --- --- --- --- --- --- --- --- ---%n%n");
        float desconto = 0.0f;
        float valorASerPago = 0.0f;
        boolean checker = false;
        do {
            Scanner sc = new Scanner(System.in);
            String choice = sc.next();
        if (choice.matches("[1-2]*"))
        {
            if (choice.matches("1"))
            {
                int payMethod = formasDePagamento();

                    if (payMethod == 1) {
                        desconto = ((20.0f / 100) * valorTotalDeCompra);
                        valorASerPago = valorTotalDeCompra - desconto;
                    } else if (payMethod == 2) {
                        desconto = ((10.0f / 100) * valorTotalDeCompra);
                        valorASerPago = valorTotalDeCompra - desconto;
                    }else{
                        desconto = 0.0f;
                        valorASerPago = valorTotalDeCompra;
                    }
                } else if (choice.matches("2")) {
                    carrinhoCodigoProduto.clear();
                    carrinhoQuantidade.clear();
                    System.out.println("Carrinho limpo com sucesso - Obrigado volte sempre");
                    checker = true;
                }
            } else {
                System.out.println("Valor informado não aceito");
                System.out.printf("%n%n--- --- --- --- --- --- --- --- --- ---%n" +
                        "[1] - Escolher forma de pagamento. %n" +
                        "[2] - Cancelar compra e esvaziar carrinho. %n" +
                        "--- --- --- --- --- --- --- --- --- ---%n%n");
            }

            float tributos = 0.09f * valorASerPago;

            //IMPRIMINDO NOTA FISCAL
            System.out.printf("Wipro Store%n" +
                    "Rua dos Bóbos, nº0 - Digital MarketPlace LTDA%n" +
                    "CNPJ:9874561230-00%n%n%n" +
                    "\t\t\tNOTA FISCAL%n" +
                    "===================================================%n" +
                    "PRODUTO\t\tQTND.PRODUTOS\t\tPREÇO UNIT.\t\tPREÇO TOTAL%n%n");
                for (int i = 0; i < carrinhoCodigoProduto.size(); i++) {
                    System.out.printf("%s\t\t%s\t\t%s\t\t%s%n",
                            produtos[carrinhoCodigoProduto.get(i)],
                            carrinhoQuantidade.get(i),
                            precos[carrinhoCodigoProduto.get(i)],
                            precos[carrinhoCodigoProduto.get(i)] * carrinhoQuantidade.get(i)
                    );
                }
                    System.out.printf("\n===================================================\n\n\n" +
                            "DESCONTO NA COMPRA: R$ %5.2f%n" +
                            "VALOR TOTAL A SER PAGO: R$ %5.2f%n" +
                            "VALOR TRIBUTÁRIO: R$ %5.2f", desconto, valorASerPago, tributos);
        } while (!checker);
        return checker;
    }



    // METODO FORMAS DE PAGAMENTO
    public static int formasDePagamento(){
        int choice;
        choice = validaEntradaDoUsuarioSeInteiro("Opção Invalida\nEscolha entre 1 a 4 uma das opções disponiveis para pagamento\n",
                "[1] - À vista em dinheiro/Pix ou cartão MASTERCARD, recebe 20 porcento de desconto\n" +
                      "[2] - À vista no cartão de crédito, recebe 10 porcento de desconto\n" +
                      "[3] - Em três vezes, preço normal de etiqueta sem juros\n" +
                      "Qual seria a forma de pagamento ?",
                "--- --- --- --- --- --- --- --- --- ---",
                "[1-3]");

        return choice;
    }
}