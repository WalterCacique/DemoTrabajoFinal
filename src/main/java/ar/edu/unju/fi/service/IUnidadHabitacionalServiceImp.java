package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.repository.IUnidadHabitacional;
import ar.edu.unju.fi.testeos.model.UnidadHabitacional;

@Repository
public class IUnidadHabitacionalServiceImp implements IUnidadHabitacionalService {

	@Autowired
	private IUnidadHabitacional iunidadHabitacional;
	
	@Override
	public void guardar() {
		iunidadHabitacional.guardar();
	}

	@Override
	public UnidadHabitacional mostrar() {
		UnidadHabitacional unidadHabitacional = iunidadHabitacional.mostrar();
		return unidadHabitacional;
	}

	@Override
	public void eliminar() {
		iunidadHabitacional.eliminar();
	}

	@Override
	public UnidadHabitacional modificar() {
		UnidadHabitacional unidadHabitacional = iunidadHabitacional.modificar();
		return unidadHabitacional;
	}

}
