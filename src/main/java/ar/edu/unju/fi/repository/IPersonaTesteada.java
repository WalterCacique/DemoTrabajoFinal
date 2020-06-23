package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.testeos.model.PersonaTesteada;

public interface IPersonaTesteada {

	public void guardar();
	public PersonaTesteada mostrar();
	public void eliminar ();
	public PersonaTesteada modificar();
}
