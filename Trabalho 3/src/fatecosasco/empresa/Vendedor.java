package fatecosasco.empresa;

import java.util.Observable;
import java.util.Observer;

public class Vendedor extends Funcionario implements Observer {

	public Vendedor(long matricula, String nome) {
		super(matricula, nome);
		// implementar
	}

	@Override
	public void trabalhar() {
		// implementar
		
	}

	//metodor da implementação obsever
	@Override
	public void update(Observable o, Object arg) {
		// implementar
		
	}

}
