package aula04.curso.POO;

public class CalculadoraDeSalarioCoesa {

	public static double calcula(Funcionario funcionario) {
		
		if (funcionario.getCargo().toUpperCase().equals("DESENVOLVEDOR")) {
			return new dezOuQuinzeProcento().calcula(funcionario);
		}
		
		if (funcionario.getCargo().equalsIgnoreCase("DBA")) {
			return new quinzeOuTrintaPorcento().calcula(funcionario);
		}
		
		throw new RuntimeException("Funcionario invalido");
	}
	
}
	
	
	
	

