package home.dados;

import java.util.ArrayList;

import home.negocio.beans.Musica;

public interface IRepositorioMusica {
	
	public void salvar();
	
	public void cadastrar(Musica mus);
	
	public void remover(Musica s);
	
	public Musica procurar(String titulo, String artista);
	
	public void printar();
	
	public void ordenarMusicas(Musica m);
	
	public String[] retornaMusicas();
	
	public ArrayList<Musica> getMusicas();

}
