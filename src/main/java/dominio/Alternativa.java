package dominio;

public class Alternativa {
	private Integer id;
	private String conteudo;
	private boolean ehVerdadeira;
	private Integer pergunta;
	
	public Alternativa() {
		
	}

	public Alternativa(String conteudo, boolean ehVerdadeira, Integer pergunta) {
		this.conteudo = conteudo;
		this.ehVerdadeira = ehVerdadeira;
		this.pergunta = pergunta;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public boolean isEhVerdadeira() {
		return ehVerdadeira;
	}

	public void setEhVerdadeira(boolean ehVerdadeira) {
		this.ehVerdadeira = ehVerdadeira;
	}

	public Integer getPergunta() {
		return pergunta;
	}

	public void setPergunta(Integer pergunta) {
		this.pergunta = pergunta;
	}
	
}
