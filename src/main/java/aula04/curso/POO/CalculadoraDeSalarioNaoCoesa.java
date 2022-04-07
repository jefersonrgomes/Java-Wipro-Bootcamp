package aula04.curso.POO;

public class CalculadoraDeSalarioNaoCoesa {

	public static double calcula(Funcionario funcionario) {
		
		if (funcionario.getCargo().toUpperCase().equals("DESENVOLVEDOR")) {
			return dezOuQuinzeProcento(funcionario);
		}
		
		if (funcionario.getCargo().toUpperCase().equals("DBA")) {
			return quinzeOuTrintaPorcento(funcionario);
		}
		
		return 0;
	}
	
	private static double dezOuQuinzeProcento(Funcionario funcionario) {
		if (funcionario.getSalario() > 1000) {
			return funcionario.getSalario() * 1.10;
		} else {
			return funcionario.getSalario() * 1.15;
		}
	}

	private static double quinzeOuTrintaPorcento(Funcionario funcionario) {
		if (funcionario.getSalario() > 2000) {
			return funcionario.getSalario() * 1.15;
		} else {
			return funcionario.getSalario() * 1.30;
		}
	}
}
	
	
	
	

