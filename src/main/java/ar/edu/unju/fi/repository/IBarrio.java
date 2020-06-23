package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.testeos.model.Barrio;

public interface IBarrio {
	
	public void guardar();
	public Barrio mostrar();
	public void eliminar ();
	public Barrio modificar();

}
