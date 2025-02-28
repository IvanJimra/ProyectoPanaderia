package Dominio;

import java.time.LocalDate;

public class Panes {
	private String nombre;
	private float precio;
	private int existencia;
	private String sabor;
	private LocalDate fechaLabo;
	
	public Panes() {
	}

	public Panes(String nombre, float precio, int existencia, String sabor, LocalDate fechaLabo) {
		this.nombre = nombre;
		this.precio = precio;
		this.existencia = existencia;
		this.sabor = sabor;
		this.fechaLabo = fechaLabo;
	}

	@Override
	public String toString() {
		return "Panes [nombre=" + nombre + ", precio=" + precio + ", existencia=" + existencia + ", sabor=" + sabor
				+ ", fechaLabo=" + fechaLabo + " \n]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getExistencia() {
		return existencia;
	}

	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public LocalDate getFechaLabo() {
		return fechaLabo;
	}

	public void setFechaLabo(LocalDate fechaLabo) {
		this.fechaLabo = fechaLabo;
	}
	
	
	
	
	
	

}
