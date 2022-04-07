package aula04.curso.POO;

public class quinzeOuTrintaPorcento implements RegraDeCalculo {

	public double calcula(Funcionario funcionario) {
		if (funcionario.getSalario() > 2000) {
			return funcionario.getSalario() * 1.15;
		} else {
			return funcionario.getSalario() * 1.30;
		}
	}	
}
