package dominio;

import java.util.ArrayList;
import java.util.List;

public class Pergunta {
	private int identificacao;
	private String enunciado;
	private  List<String> alternativas = new ArrayList<>();
	
	public Pergunta() {
		
	}
	
	public Pergunta(String enunciado) {
		this.enunciado = enunciado;
	}

	public int getId() {
		return identificacao;
	}

	public void setId(int id) {
		this.identificacao = id;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
}
