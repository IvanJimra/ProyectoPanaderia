package Interface;

import java.util.List;

import Dominio.Panes;

public interface Metodos {
	
	public void guardar(Panes pan);
	
	public List<Panes> mostrar();
	
	public Panes buscarXindice(int indice);
	
	public void editar(int indice, Panes pan);
	
	public void eliminar(int indice);
	
}
