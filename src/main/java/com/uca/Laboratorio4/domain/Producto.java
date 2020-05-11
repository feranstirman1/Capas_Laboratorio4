package com.uca.Laboratorio4.domain;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Producto {

	@Size(message="Este campo no debe tener mas de 15 caracteres",max=15)
	@NotEmpty
	private String nombre;
	
	@Size(message="Este campo no debe tener mas de 30 caracteres",max=30)
	@NotEmpty
	private String descripcion;
	
	@NotNull
	@Min(value=0,message="el precio no debe ser negativo")
	private Double precio;
	
	@NotEmpty(message="este campo no puede estar vacio")
	@Pattern(regexp= "^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$",message="Ingrese una fecha valida")
	private String vencimiento;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getVencimiento() {
		return vencimiento;
	}
	public void setVencimiento(String vencimiento) {
		this.vencimiento = vencimiento;
	}
	
	
	
}
