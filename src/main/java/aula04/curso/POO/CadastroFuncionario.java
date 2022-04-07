package aula04.curso.POO;

public class CadastroFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario jonathan = new Funcionario(1, 28, "Jonathan", "Desenvolvedor", 2000.0, "Pereira");
		
		jonathan.setSobrenome("Ferreira");
		
		System.out.println(jonathan.getIdade());
		
		double salarioMes04 = CalculadoraDeSalarioNaoCoesa.calcula(jonathan);
		System.out.println("Salario do m�s de 04: " + salarioMes04);
		
		jonathan.setSalario(900.0);
		double salarioMes05 = CalculadoraDeSalarioCoesa.calcula(jonathan);
		System.out.println("Salario do m�s de 05: " + salarioMes05);
		
		
		jonathan.setSalario(3200.0);
		double salarioMes06 = jonathan.salarioComBonus(Cargo.DESENVOLVEDOR);
		System.out.printf("Salario do m�s de 06: %1.2f%n",+ salarioMes06);
		
		jonathan.setSalario(4000.0);
		double salarioMes07 = CalculadoraDeSalarioCoesa2.calcula(jonathan);
		System.out.printf("Salario do m�s de 06: %1.2f%n",+ salarioMes07);
		
	}

}
