package fatecosasco.empresa;

import java.util.Observable;
import java.util.Observer;

public class Repositor extends Funcionario implements Observer {

	public Repositor(long matricula, String nome) {
		super(matricula, nome);
		// impplementar
	}

	@Override
	public void trabalhar() {
		// implementar
		
	}

	@Override
	public void update(Observable o, Object arg) {
		// implementar
		
	}

}
