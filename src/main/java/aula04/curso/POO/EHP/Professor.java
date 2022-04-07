package aula04.curso.POO.EHP;

public class Professor extends Pessoa {
	
	public double salario;
	public String disciplina;
	
	
	public Professor(String nome, String cpf, double salario, String disciplina) {
		super(nome, cpf);
		this.salario = salario;
		this.disciplina = disciplina;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
}
