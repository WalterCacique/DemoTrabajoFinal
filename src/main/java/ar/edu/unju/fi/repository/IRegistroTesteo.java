package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.testeos.model.RegistroTesteo;

public interface IRegistroTesteo {

	public void guardar();
	public RegistroTesteo mostrar();
	public void eliminar ();
	public RegistroTesteo modificar();
}
