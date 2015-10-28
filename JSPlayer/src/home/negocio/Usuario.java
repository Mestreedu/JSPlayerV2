package home.negocio;


public class Usuario {

	
	private String nome;
	private String email;
	private String localizacao;
	private String sexo;
	private String idade;

	public Usuario(String nome, String email, String localizacao, String sexo, String idade) {

		this.nome = nome;
		this.email = email;
		this.localizacao = localizacao;
		this.sexo = sexo;
		this.idade = idade;

	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public String getSexo() {
		return sexo;
	}

	public String getIdade() {
		return idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String toString() {
		return "\nUsuario: " + nome + "\nEmail: " + email + "\nLocalizacao: " + localizacao + "\nSexo: " + sexo
				+ "\nIdade: " + idade;
	}

	

}
