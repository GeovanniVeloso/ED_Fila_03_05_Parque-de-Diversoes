package controller;

import br.edu.fatec.zl.Fila;
import model.Pessoa;

public class ParqueController {

	Pessoa cliente;

	public ParqueController() {
		super();
	}

	public void Brinquedo(Fila<Pessoa> f) {
		while (!f.isEmpty()) {
			if (!f.isEmpty()) {
				try {
					cliente = f.remove();
					if (cliente.getAltura() < 1.35) {
						System.out.println("Cliente " + cliente.getNome()
								+ " não pode usar o brinquedo por ter menos de 1,60m de altura.");
					} else {
						if (cliente.getIdade() < 16) {
							System.out.println("Cliente " + cliente.getNome()
									+ " não pode usar o brinquedo por ter menos de 16 anos.");
						} else {
							System.out.println("O cliente " + cliente.getNome() + " usou o brinquedo!");
						}
					}
				} catch (Exception e) {
					System.err.println(e);
				}
			} else {
				System.err.println("Fila Vazia");
			}
		}
	}
}
