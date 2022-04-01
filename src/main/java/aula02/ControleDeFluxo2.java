package aula02;

public class ControleDeFluxo2 {

	public static void main(String[] args) {

//		for(express�o1; express�o2; express�o3) {
//			bloco de instru��es;
//		}

		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		String[] nomes = {"Ana", "Joana", "Jenifer", "Maria"};
		for (String i : nomes) {
		  System.out.println(i);
		}

//		while (condi��o) {
//			bloco de instru��es;
//		}
		
		int i = 0;
		while (i < 5) {
		  System.out.println(i);
		  i++;
		}

//		do {
//		bloco de instru��es;
//		}
//		while (condi��o);
		
		int j = 1;
		do{
			System.out.println(j);
		}while(j !=0 );
	}

}
