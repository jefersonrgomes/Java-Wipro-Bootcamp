package aula04.curso.POO;

public enum Cargo {

	DESENVOLVEDOR(new dezOuQuinzeProcento()),
	DBA(new quinzeOuTrintaPorcento()),
	PROFESSOR(new quinzeOuTrintaPorcento());
	
	private RegraDeCalculo regra;
	
	Cargo(RegraDeCalculo regra) {
		this.regra = regra;
	}
	
	public RegraDeCalculo getRegra() {
		return regra;
	}
}
