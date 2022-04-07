package aula04.curso.POO.EHP;

public class InicializarProfessor {

		public static void main(String[] args) {
			Professor professorJose = new Professor("Jose", "12345678900", 3500.0, "Hist�ria");
			
			System.out.println("Nome: " + professorJose.nome);
			System.out.println("CPF: " + professorJose.cpf);
		}
}
