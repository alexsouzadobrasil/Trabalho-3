package fatecosasco.empresa;

public class Rh {
	private static long proxMatricula=1;
	// metodo que contrata os funcionarios
	public Funcionario Contratar(Formulario form) {
	 switch (form.getCargo()) {
	case "Gerente":
		Funcionario novo=new Gerente(gerarMatricula(), form.getNome());
		break;
	case "Vendendor":
		Funcionario novo2=new Vendedor(gerarMatricula(), form.getNome());
		break;
	case "Repositor":
		Funcionario novo3=new Repositor(gerarMatricula(), form.getNome());
		break;

	}
		return null;
	}

	// metodo que paga os funcionarios
	public void pagar() {
		// implementar

	}
	//gera a matricula
	public long gerarMatricula(){
		proxMatricula+=1;
		return proxMatricula-1;
	}
}
