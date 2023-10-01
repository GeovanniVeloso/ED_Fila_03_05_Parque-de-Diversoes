package view;

import br.edu.fatec.zl.Fila;
import controller.ParqueController;
import model.Pessoa;

public class Principal {

	public static void main(String[] args) {
		Fila<Pessoa> f = new Fila<Pessoa>();
		Pessoa criança;
		ParqueController pc = new ParqueController();
		String[] nomes = { "Alice", "Bob", "Carlos", "Diana", "Eduarda", "Fernanda", "Gabriel", "Helena", "Igor",
				"Julia", "Kaique", "Larissa", "Marcelo", "Natalia", "Otavio", "Paula", "Quiteria", "Rafael", "Sofia",
				"Thiago", "Ulisses", "Viviane", "Wagner", "Xuxa", "Yasmin", "Zeca", "Amanda", "Bruno", "Catarina",
				"Diego" };

		for (int i = 0; i < 30; i++) {
			criança = new Pessoa(nomes[i], (int) (Math.random() * 31) + 9, (float) ((Math.random() * 0.76) + 1.34));
			f.insert(criança);
		}

		pc.Brinquedo(f);

	}

}
