package Implementacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Dominio.Panes;
import Interface.Metodos;
import Interface.Metodos2;

public class LogicaMetodos implements Metodos, Metodos2 {
	
	Panes pan1 = null;
	private List<Panes> lista = new ArrayList<Panes>();

	//Validar---que el nombre no se repita, guardamos
	@Override
	public void guardar(Panes pan) {
		// TODO Auto-generated method stub
		//1.-Recorrer los registros de la lista
		//2.-Para despues comparar cada registro
		//3.-Bandera
		
		boolean bandera = false;
		for(Panes p : lista) {
			//Condicion para comparar si se envuentra otro registro con ese dato
			if (p.getNombre().equals(pan.getNombre())) {
				//Ese pan ya existe
				System.out.println("Ese nombre de pan ya existe no se puede guardar ");
				bandera = true;
				break;//sale del ciclo ya no sigue buscando
			}
		}
		
		if (bandera == false) {
			lista.add(pan);
			System.out.println("Se guardo con exito ");
			
		}
	}

	@Override
	public List<Panes> mostrar() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public Panes buscarXindice(int indice) {
		// TODO Auto-generated method stub
		return lista.get(indice);
	}
	
	//Excepcion de errores
	@Override
	public void editar(int indice, Panes pan) {
		// TODO Auto-generated method stub
		lista.set(indice, pan);
		
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		lista.remove(indice);
		
	}

	@Override
	public Panes buscarXnombre(String nombre) {
		// TODO Auto-generated method stub
		for(Panes p : lista) {
			if(p.getNombre().equals(nombre)) {
				//System.out.println(p);
				return p;
			}
		}	 
		System.out.println("No se encontro un pan con ese nombre");
		return null;
	}

	@Override
	public void buscarXsbor(String sabor) {
		// TODO Auto-generated method stub
		boolean bandera = false;
		for(Panes p : lista) {
			if(p.getSabor().equals(sabor)) {
				
				System.out.println(p);
				bandera = true;
			}
			if(!bandera) 
				System.out.println("No se encontro un pan con ese sabor");
		}
	}

	@Override
	public float calcDineroInv() {
		// TODO Auto-generated method stub
		//Panes p = new Panes();
		float resultado = 0;
		for(Panes pe : lista) {
			resultado +=( pe.getPrecio())*pe.getExistencia();
		}
		return resultado;
	}

	@Override
	public void editarPorNombre(String nombre, float nuevoPrecio) {
		
		Panes panEncontrado = buscarXnombre(nombre);
		if (panEncontrado != null) {
			panEncontrado.setPrecio(nuevoPrecio);
			System.out.println("Precio actualizado correctamente ");
		}
		
	}

	@Override
	public void eliminarXnombre(String nombre) {
		// TODO Auto-generated method stub
		//Eliminar por nombre
		Panes panEncontrado = buscarXnombre(nombre);
		if (panEncontrado != null) {
			lista.remove(panEncontrado);
			System.out.println("Se elimino correctamente el pan");
		}
		
	}
	
	
	
	

}
