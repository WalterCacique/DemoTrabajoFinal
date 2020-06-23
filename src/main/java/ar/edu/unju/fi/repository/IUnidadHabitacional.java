package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.testeos.model.UnidadHabitacional;

public interface IUnidadHabitacional {
	
	public void guardar();
	public UnidadHabitacional mostrar();
	public void eliminar ();
	public UnidadHabitacional modificar();

}
