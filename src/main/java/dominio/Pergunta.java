package dominio;

import java.util.ArrayList;
import java.util.List;

public class Pergunta {
	private int id;
	private String enunciado;
	private  List<String> alternativas = new ArrayList<>();
	
	public Pergunta() {
		
	}
	
	public Pergunta(String enunciado) {
		this.enunciado = enunciado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
}
