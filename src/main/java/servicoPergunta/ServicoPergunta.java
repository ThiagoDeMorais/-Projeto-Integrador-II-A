package servicoPergunta;

import dominio.Pergunta;
import repositorioPergunta.RepositorioPergunta;

public class ServicoPergunta {
	public static void salvar(Pergunta pergunta) {
		RepositorioPergunta.salvar(pergunta);
	}
}
