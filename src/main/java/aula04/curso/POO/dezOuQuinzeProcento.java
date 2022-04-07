package aula04.curso.POO;

public class dezOuQuinzeProcento implements RegraDeCalculo {

	public double calcula(Funcionario funcionario) {
		if (funcionario.getSalario() > 1000) {
			return funcionario.getSalario() * 1.10;
		} else {
			return funcionario.getSalario() * 1.15;
		}
	}

}
