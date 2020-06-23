package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.repository.IBarrio;
import ar.edu.unju.fi.testeos.model.Barrio;

@Repository
public class IBarrioServiceImp implements IBarrioService {

	@Autowired
	private IBarrio ibarrio;
	
	@Override
	public void guardar() {
		ibarrio.guardar();
	}

	@Override
	public Barrio mostrar() {
		Barrio barrio = ibarrio.mostrar();
		return barrio;
	}

	@Override
	public void eliminar() {
		ibarrio.eliminar();
	}

	@Override
	public Barrio modificar() {
		Barrio barrio = ibarrio.modificar();
		return barrio;
	}

}
